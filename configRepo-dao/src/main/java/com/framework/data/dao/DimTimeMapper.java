/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.data.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.data.bo.dimTime.DimTime;

import java.util.Date;

/**
 * This class corresponds to the database table `dim_time`
 */
@SqlMapper
public interface DimTimeMapper extends DaoMapper<DimTime, Date> {
}