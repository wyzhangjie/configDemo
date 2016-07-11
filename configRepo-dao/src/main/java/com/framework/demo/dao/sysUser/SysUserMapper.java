/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysUser;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.sysUser.SysUser;

/**
 * This class corresponds to the database table `sys_user`
 */
@SqlMapper
public interface SysUserMapper extends DaoMapper<SysUser, Long> {
    SysUser findByUsername(String username);

    SysUser login(String username, String password);

    void changePassword(Long userId, String newPassword);

    void correlationRoles(Long userId, Long[] roleIds);

    void uncorrelationRoles(Long userId, Long[] roleIds);
}