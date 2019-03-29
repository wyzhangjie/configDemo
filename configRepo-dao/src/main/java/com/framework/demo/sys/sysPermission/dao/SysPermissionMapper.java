/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysPermission.dao;

import com.framework.demo.sys.sysPermission.bo.SysPermission;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_permission`
 */
@Mapper
public interface SysPermissionMapper extends ExtendDaoMapper<SysPermission, Long> {
}