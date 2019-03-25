/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserStatusHistory.service;

import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysUserStatusHistory.bo.SysUserStatusHistory;

/**
 * This class corresponds to the database table `sys_user_status_history`
 */
public interface SysUserStatusHistoryService extends GenericService<SysUserStatusHistory, Long> {
    String getLastReason(SysUser user);
}