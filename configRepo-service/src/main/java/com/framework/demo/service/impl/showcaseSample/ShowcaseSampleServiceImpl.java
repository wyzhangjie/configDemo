/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseSample;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.framework.demo.dao.showcaseSample.ShowcaseSampleMapper;
import com.framework.demo.service.samplecaseSample.ShowcaseSampleService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_sample`
 */
@Service("showcaseSampleService")
public class ShowcaseSampleServiceImpl extends GenericSqlMapServiceImpl<ShowcaseSample, Long> implements ShowcaseSampleService {
    @Autowired
    private ShowcaseSampleMapper showcaseSampleDao;


    public DaoMapper<ShowcaseSample, Long> getDao() {
        return showcaseSampleDao;
    }


    public ShowcaseSample findByName(String fieldValue) {
        return showcaseSampleDao.findByName(fieldValue);
    }
}