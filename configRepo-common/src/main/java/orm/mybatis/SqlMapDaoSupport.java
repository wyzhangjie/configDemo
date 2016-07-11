/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package orm.mybatis;

import cn.vansky.framework.core.orm.mybatis.BatchSqlSessionTemplateWrapper;
import cn.vansky.framework.core.orm.mybatis.BatchSqlSupportSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.dao.support.DaoSupport;
import org.springframework.util.Assert;

/**
 * 扩展dao支持
 * Author: CK
 * Date: 2015/6/5.
 */
public abstract class SqlMapDaoSupport extends DaoSupport {

    private BatchSqlSupportSession sqlSession;

    protected final void setSqlSessionFactoryInternal(SqlSessionFactory sqlSessionFactory) {
        this.sqlSession = new BatchSqlSessionTemplateWrapper(sqlSessionFactory);
    }

    public abstract void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory);

    /**
     * {@inheritDoc}
     */
    protected void checkDaoConfig() {
        Assert.notNull(this.sqlSession, "Property 'sqlSessionFactory' are required");
    }

    /**
     * 获取批量的SqlSession，SqlSession被spring事务管理，不需要提交、回滚、关闭。
     *
     * @return Spring managed thread safe SqlSession
     */
    public final BatchSqlSupportSession getSqlSession() {
        return this.sqlSession;
    }
}
