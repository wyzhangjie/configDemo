/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.menu;

import com.framework.demo.bo.menu.Menu;
import com.github.fartherp.framework.database.dao.DaoMapper;

import java.util.List;

/**
 * This class corresponds to the database table `menu`
 */
public interface MenuDao extends DaoMapper<Menu, Integer> {

   public List<Menu> findMenuByUserId(Integer id);

   List<Menu> findNoFirestMenu();

   int insert(Menu menu);

   int selectIdByName(String name);

   String findById(String name);

   int updateByPrimaryKey(Menu menu);

   int updateById(Menu menu);
}