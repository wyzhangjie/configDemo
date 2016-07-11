/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.menu;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;

import java.util.List;

/**
 * This class corresponds to the database table `menu`
 */
public interface MenuDao extends SqlMapDao<Menu, Integer> {

   public List<Menu> findMenuByUserId(Integer id);

   List<Menu> findNoFirestMenu();

   int insert(Menu menu);

   int selectIdByName(String name);

   String findById(String name);

   int updateByPrimaryKey(Menu menu);

   int updateById(Menu menu);
}