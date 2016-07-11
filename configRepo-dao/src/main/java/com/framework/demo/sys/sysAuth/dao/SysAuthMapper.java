/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysAuth.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_auth`
 */
@SqlMapper
public interface SysAuthMapper extends DaoMapper<SysAuth, Long> {
    Set<String> findStringRoles(SysUser user);

    Set<String> findStringPermissions(SysUser user);
}