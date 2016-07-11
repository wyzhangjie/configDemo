/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.showcaseSample;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.framework.demo.dao.showcaseSample.ShowcaseSampleDao;
import com.framework.demo.dao.showcaseSample.ShowcaseSampleMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `showcase_sample`
 */
@Repository("showcaseSampleDao")
public class ShowcaseSampleDaoImpl extends ConfigurableBaseSqlMapDao<ShowcaseSample, Long> implements ShowcaseSampleDao {
    @Autowired
    private ShowcaseSampleMapper showcaseSampleMapper;

    @Override
    public DaoMapper<ShowcaseSample, Long> getDaoMapper() {
        return showcaseSampleMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}