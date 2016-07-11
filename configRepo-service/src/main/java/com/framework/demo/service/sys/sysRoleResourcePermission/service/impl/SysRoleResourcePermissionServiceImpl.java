/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysRoleResourcePermission.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysRoleResourcePermission.service.SysRoleResourcePermissionService;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.framework.demo.sys.sysRoleResourcePermission.dao.SysRoleResourcePermissionDao;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
@Service("sysRoleResourcePermissionService")
public class SysRoleResourcePermissionServiceImpl extends GenericSqlMapServiceImpl<SysRoleResourcePermission, Long> implements SysRoleResourcePermissionService {
    @Resource(name = "sysRoleResourcePermissionDao")
    private SysRoleResourcePermissionDao sysRoleResourcePermissionDao;

    @Override
    public SqlMapDao<SysRoleResourcePermission, Long> getDao() {
        return sysRoleResourcePermissionDao;
    }

    @Override
    public SysRoleResourcePermission findByRoleId(Long roleId) {
        return sysRoleResourcePermissionDao.findByRoleId(roleId);
    }

    @Override
    public List<SysRoleResourcePermission> findByRoleIds(Long id) {
        return sysRoleResourcePermissionDao.findByRoleIds(id);
    }
}