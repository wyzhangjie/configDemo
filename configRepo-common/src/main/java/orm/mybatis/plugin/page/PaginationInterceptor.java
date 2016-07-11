/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package orm.mybatis.plugin.page;

import cn.vansky.framework.core.orm.mybatis.plugin.page.*;
import cn.vansky.framework.core.orm.mybatis.plugin.page.Pagination;
import cn.vansky.framework.core.orm.mybatis.plugin.page.SQLHelp;
import cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.DialectType;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.sql.Connection;
import java.util.Properties;

/**
 * 数据库分页插件，只拦截查询语句.
 * Author: CK
 * Date: 2015/6/14
 */
@Intercepts({ @Signature(type = Executor.class, method = "query",
        args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class }) })
public class PaginationInterceptor extends cn.vansky.framework.core.orm.mybatis.plugin.page.BaseInterceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        if (mappedStatement.getId().matches(_SQL_PATTERN)) {
            // 拦截需要分页的SQL
            Object parameter = invocation.getArgs()[1];
            BoundSql boundSql = mappedStatement.getBoundSql(parameter);
            String originalSql = boundSql.getSql().trim();
            Object parameterObject = boundSql.getParameterObject();
            if (StringUtils.isBlank(boundSql.getSql())) {
                return null;
            }

            // 分页参数--上下文传参
            Pagination<Serializable> page = null;

            // map传参每次都将currentPage重置,先判读map再判断context
            if (parameterObject != null) {
                page = convertParameter(parameterObject, page);
            }

            // 后面用到了context的东东
            if (page != null) {
                int totPage = page.getTotal();
                // 得到总记录数
                if (totPage <= 0) {
                    Connection connection = mappedStatement.getConfiguration().getEnvironment().getDataSource()
                            .getConnection();
                    totPage = cn.vansky.framework.core.orm.mybatis.plugin.page.SQLHelp.getCount(originalSql, connection, mappedStatement, parameterObject, boundSql);
                }

                // 分页计算
                page.init(totPage, page.getLimit(), page.getCurrentPage());

                // 分页查询 本地化对象 修改数据库注意修改实现
                if (null == DIALECT) {
                    String databaseId = mappedStatement.getConfiguration().getDatabaseId();
                    DIALECT = DialectType.getDialect(databaseId);
                }

                String pageSql = cn.vansky.framework.core.orm.mybatis.plugin.page.SQLHelp.generatePageSql(originalSql, page, DIALECT);
                log.info("分页SQL:" + pageSql);
                invocation.getArgs()[2] = new RowBounds(RowBounds.NO_ROW_OFFSET, RowBounds.NO_ROW_LIMIT);
                BoundSql newBoundSql = SQLHelp.createNewBoundSql(mappedStatement, boundSql.getParameterObject(),
                        boundSql, pageSql);
                MappedStatement newMs = copyFromMappedStatement(mappedStatement, new BoundSqlSqlSource(newBoundSql));

                invocation.getArgs()[0] = newMs;
            }
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    private MappedStatement copyFromMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
        MappedStatement.Builder builder = new MappedStatement.Builder(ms.getConfiguration(),
                ms.getId(), newSqlSource, ms.getSqlCommandType());
        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        String[] keyProperties = ms.getKeyProperties();
        builder.keyProperty(StringUtils.join(keyProperties, ','));
        builder.timeout(ms.getTimeout());
        builder.parameterMap(ms.getParameterMap());
        builder.resultMaps(ms.getResultMaps());
        builder.cache(ms.getCache());
        return builder.build();
    }

    public static class BoundSqlSqlSource implements SqlSource {
        BoundSql boundSql;

        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }

        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }
}
