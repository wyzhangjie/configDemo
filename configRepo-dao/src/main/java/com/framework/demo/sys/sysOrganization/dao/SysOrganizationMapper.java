/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysOrganization.dao;

import com.framework.demo.sys.sysOrganization.bo.SysOrganization;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_organization`
 */
@Mapper
public interface SysOrganizationMapper extends ExtendDaoMapper<SysOrganization, Long> {
}