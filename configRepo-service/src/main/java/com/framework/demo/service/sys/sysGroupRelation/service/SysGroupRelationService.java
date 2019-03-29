/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysGroupRelation.service;

import com.github.fartherp.framework.database.service.ExtendGenericService;
import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.sys.sysGroupRelation.bo.SysGroupRelation;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
public interface SysGroupRelationService extends ExtendGenericService<SysGroupRelation, Long> {


    void appendRelation(Long id, Long[] ids);
    void appendRelation(Long groupId, Long[] userIds, Long[] startUserIds, Long[] endUserIds);
}