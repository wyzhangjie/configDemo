/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroupRelation.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysGroupRelation.bo.SysGroupRelation;
import com.framework.demo.sys.sysGroupRelation.dao.SysGroupRelationDao;
import com.framework.demo.sys.sysGroupRelation.dao.SysGroupRelationMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
@Repository("sysGroupRelationDao")
public class SysGroupRelationDaoImpl extends ConfigurableBaseSqlMapDao<SysGroupRelation, Long> implements SysGroupRelationDao {
    @Autowired
    private SysGroupRelationMapper sysGroupRelationMapper;

    @Override
    public DaoMapper<SysGroupRelation, Long> getDaoMapper() {
        return sysGroupRelationMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}