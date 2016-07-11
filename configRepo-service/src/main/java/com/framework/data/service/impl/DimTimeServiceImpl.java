/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.data.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.data.bo.dimTime.DimTime;
import com.framework.data.dao.DimTimeDao;
import com.framework.data.service.DimTimeService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * This class corresponds to the database table `dim_time`
 */
@Service("dimTimeService")
public class DimTimeServiceImpl extends GenericSqlMapServiceImpl<DimTime, Date> implements DimTimeService {
    @Resource(name = "dimTimeDao")
    private DimTimeDao dimTimeDao;

    @Override
    public SqlMapDao<DimTime, Date> getDao() {
        return dimTimeDao;
    }
}