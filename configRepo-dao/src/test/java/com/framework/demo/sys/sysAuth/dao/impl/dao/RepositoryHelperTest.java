package com.framework.demo.sys.sysAuth.dao.impl.dao;


import com.github.fartherp.framework.database.mybatis.plugin.page.dialect.Dialect;
import com.github.fartherp.framework.database.mybatis.plugin.page.dialect.MySQLDialect;
import com.github.fartherp.framework.database.mybatis.plugin.search.SqlFacade;
import com.github.fartherp.framework.database.mybatis.plugin.search.resolver.DefaultSqlResolver;
import com.github.fartherp.framework.database.mybatis.plugin.search.utils.SearchableConvertUtils;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Sort;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.core.convert.support.DefaultConversionService;



/**
 * @author hyssop
 * @Description
 * @date 2016/6/30 0030
 * To change this template use File | Settings | File Templates.
 */

public class RepositoryHelperTest extends TestCase {



    @Test
    public void testSynchronizedData() throws Exception {
        SqlFacade repositoryHelper = new SqlFacade();
        DefaultSqlResolver searchCallback = new DefaultSqlResolver("");
        String sql ="select * from table";

        Searchable searchable = Searchable.newSearchable();
        searchable.setPage(0, 10);
        searchable.addSort(Sort.Direction.DESC, "id");
        searchable.addSort(Sort.Direction.ASC, "username");
        searchable.addSearchParam("username_like", "zhang");
        searchable.addSearchParam("email_eq", "dezhjie@163.com");
        searchable.addSearchParam("id_in", new String[]{"1", "2", "3"});
        SearchableConvertUtils searchableConvertUtils = new SearchableConvertUtils();
        searchableConvertUtils.setConversionService(new DefaultConversionService() );
        Dialect mySQLDialect = new MySQLDialect();
        String sql1 = repositoryHelper.generateRealSql(sql, searchable, mySQLDialect);
        System.out.println(sql1);
    }






}