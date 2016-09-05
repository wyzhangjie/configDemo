/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroupRelation.dao;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.sys.sysGroupRelation.bo.SysGroupRelation;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
public interface SysGroupRelationDao extends SqlMapDao<SysGroupRelation, Long> {
    SysGroupRelation findByGroupIdAndOrganizationId(Long groupId, Long organizationId);

    void deleteInRange(Long startUserId, Long endUserId);

    SysGroupRelation findByGroupIdAndUserId(Long groupId, Long userId);

    SysGroupRelation findByGroupIdAndStartUserIdLessThanEqualAndEndUserIdGreaterThanEqual(Long groupId, Long startUserId, Long endUserId);
}