/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysAuth.service;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_auth`
 */
public interface SysAuthService extends GenericService<SysAuth, Long> {
    Set<String> findStringRoles(SysUser user);

    Set<String> findStringPermissions(SysUser user);
}