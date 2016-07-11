/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sysuser;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.sysUser.SysUser;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_user`
 */
public interface SysUserService extends GenericService<SysUser, Long> {

    SysUser login(String username, String password);
    public void createUser(SysUser user); //创建账户
    public void changePassword(Long userId, String newPassword);//修改密码
    public void correlationRoles(Long userId, Long... roleIds); //添加用户-角色关系
    public void uncorrelationRoles(Long userId, Long... roleIds);// 移除用户-角色关系
    public SysUser findByUsername(String username);// 根据用户名查找用户
    public Set<String> findRoles(String username);// 根据用户名查找其角色
    public Set<String> findPermissions(String username); //根据用户名查找其权限
}