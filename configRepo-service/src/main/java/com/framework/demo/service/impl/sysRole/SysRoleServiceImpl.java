/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.sysRole;

import javax.annotation.Resource;

import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.sysRole.SysRoleMapper;
import com.framework.demo.service.sysRole.SysRoleService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_role`
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends GenericSqlMapServiceImpl<SysRole, Long> implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleDao;


    public DaoMapper<SysRole, Long> getDao() {
        return sysRoleDao;
    }


    public Set<SysRole> findRoles(SysUser user) {
        return sysRoleDao.findByUserId(user.getId());
    }


    public void createRole(SysRole role) {
         sysRoleDao.insert(role);
    }


    public void deleteRole(Long roleId) {
        sysRoleDao.deleteByPrimaryKey(roleId);
    }


    public void correlationPermissions(Long roleId, Long... permissionIds) {

    }


    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {

    }
}