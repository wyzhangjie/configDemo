/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseSample;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.framework.demo.service.samplecaseSample.ShowcaseSampleService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_sample`
 */
@Service("showcaseSampleService")
public class ShowcaseSampleServiceImpl extends GenericSqlMapServiceImpl<ShowcaseSample, Long> implements ShowcaseSampleService {
    @Resource(name = "showcaseSampleDao")
    private ShowcaseSampleDao showcaseSampleDao;


    public SqlMapDao<ShowcaseSample, Long> getDao() {
        return showcaseSampleDao;
    }


    public ShowcaseSample findByName(String fieldValue) {
        return showcaseSampleDao.findByName(fieldValue);
    }
}