/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysPermission.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysPermission.bo.SysPermission;
import com.framework.demo.sys.sysPermission.dao.SysPermissionDao;
import com.framework.demo.sys.sysPermission.dao.SysPermissionMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_permission`
 */
@Repository("sysPermissionDao")
public class SysPermissionDaoImpl extends ConfigurableBaseSqlMapDao<SysPermission, Long> implements SysPermissionDao {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public DaoMapper<SysPermission, Long> getDaoMapper() {
        return sysPermissionMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}