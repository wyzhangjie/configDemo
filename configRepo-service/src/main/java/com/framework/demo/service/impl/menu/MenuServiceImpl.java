/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.menu;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import cn.vansky.framework.core.web.filter.auth.AuthWrapper;
import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.dao.menu.MenuDao;
import com.framework.demo.service.datagrid.EasyuiColumnService;
import com.framework.demo.service.datagrid.EasyuiDatagridService;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.pageTemplate.PageTempleteService;
import com.framework.demo.service.sysColor.SysTemplColrService;
import com.framework.demo.service.util.PageTempleteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * This class corresponds to the database table `menu`
 */
@Service("menuService")
public class MenuServiceImpl extends GenericSqlMapServiceImpl<Menu, Integer> implements MenuService {
    @Resource(name = "menuDao")
    private MenuDao menuDao;
    @Autowired
    PageTempleteService pageTempleteService;
    @Autowired
    PageTempleteUtil pageTempleteUtil;
    @Autowired
    SysTemplColrService sysTemplColrService;

    @Autowired
    EasyuiDatagridService EasyuiDatagridService;

    @Autowired
    EasyuiColumnService easyuiColumnService;

    @Override
    public SqlMapDao<Menu, Integer> getDao() {
        return menuDao;
    }

    @Override
    public List<Menu> findAuthWrapper(Integer id) {

        return menuDao.findMenuByUserId(id);
    }

    @Override
    public List<Menu> findNoFirestMenu() {
        return menuDao.findNoFirestMenu();
    }

    @Override
    public int insert(Menu menu) {
      return  menuDao.insert(menu);

    }
    public int selectIdByName(String name){
        return menuDao.selectIdByName(name);
    }

    @Override
    public String findId(String name) {
        return menuDao.findById(name);
    }

    @Override
    public int updateByPrimaryKey(Menu menu) {
      return    menuDao.updateById(menu);
    }

    public int insertPageInfo(PageTemplete pageTemplete){
        Menu menu =findMenu(pageTemplete);
        int result1 = insertResult1(menu);
        String id = findId(menu.getName());
        String path = pageTempleteUtil.findPath(pageTemplete.getKind(), pageTemplete.getMultime(), id);
         menu.setId(Integer.parseInt(id));
        //插入page_template
        int result2 = insertResult2(pageTemplete, id);
        //更新menu
        menu.setPath(path);
        int result3=  updateByPrimaryKey(menu);



        //返回
        if(result1*result2*result3==1){
            return 1;
        }else{
            return 0;
        }
    }

    public int insertResult1(Menu menu) {
        return insert(menu);
    }

    @Override
    public int getResult4(SysTemplColr sysTemplColr, String id) {
        return 0;
    }

    @Override
    public int getResult3(Menu menu, String id, String path) {
        return 0;
    }

    @Override
    public  int insertPageInfoForJq(PageTemplete pageTemplete, SysTemplColr sysTemplColr) {
        Menu menu = findMenu(pageTemplete);
        int result1 = insertResult1(menu);
        String id = findId(menu.getName());
        int result2 = insertResult2(pageTemplete, id);
        //更新menu
        String path = pageTempleteUtil.findPath(pageTemplete.getKind(), pageTemplete.getMultime(), id);
        int result3 = updateResult3(menu, id, path);
        int result4 = insertResult4(sysTemplColr, id);
        if(result1*result2*result3*result4==1){
            return 1;
        }else{
            return 0;
        }


    }

    public int insertResult4(SysTemplColr sysTemplColr, String id) {
        sysTemplColr.setModel(id);
        return sysTemplColrService.insert(sysTemplColr);
    }

    public int updateResult3(Menu menu, String id, String path) {
        menu.setId(Integer.parseInt(id));
        menu.setPath(path);
        return updateByPrimaryKey(menu);
    }

    public int insertResult2(PageTemplete pageTemplete, String id) {
        //插入page_template
        pageTemplete.setModel(Integer.parseInt(id));
        return pageTempleteService.insert(pageTemplete);
    }

    public Menu findMenu(PageTemplete pageTemplete) {

        String pmenuName = pageTemplete.getPmenuName();
        String menuName =pageTemplete.getMenuName();
        Menu menu = getMenu(pmenuName, menuName);
        return menu;
    }

    private Menu getMenu(String pmenuName, String menuName) {
        Menu menu =new Menu();
        int pid= selectIdByName(pmenuName);
        menu.setParentId(pid);
        menu.setName(menuName);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String  time = sdf.format(date);
        menu.setCreateTime(time);
        menu.setUpdateTime(time);
        menu.setStatus("1");
        return menu;
    }

    @Override
    public int insertPageInfoForDatagrid(EasyuiDatagrid easyuiDatagrid) {
        try {

            Menu menu = getMenu(easyuiDatagrid.getPmenuName(), easyuiDatagrid.getMenuName());
            int result1 = insertResult1(menu);
            String id = findId(menu.getName());
            easyuiDatagrid.setModel(Integer.parseInt(id));
            EasyuiDatagridService.insert(easyuiDatagrid);
            String path = pageTempleteUtil.findPath(easyuiDatagrid.getKind(), easyuiDatagrid.getMultime(), id);
            int result2 = updateResult3(menu, id, path);
            int colLen = easyuiDatagrid.getColumns().get(0).size();
            for(int i=0;i<colLen;i++){
                easyuiDatagrid.getColumns().get(0).get(i).setModel(id);
            }
            easyuiColumnService.insertBatch(easyuiDatagrid.getColumns().get(0));
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

}
