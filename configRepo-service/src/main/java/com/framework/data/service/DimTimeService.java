/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.data.service;

import cn.vansky.framework.core.service.GenericService;
import com.framework.data.bo.dimTime.DimTime;

import java.util.Date;

/**
 * This class corresponds to the database table `dim_time`
 */
public interface DimTimeService extends GenericService<DimTime, Date> {
}