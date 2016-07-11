/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysRoleResourcePermission.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.framework.demo.sys.sysRoleResourcePermission.dao.SysRoleResourcePermissionDao;
import com.framework.demo.sys.sysRoleResourcePermission.dao.SysRoleResourcePermissionMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
@Repository("sysRoleResourcePermissionDao")
public class SysRoleResourcePermissionDaoImpl extends ConfigurableBaseSqlMapDao<SysRoleResourcePermission, Long> implements SysRoleResourcePermissionDao {
    @Autowired
    private SysRoleResourcePermissionMapper sysRoleResourcePermissionMapper;

    @Override
    public DaoMapper<SysRoleResourcePermission, Long> getDaoMapper() {
        return sysRoleResourcePermissionMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public SysRoleResourcePermission findByRoleId(Long roleId) {
        return sysRoleResourcePermissionMapper.findByRoleId(roleId);
    }

    @Override
    public List<SysRoleResourcePermission> findByRoleIds(Long id) {
        return sysRoleResourcePermissionMapper.findByRoleIds(id);
    }
}