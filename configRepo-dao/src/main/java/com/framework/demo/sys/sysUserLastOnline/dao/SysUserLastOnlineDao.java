/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserLastOnline.dao;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.sys.sysUserLastOnline.bo.SysUserLastOnline;

/**
 * This class corresponds to the database table `sys_user_last_online`
 */
public interface SysUserLastOnlineDao extends SqlMapDao<SysUserLastOnline, Long> {
    Object findByUserId(Long id);
}