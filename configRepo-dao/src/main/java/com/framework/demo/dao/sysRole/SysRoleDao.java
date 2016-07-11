/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysRole;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.sysRole.SysRole;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_role`
 */
public interface SysRoleDao extends SqlMapDao<SysRole, Long> {
    Set<SysRole> findByUserId(Long id);
}