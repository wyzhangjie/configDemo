/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysUser;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.sysUser.SysUser;

/**
 * This class corresponds to the database table `sys_user`
 */
public interface SysUserDao extends SqlMapDao<SysUser, Long> {
    SysUser findByUsername(String username);

    SysUser login(String username, String password);

    void changePassword(Long userId, String newPassword);

    void correlationRoles(Long userId, Long[] roleIds);

    void uncorrelationRoles(Long userId, Long[] roleIds);
}