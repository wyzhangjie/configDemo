/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysPermission.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysPermission.service.SysPermissionService;
import com.framework.demo.sys.sysPermission.bo.SysPermission;
import com.framework.demo.sys.sysPermission.dao.SysPermissionDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_permission`
 */
@Service("sysPermissionService")
public class SysPermissionServiceImpl extends GenericSqlMapServiceImpl<SysPermission, Long> implements SysPermissionService {
    @Resource(name = "sysPermissionDao")
    private SysPermissionDao sysPermissionDao;


    public SqlMapDao<SysPermission, Long> getDao() {
        return sysPermissionDao;
    }


    public void createPermission(SysPermission s) {
         sysPermissionDao.save(s);
    }


    public void deletePermission(Long permissionId) {
        sysPermissionDao.delete(permissionId);
    }
}