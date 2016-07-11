/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysAuth.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sys.sysGroup.service.SysGroupService;
import com.framework.demo.service.sys.sysJob.service.SysJobService;
import com.framework.demo.service.sys.sysOrganization.service.SysOrganizationService;
import com.framework.demo.service.sys.sysPermission.service.SysPermissionService;
import com.framework.demo.service.sys.sysResource.service.SysResourceService;
import com.framework.demo.service.sys.sysRoleResourcePermission.service.SysRoleResourcePermissionService;
import com.framework.demo.service.sysRole.SysRoleService;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;
import com.framework.demo.sys.sysAuth.dao.SysAuthDao;
import com.framework.demo.sys.sysPermission.bo.SysPermission;
import com.framework.demo.sys.sysResource.bo.SysResource;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_auth`
 */
@Service("sysAuthService")
public class SysAuthServiceImpl extends GenericSqlMapServiceImpl<SysAuth, Long> implements SysAuthService {
    @Resource(name = "sysAuthDao")
    private SysAuthDao sysAuthDao;

    @Autowired
    private SysGroupService groupService;

    @Autowired
    private SysOrganizationService organizationService;

    @Autowired
    private SysJobService jobService;


    @Autowired
    private SysRoleService roleService;

    @Autowired
    private SysResourceService resourceService;

    @Autowired
    private SysPermissionService permissionService;

    @Autowired
    private SysRoleResourcePermissionService sysRoleResourcePermissionService;
    @Override
    public SqlMapDao<SysAuth, Long> getDao() {
        return sysAuthDao;
    }

    @Override
    public Set<String> findStringRoles(SysUser user) {
        Set<SysRole> roles = ((SysRoleService) AopContext.currentProxy()).findRoles(user);
        return Sets.newHashSet(Collections2.transform(roles, new Function<SysRole, String>() {
            @Override
            public String apply(SysRole input) {
                return input.getRole();
            }
        }));

    }

    @Override
    public Set<String> findStringPermissions(SysUser user) {

        Set<String> permissions = Sets.newHashSet();
        //根据用户找到角色
        //角色表和资源关联，获得资源
        //获取资源标示符
        //根据资源标示符号获得

        Set<SysRole> roles = findRoles(user);
        for (SysRole role : roles) {
            List<SysRoleResourcePermission> rrps = sysRoleResourcePermissionService.findByRoleIds(role.getId());
            for (SysRoleResourcePermission rrp :rrps) {
                SysResource resource = resourceService.findById(rrp.getResourceId());

                String actualResourceIdentity = resourceService.findActualResourceIdentity(resource);

                //不可用 即没查到 或者标识字符串不存在
                if (resource == null || StringUtils.isEmpty(actualResourceIdentity) || Boolean.FALSE.equals(resource.getIsShow())) {
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

    private Set<SysRole> findRoles(SysUser user) {
        return roleService.findRoles(user);
    }


}