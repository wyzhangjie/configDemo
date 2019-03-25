/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.menu;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.annotation.SqlMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import java.util.List;

/**
 * This class corresponds to the database table `menu`
 */
@SqlMapper
public interface MenuMapper extends DaoMapper<Menu, Integer> {
    List<Menu> findMenuByUserId(Integer id);

    List<Menu> findNoFirestMenu();

    int insert(PageTemplete pageTemplete);

    int selectIdByName(String name);

    Menu findById(String name);

    int updateById(Menu menu);

    Pagination<Menu> findBySearchable(Searchable searchable);
}