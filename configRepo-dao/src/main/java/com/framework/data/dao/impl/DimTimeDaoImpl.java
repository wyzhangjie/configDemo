/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.data.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.data.bo.dimTime.DimTime;
import com.framework.data.dao.DimTimeDao;
import com.framework.data.dao.DimTimeMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;


/**
 * This class corresponds to the database table `dim_time`
 */
@Repository("dimTimeDao")
public class DimTimeDaoImpl extends ConfigurableBaseSqlMapDao<DimTime, Date> implements DimTimeDao {
    @Autowired
    private DimTimeMapper dimTimeMapper;

    @Override
    public DaoMapper<DimTime, Date> getDaoMapper() {
        return dimTimeMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}