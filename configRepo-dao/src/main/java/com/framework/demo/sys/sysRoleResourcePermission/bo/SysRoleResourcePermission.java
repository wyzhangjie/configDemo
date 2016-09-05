/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysRoleResourcePermission.bo;

import com.framework.demo.bo.sysRole.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
@Component("sysRoleResourcePermission")
public class SysRoleResourcePermission extends SysRoleResourcePermissionBase {
   @Autowired
    private SysRole role;

   /* public SysRoleResourcePermission(Long resourceId, Set<Long> permissionIds) {
        super(resourceId, permissionIds);
    }*/


    public void setRole(SysRole role) {
        this.role = role;
    }
}