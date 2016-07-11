/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroupRelation.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysGroupRelation.bo.SysGroupRelation;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
@SqlMapper
public interface SysGroupRelationMapper extends DaoMapper<SysGroupRelation, Long> {
}