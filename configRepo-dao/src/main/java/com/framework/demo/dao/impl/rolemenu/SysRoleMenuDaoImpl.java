/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.rolemenu;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.RoleMenu.SysRoleMenu;
import com.framework.demo.dao.rolemenu.SysRoleMenuDao;
import com.framework.demo.dao.rolemenu.SysRoleMenuMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_role_menu`
 */
@Repository("sysRoleMenuDao")
public class SysRoleMenuDaoImpl extends ConfigurableBaseSqlMapDao<SysRoleMenu, Integer> implements SysRoleMenuDao {
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;


    public DaoMapper<SysRoleMenu, Integer> getDaoMapper() {
        return sysRoleMenuMapper;
    }

    @Resource(name = "sqlSessionFactory")

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}