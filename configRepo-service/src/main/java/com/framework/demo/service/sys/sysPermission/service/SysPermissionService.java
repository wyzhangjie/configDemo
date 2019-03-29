/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysPermission.service;

import com.github.fartherp.framework.database.service.ExtendGenericService;
import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.sys.sysPermission.bo.SysPermission;

/**
 * This class corresponds to the database table `sys_permission`
 */
public interface SysPermissionService extends ExtendGenericService<SysPermission, Long> {
    public void createPermission(SysPermission s);
    public void deletePermission(Long permissionId);
}