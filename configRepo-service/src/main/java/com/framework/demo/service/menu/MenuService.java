/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.menu;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.github.fartherp.framework.database.service.GenericService;

import java.util.List;

/**
 * This class corresponds to the database table `menu`
 */
public interface MenuService extends GenericService<Menu, Integer> {

    public List<Menu> findAuthWrapper(Integer id);

    public List<Menu> findNoFirestMenu();

    int insert(Menu menu);
    int selectIdByName(String name);

    String findId(String name);


    int updateByPrimaryKey(Menu menu);
    public int insertPageInfo(PageTemplete pageTemplete);

    int insertPageInfoForJq(PageTemplete pageTemplete, SysTemplColr sysTemplColr);
    public int insertResult1(Menu menu) ;
    public int getResult4(SysTemplColr sysTemplColr, String id) ;

    public int getResult3(Menu menu, String id, String path) ;

    public int insertResult2(PageTemplete pageTemplete, String id);

    public Menu findMenu(PageTemplete pageTemplete) ;


    int insertPageInfoForDatagrid(EasyuiDatagrid easyUiDatagrid);
}