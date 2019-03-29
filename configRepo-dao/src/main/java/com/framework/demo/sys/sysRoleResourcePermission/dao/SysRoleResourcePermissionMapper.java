/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysRoleResourcePermission.dao;

import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
@Mapper
public interface SysRoleResourcePermissionMapper extends DaoMapper<SysRoleResourcePermission, Long> {
    SysRoleResourcePermission findByRoleId(Long roleId);

    List<SysRoleResourcePermission> findByRoleIds(Long id);
}