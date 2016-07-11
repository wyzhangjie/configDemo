/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysRole;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.sysRole.SysRole;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_role`
 */
@SqlMapper
public interface SysRoleMapper extends DaoMapper<SysRole, Long> {
    SysRole findByUserId(Long id);
}