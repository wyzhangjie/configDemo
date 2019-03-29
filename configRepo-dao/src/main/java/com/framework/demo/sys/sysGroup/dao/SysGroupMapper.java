/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroup.dao;

import com.framework.demo.sys.sysGroup.bo.SysGroup;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_group`
 */
@Mapper
public interface SysGroupMapper extends ExtendDaoMapper<SysGroup, Long> {
}