/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysPermission.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysPermission.bo.SysPermission;

/**
 * This class corresponds to the database table `sys_permission`
 */
@SqlMapper
public interface SysPermissionMapper extends DaoMapper<SysPermission, Long> {
}