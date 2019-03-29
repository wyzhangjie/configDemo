/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOrganizationJob.dao;


import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
@Mapper
public interface SysUserOrganizationJobMapper extends DaoMapper<SysUserOrganizationJob, Long> {
}