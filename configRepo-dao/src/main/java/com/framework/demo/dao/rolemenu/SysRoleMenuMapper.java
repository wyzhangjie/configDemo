/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.rolemenu;

import com.framework.demo.bo.RoleMenu.SysRoleMenu;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_role_menu`
 */
@Mapper
public interface SysRoleMenuMapper extends DaoMapper<SysRoleMenu, Integer> {
}