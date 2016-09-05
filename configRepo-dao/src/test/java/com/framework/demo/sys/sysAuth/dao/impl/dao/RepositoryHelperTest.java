package com.framework.demo.sys.sysAuth.dao.impl.dao;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.callback.DefaultSearchCallback;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.callback.SearchCallback;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.utils.SearchableConvertUtils;
import cn.vansky.framework.core.orm.mybatis.plugin.page.SQLHelp;
import cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.Dialect;
import cn.vansky.framework.core.orm.mybatis.plugin.page.dialect.MySQLDialect;
import com.framework.demo.bo.sysUser.SysUser;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author hyssop
 * @Description
 * @date 2016/6/30 0030
 * To change this template use File | Settings | File Templates.
 */

public class RepositoryHelperTest extends TestCase {



    @Test
    public void testSynchronizedData() throws Exception {
        SQLHelp repositoryHelper = new SQLHelp();
        SearchCallback searchCallback = new DefaultSearchCallback();
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