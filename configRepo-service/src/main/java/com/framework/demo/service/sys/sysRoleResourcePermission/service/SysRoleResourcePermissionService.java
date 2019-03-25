/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysRoleResourcePermission.service;

import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
public interface SysRoleResourcePermissionService extends GenericService<SysRoleResourcePermission, Long> {
    SysRoleResourcePermission findByRoleId(Long roleId);

    List<SysRoleResourcePermission> findByRoleIds(Long id);
}