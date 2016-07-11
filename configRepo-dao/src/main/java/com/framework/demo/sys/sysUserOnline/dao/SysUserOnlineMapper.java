/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOnline.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;

/**
 * This class corresponds to the database table `sys_user_online`
 */
@SqlMapper
public interface SysUserOnlineMapper extends DaoMapper<SysUserOnline, String> {
}