/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOnline.dao;

import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_user_online`
 */
@Mapper
public interface SysUserOnlineMapper extends ExtendDaoMapper<SysUserOnline, Long> {
}