/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysAuth.service.impl;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sys.sysGroup.service.SysGroupService;
import com.framework.demo.service.sys.sysJob.service.SysJobService;
import com.framework.demo.service.sys.sysOrganization.service.SysOrganizationService;
import com.framework.demo.service.sys.sysPermission.service.SysPermissionService;
import com.framework.demo.service.sys.sysRoleResourcePermission.service.SysRoleResourcePermissionService;
import com.framework.demo.service.sysRole.SysRoleService;
import com.framework.demo.service.sysuser.SysUserService;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;
import com.framework.demo.sys.sysAuth.dao.SysAuthMapper;
import com.framework.demo.sys.sysPermission.bo.SysPermission;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Sort;
import com.github.fartherp.framework.database.service.impl.ExtendGenericSqlMapServiceImpl;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

/**
 * This class corresponds to the database table `sys_auth`
 */
@Service("sysAuthService")
public class SysAuthServiceImpl   extends ExtendGenericSqlMapServiceImpl<SysAuth, Long> implements SysAuthService {
    @Autowired
    private SysAuthMapper sysAuthDao;

    @Autowired
    private SysGroupService groupService;

    @Autowired
    private SysOrganizationService organizationService;

    @Autowired
    private SysJobService jobService;


    @Autowired
    private SysRoleService roleService;

    @Autowired
    private MenuService resourceService;

    @Autowired
    private SysPermissionService permissionService;

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleResourcePermissionService sysRoleResourcePermissionService;

    public ExtendDaoMapper<SysAuth, Long> getDao() {
        return sysAuthDao;
    }


    public Set<String> findStringRoles(SysUser user) {
        Set<SysRole> roles =roleService.findRoles(user);
        return Sets.newHashSet(Collections2.transform(roles, new Function<SysRole, String>() {

            public String apply(SysRole input) {
                return input.getRole();
            }
        }));

    }


    public Set<String> findStringPermissions(SysUser user) {

        Set<String> permissions = Sets.newHashSet();
        //根据用户找到角色
        //角色表和资源关联，获得资源
        //获取资源标示符
        //根据资源标示符号获得

        Set<SysRole> roles = roleService.findRoles(user);
        for (SysRole role : roles) {
            List<SysRoleResourcePermission> rrps = sysRoleResourcePermissionService.findByRoleIds(role.getId());
            for (SysRoleResourcePermission rrp :rrps) {
                Menu resource = resourceService.findById(rrp.getResourceId().intValue());

                String actualResourceIdentity = resourceService.findActualResourceIdentity(resource);

                //不可用 即没查到 或者标识字符串不存在
                if (resource == null || StringUtils.isEmpty(actualResourceIdentity) || Boolean.FALSE.equals(resource)) {
                    continue;
                }
                String[] permissionIds = rrp.getPermissionIds().split(",");
                for (String permissionId : permissionIds) {
                    SysPermission permission = permissionService.findById(Long.valueOf(permissionId));

                    //不可用
                    if (permission == null || Boolean.FALSE.equals(permission.getIsShow())) {
                        continue;
                    }
                    permissions.add(actualResourceIdentity + ":" + permission.getPermission());

                }
            }

        }

        return permissions;

    }


    public void addUserAuth(Long[] userIds, SysAuth m) {
        if (ArrayUtils.isEmpty(userIds)) {
            return;
        }

        for (Long userId : userIds) {

            SysUser user = sysUserService.findById(userId);
            if (user == null) {
                continue;
            }

            SysAuth auth = sysAuthDao.findByUserid(userId);
            if (auth != null) {
                auth.setRoleIds(m.getRoleIds());
                continue;
            }
            auth = new SysAuth();
            auth.setUserId(userId);
            auth.setType(m.getType());
            auth.setRoleIds(m.getRoleIds());
            sysAuthDao.insert(auth);
        }

    }


    public void addGroupAuth(Long[] groupIds, SysAuth m) {

    }


    public void addOrganizationJobAuth(Long[] organizationIds, Long[][] jobIds, SysAuth m) {

    }


    private Set<SysRole> findRoles(SysUser user) {
        return roleService.findRoles(user);
    }



}