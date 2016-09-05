/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysAuth.dao;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_auth`
 */
public interface SysAuthDao extends SqlMapDao<SysAuth, Long> {

    Set<String> findStringPermissions(SysUser user);

    SysAuth findByUserid(Long userId);
}