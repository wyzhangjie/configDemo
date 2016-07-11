/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOrganizationJob.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
@SqlMapper
public interface SysUserOrganizationJobMapper extends DaoMapper<SysUserOrganizationJob, Long> {
}