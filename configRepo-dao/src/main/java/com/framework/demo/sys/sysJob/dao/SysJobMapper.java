/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysJob.dao;

import com.framework.demo.sys.sysJob.bo.SysJob;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_job`
 */
@Mapper
public interface SysJobMapper extends DaoMapper<SysJob, Long> {
}