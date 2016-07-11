/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysRoleResourcePermission.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
@SqlMapper
public interface SysRoleResourcePermissionMapper extends DaoMapper<SysRoleResourcePermission, Long> {
    SysRoleResourcePermission findByRoleId(Long roleId);

    List<SysRoleResourcePermission> findByRoleIds(Long id);
}