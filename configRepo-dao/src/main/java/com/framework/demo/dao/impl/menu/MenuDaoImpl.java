/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.menu;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.dao.menu.MenuDao;
import com.framework.demo.dao.menu.MenuMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class corresponds to the database table `menu`
 */
@Repository("menuDao")
public class MenuDaoImpl extends ConfigurableBaseSqlMapDao<Menu, Integer> implements MenuDao {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public DaoMapper<Menu, Integer> getDaoMapper() {
        return menuMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public List<Menu> findMenuByUserId(Integer id) {
        return menuMapper.findMenuByUserId(id);
    }

    @Override
    public List<Menu> findNoFirestMenu() {
        return menuMapper.findNoFirestMenu();
    }

    @Override
    public int insert(Menu menu) {
        return menuMapper.insert(menu);
    }

    public int selectIdByName(String name){
        return menuMapper.selectIdByName(name);
    }

    @Override
    public String findById(String name) {
        return menuMapper.findById(name);
    }

    @Override
    public int updateByPrimaryKey(Menu menu) {
        return menuMapper.updateByPrimaryKey(menu);
    }

    @Override
    public int updateById(Menu menu) {
        return menuMapper.updateById(menu);
    }
}