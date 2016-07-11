/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysResource.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysResource.bo.SysResource;
import com.framework.demo.sys.sysResource.dao.SysResourceDao;
import com.framework.demo.sys.sysResource.dao.SysResourceMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_resource`
 */
@Repository("sysResourceDao")
public class SysResourceDaoImpl extends ConfigurableBaseSqlMapDao<SysResource, Long> implements SysResourceDao {
    @Autowired
    private SysResourceMapper sysResourceMapper;

    @Override
    public DaoMapper<SysResource, Long> getDaoMapper() {
        return sysResourceMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public String findActualResourceIdentity(SysResource resource) {
        return sysResourceMapper.findActualResourceIdentity(resource);
    }
}