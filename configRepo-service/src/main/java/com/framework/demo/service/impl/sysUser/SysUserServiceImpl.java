/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.sysUser;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.sysUser.SysUserDao;
import com.framework.demo.service.sysuser.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_user`
 */
@Service("sysUserService")
public class SysUserServiceImpl extends GenericSqlMapServiceImpl<SysUser, Long> implements SysUserService {
    @Resource(name = "sysUserDao")
    private SysUserDao sysUserDao;

    @Override
    public SqlMapDao<SysUser, Long> getDao() {
        return sysUserDao;
    }

    @Override
    public SysUser findByUsername(String username) {
        return sysUserDao.findByUsername(username);
    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }

    @Override
    public SysUser login(String username, String password) {
        return sysUserDao.login(username,password);
    }

    @Override
    public void createUser(SysUser user) {
         sysUserDao.save(user);
    }

    @Override
    public void changePassword(Long userId, String newPassword) {
        sysUserDao.changePassword(userId,newPassword);
    }

    @Override
    public void correlationRoles(Long userId, Long... roleIds) {
        sysUserDao.correlationRoles(userId,roleIds);
    }

    @Override
    public void uncorrelationRoles(Long userId, Long... roleIds) {
        sysUserDao.uncorrelationRoles(userId,roleIds);
    }
}