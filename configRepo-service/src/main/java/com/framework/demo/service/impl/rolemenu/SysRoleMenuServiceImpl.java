/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.rolemenu;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.demo.bo.RoleMenu.SysRoleMenu;
import com.framework.demo.dao.rolemenu.SysRoleMenuDao;
import com.framework.demo.service.rolemenu.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_role_menu`
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends GenericSqlMapServiceImpl<SysRoleMenu, Integer> implements SysRoleMenuService {
    @Resource(name = "sysRoleMenuDao")
    private SysRoleMenuDao sysRoleMenuDao;

    @Override
    public SqlMapDao<SysRoleMenu, Integer> getDao() {
        return sysRoleMenuDao;
    }
}