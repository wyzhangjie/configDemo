/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroup.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysGroup.bo.SysGroup;
import com.framework.demo.sys.sysGroup.dao.SysGroupDao;
import com.framework.demo.sys.sysGroup.dao.SysGroupMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_group`
 */
@Repository("sysGroupDao")
public class SysGroupDaoImpl extends ConfigurableBaseSqlMapDao<SysGroup, Long> implements SysGroupDao {
    @Autowired
    private SysGroupMapper sysGroupMapper;

    @Override
    public DaoMapper<SysGroup, Long> getDaoMapper() {
        return sysGroupMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}