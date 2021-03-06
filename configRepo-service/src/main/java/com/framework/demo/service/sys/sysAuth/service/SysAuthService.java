/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysAuth.service;

import com.github.fartherp.framework.database.service.ExtendGenericService;
import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_auth`
 */
public interface SysAuthService extends ExtendGenericService<SysAuth, Long> {
    Set<String> findStringRoles(SysUser user);

    Set<String> findStringPermissions(SysUser user);

    void addUserAuth(Long[] userIds, SysAuth m);

    void addGroupAuth(Long[] groupIds, SysAuth m);

    void addOrganizationJobAuth(Long[] organizationIds, Long[][] jobIds, SysAuth m);
}