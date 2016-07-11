/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOrganizationJob.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import com.framework.demo.sys.sysUserOrganizationJob.dao.SysUserOrganizationJobDao;
import com.framework.demo.sys.sysUserOrganizationJob.dao.SysUserOrganizationJobMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
@Repository("sysUserOrganizationJobDao")
public class SysUserOrganizationJobDaoImpl extends ConfigurableBaseSqlMapDao<SysUserOrganizationJob, Long> implements SysUserOrganizationJobDao {
    @Autowired
    private SysUserOrganizationJobMapper sysUserOrganizationJobMapper;

    @Override
    public DaoMapper<SysUserOrganizationJob, Long> getDaoMapper() {
        return sysUserOrganizationJobMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}