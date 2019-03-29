/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.permission.task;

import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.sys.sysPermission.service.SysPermissionService;
import com.framework.demo.service.sysRole.SysRoleService;

import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.framework.demo.utils.LogUtils;
import com.github.fartherp.framework.database.mybatis.plugin.page.PageRequest;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.SearchRequest;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import java.util.Collection;
import java.util.Iterator;

/**
 * 清理无关联的Role-Resource/Permission关系
 * 1、Role-Resource
 * 2、Role-Permission
 * <p/>
 * <p>User: hyssop
 * <p>Date: 13-5-13 下午5:09
 * <p>Version: 1.0
 */
@Service()
public class RoleClearRelationTask {

    @Autowired
    private SysRoleService roleService;

  @Autowired
  private MenuService menuService;

    @Autowired
    private SysPermissionService permissionService;

    /**
     * 清除删除的角色对应的关系
     */
    public void clearDeletedRoleRelation() throws Exception{

        final int PAGE_SIZE = 100;
        int pn = 0;

        Pagination<SysRole> rolePage = null;
        do {
            PageRequest pageable = new PageRequest(pn++, PAGE_SIZE);
            Searchable searchable = new SearchRequest();
            searchable.setPage(pageable);
            rolePage = roleService.findBySearchable(searchable);
            //开启新事物清除
            try {
                RoleClearRelationTask roleClearRelationTask = (RoleClearRelationTask) AopContext.currentProxy();
                roleClearRelationTask.doClear(((Pagination) rolePage).getRows());
            } catch (Exception e) {
                //出异常也无所谓
                LogUtils.logError("clear role relation error", e);

            }
            //清空会话
           /* RepositoryHelper.clear();*/
        } while (rolePage.isHasNext());
    }

    public void doClear(Collection<SysRole> roleColl) {

        for (SysRole role : roleColl) {

            boolean needUpdate = false;
            Iterator<SysRoleResourcePermission> iter = role.getResourcePermissions().iterator();

            while (iter.hasNext()) {
                SysRoleResourcePermission roleResourcePermission = iter.next();

                //如果资源不存在了 就删除
                Long resourceId = roleResourcePermission.getResourceId();
                if (menuService.findById(resourceId.intValue())!=null) {
                    iter.remove();
                    needUpdate = true;
                }

                String[] ids = roleResourcePermission.getPermissionIds().split(",");
                for (String id:ids) {

                   if (permissionService.findById(Long.valueOf(id))!=null) {
                       roleResourcePermission.getPermissionIds().replace(id,"");
                       if(roleResourcePermission.getPermissionIds().contains(",,")){
                           roleResourcePermission.getPermissionIds().replace(",,",",");
                       }
                        needUpdate = true;
                    }
                }

            }

            if (needUpdate) {
                roleService.saveOrUpdate(role);
            }


        }

    }

}
