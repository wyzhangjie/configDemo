/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysRoleResourcePermission.dao;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
public interface SysRoleResourcePermissionDao extends SqlMapDao<SysRoleResourcePermission, Long> {
    SysRoleResourcePermission findByRoleId(Long roleId);

    List<SysRoleResourcePermission> findByRoleIds(Long id);
}