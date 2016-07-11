/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysJob.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysJob.bo.SysJob;

/**
 * This class corresponds to the database table `sys_job`
 */
@SqlMapper
public interface SysJobMapper extends DaoMapper<SysJob, Long> {
}