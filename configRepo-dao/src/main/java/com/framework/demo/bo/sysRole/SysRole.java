/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.sysRole;

import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role`
 */
@Component
public class SysRole extends SysRoleBase {
    private List<SysRoleResourcePermission> resourcePermissions;

    public void addResourcePermission(SysRoleResourcePermission roleResourcePermission) {
        roleResourcePermission.setRole(this);
        getResourcePermissions().add(roleResourcePermission);
    }

    public List<SysRoleResourcePermission> getResourcePermissions() {
        if (resourcePermissions == null) {
            resourcePermissions = Lists.newArrayList();
        }
        return resourcePermissions;
    }

}