/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserStatusHistory.dao;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysUserStatusHistory.bo.SysUserStatusHistory;

/**
 * This class corresponds to the database table `sys_user_status_history`
 */
public interface SysUserStatusHistoryDao extends SqlMapDao<SysUserStatusHistory, Long> {
    String getLastReason(SysUser user);
}