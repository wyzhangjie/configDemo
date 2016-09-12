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


    public DaoMapper<SysGroupRelation, Long> getDaoMapper() {
        return sysGroupRelationMapper;
    }

    @Resource(name = "sqlSessionFactory")

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }


    public SysGroupRelation findByGroupIdAndOrganizationId(Long groupId, Long organizationId) {
        return sysGroupRelationMapper.findByGroupIdAndOrganizationId(groupId,organizationId);
    }


    public void deleteInRange(Long startUserId, Long endUserId) {
        sysGroupRelationMapper.deleteInRange(startUserId,endUserId);
    }


    public SysGroupRelation findByGroupIdAndUserId(Long groupId, Long userId) {
        return sysGroupRelationMapper.findByGroupIdAndUserId(groupId,userId);
    }


    public SysGroupRelation findByGroupIdAndStartUserIdLessThanEqualAndEndUserIdGreaterThanEqual(Long groupId, Long startUserId, Long endUserId) {
        return sysGroupRelationMapper.findByGroupIdAndStartUserIdLessThanEqualAndEndUserIdGreaterThanEqual(groupId,startUserId,endUserId);
    }
}