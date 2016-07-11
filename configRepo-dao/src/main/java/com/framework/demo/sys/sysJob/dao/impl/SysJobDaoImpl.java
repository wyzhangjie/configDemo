/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysJob.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysJob.bo.SysJob;
import com.framework.demo.sys.sysJob.dao.SysJobDao;
import com.framework.demo.sys.sysJob.dao.SysJobMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_job`
 */
@Repository("sysJobDao")
public class SysJobDaoImpl extends ConfigurableBaseSqlMapDao<SysJob, Long> implements SysJobDao {
    @Autowired
    private SysJobMapper sysJobMapper;

    @Override
    public DaoMapper<SysJob, Long> getDaoMapper() {
        return sysJobMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}