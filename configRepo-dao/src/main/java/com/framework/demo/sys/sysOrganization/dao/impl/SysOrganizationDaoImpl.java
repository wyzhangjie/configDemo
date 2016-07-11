/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysOrganization.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysOrganization.bo.SysOrganization;
import com.framework.demo.sys.sysOrganization.dao.SysOrganizationDao;
import com.framework.demo.sys.sysOrganization.dao.SysOrganizationMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_organization`
 */
@Repository("sysOrganizationDao")
public class SysOrganizationDaoImpl extends ConfigurableBaseSqlMapDao<SysOrganization, Long> implements SysOrganizationDao {
    @Autowired
    private SysOrganizationMapper sysOrganizationMapper;

    @Override
    public DaoMapper<SysOrganization, Long> getDaoMapper() {
        return sysOrganizationMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}