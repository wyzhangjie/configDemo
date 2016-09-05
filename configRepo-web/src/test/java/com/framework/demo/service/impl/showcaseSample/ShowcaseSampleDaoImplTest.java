package com.framework.demo.service.impl.showcaseSample;

import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.framework.demo.dao.showcaseSample.ShowcaseSampleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hassop
 * @Description
 * @date 2016/9/1 0001
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:conf/applicationContext.xml"})
public class ShowcaseSampleDaoImplTest {
    @Autowired
    ShowcaseSampleDao showcaseSampleDao;
    @Test
    public void testshowcaseSampleDao(){
       ShowcaseSample showcaseSample =  showcaseSampleDao.findById(Long.valueOf(2));
        System.out.println("result");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.format(new Date());

    }

}
