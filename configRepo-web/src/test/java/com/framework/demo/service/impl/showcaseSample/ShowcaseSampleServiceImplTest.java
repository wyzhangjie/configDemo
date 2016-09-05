package com.framework.demo.service.impl.showcaseSample;

import com.framework.demo.service.samplecaseSample.ShowcaseSampleService;
import com.framework.demo.web.controller.converter.DomainClassConverter;
import com.framework.demo.web.controller.showcase.deleted.DeletedSampleController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @author hassop
 * @Description
 * @date 2016/9/1 0001
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/conf/service/applicationContext-test.xml" })
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback=false)
public class ShowcaseSampleServiceImplTest  {
    @Autowired
    DomainClassConverter domainClassConverter;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private DeletedSampleController deletedSampleController;
    @Autowired
    ShowcaseSampleService showcaseSampleService;


    @Before
    public void before(){


    }

    @Test
    public void testFindByName() throws Exception {

    }
}