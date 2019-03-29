/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserStatusHistory.dao;

import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysUserStatusHistory.bo.SysUserStatusHistory;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_user_status_history`
 */
@Mapper
public interface SysUserStatusHistoryMapper extends DaoMapper<SysUserStatusHistory, Long> {
    String getLastReason(SysUser user);
}