/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.sysRole;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.sysRole.SysRoleDao;
import com.framework.demo.service.sysRole.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_role`
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends GenericSqlMapServiceImpl<SysRole, Long> implements SysRoleService {
    @Resource(name = "sysRoleDao")
    private SysRoleDao sysRoleDao;


    public SqlMapDao<SysRole, Long> getDao() {
        return sysRoleDao;
    }


    public Set<SysRole> findRoles(SysUser user) {
        return sysRoleDao.findByUserId(user.getId());
    }


    public void createRole(SysRole role) {
         sysRoleDao.save(role);
    }


    public void deleteRole(Long roleId) {
        sysRoleDao.delete(roleId);
    }


    public void correlationPermissions(Long roleId, Long... permissionIds) {

    }


    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {

    }
}