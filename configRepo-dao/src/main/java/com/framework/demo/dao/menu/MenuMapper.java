/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.menu;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;

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

    String findById(String name);

    int updateById(Menu menu);
}