/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysSysUserOrganizationJob.dao;

import com.framework.demo.sys.sysSysUserOrganizationJob.bo.SysSysUserOrganizationJob;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
@Mapper
public interface SysSysUserOrganizationJobMapper extends DaoMapper<SysSysUserOrganizationJob, Long> {
}