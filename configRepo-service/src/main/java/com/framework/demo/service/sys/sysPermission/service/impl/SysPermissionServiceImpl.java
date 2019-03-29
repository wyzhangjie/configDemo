/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysPermission.service.impl;

import com.framework.demo.service.sys.sysPermission.service.SysPermissionService;
import com.framework.demo.sys.sysPermission.bo.SysPermission;
import com.framework.demo.sys.sysPermission.dao.SysPermissionMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;
import com.github.fartherp.framework.database.service.impl.ExtendGenericSqlMapServiceImpl;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_permission`
 */
@Service("sysPermissionService")
public class SysPermissionServiceImpl extends ExtendGenericSqlMapServiceImpl<SysPermission, Long> implements SysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionDao;


    public ExtendDaoMapper<SysPermission, Long> getDao() {
        return sysPermissionDao;
    }


    public void createPermission(SysPermission s) {
         sysPermissionDao.insert(s);
    }


    public void deletePermission(Long permissionId) {
        sysPermissionDao.deleteByPrimaryKey(permissionId);
    }
}