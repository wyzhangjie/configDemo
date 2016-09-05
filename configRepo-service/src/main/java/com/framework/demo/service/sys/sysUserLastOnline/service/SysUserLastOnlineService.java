/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserLastOnline.service;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.sys.sysUserLastOnline.bo.SysUserLastOnline;

/**
 * This class corresponds to the database table `sys_user_last_online`
 */
public interface SysUserLastOnlineService extends GenericService<SysUserLastOnline, Long> {
    Object findByUserId(Long id);
}