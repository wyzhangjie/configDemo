package com.framework.demo.sys.sysAuth.dao.impl;

import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/28 0028
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/conf/service/applicationContext-test.xml" })
@Transactional
@TransactionConfiguration(defaultRollback=true)

public class SysAuthDaoImplTest extends TestCase {


    public void testFindStringRoles() throws Exception {
        //mybatis的配置文件applicationContext-persistence.xml
        String resource = "D:\\sourcestudy\\configRepo-master\\configRepo-dao\\src\\test\\resources\\conf.dao\\applicationContext-datasource.xml";
        File f = new File(resource);
        ClassLoader classLoader= getClass().getClassLoader();
        InputStream inputStream  = new FileInputStream(f);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sessionFactory.openSession();
        String statement = "demo.sysAuth.BaseSysAuthMapper.count";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        SysAuth user = session.selectOne(statement, 1);
        System.out.println(user);
    }
}