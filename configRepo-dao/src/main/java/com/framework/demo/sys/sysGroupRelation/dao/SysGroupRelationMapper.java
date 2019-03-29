/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroupRelation.dao;

import com.framework.demo.sys.sysGroupRelation.bo.SysGroupRelation;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
@Mapper
public interface SysGroupRelationMapper extends ExtendDaoMapper<SysGroupRelation, Long> {
    SysGroupRelation findByGroupIdAndOrganizationId(Long groupId, Long organizationId);

    void deleteInRange(Long startUserId, Long endUserId);

    SysGroupRelation findByGroupIdAndUserId(Long groupId, Long userId);

    SysGroupRelation findByGroupIdAndStartUserIdLessThanEqualAndEndUserIdGreaterThanEqual(Long groupId, Long startUserId, Long endUserId);
}