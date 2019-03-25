/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.rolemenu;


import com.framework.demo.bo.RoleMenu.SysRoleMenu;
import com.framework.demo.dao.rolemenu.SysRoleMenuMapper;
import com.framework.demo.service.rolemenu.SysRoleMenuService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_role_menu`
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends GenericSqlMapServiceImpl<SysRoleMenu, Integer> implements SysRoleMenuService {
    @Autowired
    private SysRoleMenuMapper sysRoleMenuDao;


    public DaoMapper<SysRoleMenu, Integer> getDao() {
        return sysRoleMenuDao;
    }
}