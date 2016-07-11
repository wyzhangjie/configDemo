/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.rolemenu;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.RoleMenu.SysRoleMenu;

/**
 * This class corresponds to the database table `sys_role_menu`
 */
@SqlMapper
public interface SysRoleMenuMapper extends DaoMapper<SysRoleMenu, Integer> {
}