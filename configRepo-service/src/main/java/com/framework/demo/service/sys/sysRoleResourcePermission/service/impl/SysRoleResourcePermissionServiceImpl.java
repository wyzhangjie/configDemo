/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysRoleResourcePermission.service.impl;



import javax.annotation.Resource;

import com.framework.demo.service.sys.sysRoleResourcePermission.service.SysRoleResourcePermissionService;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.framework.demo.sys.sysRoleResourcePermission.dao.SysRoleResourcePermissionMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
@Service("sysRoleResourcePermissionService")
public class SysRoleResourcePermissionServiceImpl extends GenericSqlMapServiceImpl<SysRoleResourcePermission, Long> implements SysRoleResourcePermissionService {
    @Resource(name = "sysRoleResourcePermissionDao")
    private SysRoleResourcePermissionMapper sysRoleResourcePermissionDao;


    public DaoMapper<SysRoleResourcePermission, Long> getDao() {
        return sysRoleResourcePermissionDao;
    }


    public SysRoleResourcePermission findByRoleId(Long roleId) {
        return sysRoleResourcePermissionDao.findByRoleId(roleId);
    }


    public List<SysRoleResourcePermission> findByRoleIds(Long id) {
        return sysRoleResourcePermissionDao.findByRoleIds(id);
    }
}