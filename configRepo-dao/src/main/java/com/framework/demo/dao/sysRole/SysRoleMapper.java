/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysRole;

import com.framework.demo.bo.sysRole.SysRole;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_role`
 */
@Mapper
public interface SysRoleMapper extends DaoMapper<SysRole, Long> {
    Set<SysRole> findByUserId(Long id);
}