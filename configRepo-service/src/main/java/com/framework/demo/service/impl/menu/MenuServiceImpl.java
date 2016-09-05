/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.menu;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.SearchOperator;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import cn.vansky.framework.core.web.filter.auth.AuthWrapper;
import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.menu.MenuDao;
import com.framework.demo.service.datagrid.EasyuiColumnService;
import com.framework.demo.service.datagrid.EasyuiDatagridService;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.pageTemplate.PageTempleteService;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sysColor.SysTemplColrService;
import com.framework.demo.service.util.PageTempleteUtil;
import com.google.common.collect.Lists;
import org.apache.shiro.authz.permission.WildcardPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;
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

    @Resource(name = "sysAuthService")
    SysAuthService sysAuthService;
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
        menu.setParentId(Long.getLong(String.valueOf(pid)));
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
    @Override
    public  List<Menu> findAuthSource(SysUser user) throws InvocationTargetException, IllegalAccessException {
        List<Menu> allList = new ArrayList<Menu>();
        if("root".equalsIgnoreCase(user.getUsername())){
            allList = new ArrayList<Menu>();
            allList   =    findAll();
        }else{
            //菜单数据加载
            Searchable searchable =
                    Searchable.newSearchable()
                            .addSearchFilter("status", SearchOperator.eq, "1")
                            .addSort(new Sort(Sort.Direction.DESC, "parentId", "weight"));
            searchable.removePageable();
            allList= Lists.newArrayList(findBySearchable(searchable).getContent());
            Set<String> userPermissions = sysAuthService.findStringPermissions(user);
            Iterator<Menu> iter = allList.iterator();
            while (iter.hasNext()) {
                if (!hasPermission(iter.next(), userPermissions)) {
                    iter.remove();
                }
            }
        }
        return allList;
    }
    private boolean hasPermission(String permission, String actualResourceIdentity) {

        //得到权限字符串中的 资源部分，如a:b:create --->资源是a:b
        String permissionResourceIdentity = permission.substring(0, permission.lastIndexOf(":"));

        //如果权限字符串中的资源 是 以资源为前缀 则有权限 如a:b 具有a:b的权限
        if(permissionResourceIdentity.startsWith(actualResourceIdentity)) {
            return true;
        }


        //模式匹配
        WildcardPermission p1 = new WildcardPermission(permissionResourceIdentity);
        WildcardPermission p2 = new WildcardPermission(actualResourceIdentity);

        return p1.implies(p2) || p2.implies(p1);
    }
    private boolean hasPermission(Menu resource, Set<String> userPermissions) {
        String actualResourceIdentity = findActualResourceIdentity(resource);
        if (StringUtils.isEmpty(actualResourceIdentity)) {
            return true;
        }

        for (String permission : userPermissions) {
            if (hasPermission(permission, actualResourceIdentity)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 得到真实的资源标识  即 父亲:儿子
     * @param resource
     * @return
     */
    public String findActualResourceIdentity(Menu resource) {

        if(resource == null&&resource.getIdentity()==null) {
            return null;
        }

        StringBuilder s = new StringBuilder(resource.getIdentity());

        boolean hasResourceIdentity = !StringUtils.isEmpty(resource.getIdentity());

        Menu parent = menuDao.findById(Integer.parseInt(resource.getParentId().toString()));
        while(parent != null) {
            if(!StringUtils.isEmpty(parent.getIdentity())) {
                s.insert(0, parent.getIdentity() + ":");
                hasResourceIdentity = true;
            }
            parent = menuDao.findById(Integer.parseInt(parent.getParentId().toString()));
        }

        //如果用户没有声明 资源标识  且父也没有，那么就为空
        if(!hasResourceIdentity) {
            return "";
        }


        //如果最后一个字符是: 因为不需要，所以删除之
        int length = s.length();
        if(length > 0 && s.lastIndexOf(":") == length - 1) {
            s.deleteCharAt(length - 1);
        }

        //如果有儿子 最后拼一个*
        boolean hasChildren = false;
        for(Menu r : findAll()) {
            if(resource.getId().equals(r.getParentId())) {
                hasChildren = true;
                break;
            }
        }
        if(hasChildren) {
            s.append(":*");
        }

        return s.toString();
    }
}
