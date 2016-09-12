/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.auth.task;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.*;
import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.enm.AuthType;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sys.sysGroup.service.SysGroupService;
import com.framework.demo.service.sys.sysJob.service.SysJobService;
import com.framework.demo.service.sys.sysOrganization.service.SysOrganizationService;
import com.framework.demo.service.sysRole.SysRoleService;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.framework.demo.utils.LogUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 清理Auth无关联的关系
 * 1、Auth-Role
 * 2、Auth-Organization/Job
 * 3、Auth-Group
 * <p/>
 * <p>User: hyssop
 * <p>Date: 13-5-18 下午1:44
 * <p>Version: 1.0
 */
@Service
public class AuthRelationClearTask {

    @Autowired
    private SysAuthService authService;

    @Autowired
    private SysRoleService roleService;

    @Autowired
    private SysGroupService groupService;

    @Autowired
    private SysOrganizationService organizationService;

    @Autowired
    private SysJobService jobService;


    /**
     * 清除删除的角色对应的关系
     */
    public void clearDeletedAuthRelation() throws Exception{

        Set<Long> allRoleIds = findAllRoleIds();

        final int PAGE_SIZE = 100;
        int pn = 0;

        Page<SysAuth> authPage = null;

        do {
            Pageable pageable = new PageRequest(pn++, PAGE_SIZE);
            Searchable seachable = new SearchRequest();
            seachable.setPage(pageable);
            authPage = authService.findBySearchable(seachable);
            //开启新事物清除
            try {
                AuthRelationClearTask authRelationClearService = (AuthRelationClearTask) AopContext.currentProxy();
                authRelationClearService.doClear(authPage.getContent(), allRoleIds);
            } catch (Exception e) {
                //出异常也无所谓
                LogUtils.logError("clear auth relation error", e);
            }
            //清空会话
        //    RepositoryHelper.clear();
        } while (authPage.hasNextPage());
    }

    public void doClear(Collection<SysAuth> authColl, Set<Long> allRoleIds) {
        for (SysAuth auth : authColl) {

            switch (AuthType.valueOf(auth.getType())) {
                case user:
                    break;//因为用户是逻辑删除不用管
                case user_group:
                case organization_group:
                    if (groupService.findById(auth.getGroupId())!=null) {
                        authService.delete(auth);
                        continue;
                    }
                    break;
                case organization_job:
                    if (organizationService.findById(auth.getOrganizationId())!=null) {
                        auth.setOrganizationId(0L);
                    }
                    if (jobService.findById(auth.getOrganizationId())!=null) {
                        auth.setJobId(0L);
                    }
                    //如果组织机构/工作职务都为0L 那么可以删除
                    if (auth.getOrganizationId() == 0L && auth.getJobId() == 0L) {
                        authService.delete(auth);
                        continue;
                    }
                    break;
            }
            Set<String> sets = new HashSet<String>();
            sets.toArray(auth.getRoleIds().trim().split(","));
            String[] auths = auth.getRoleIds().trim().split(",");
            for(String s:auths){
                sets.add(s);
            }


            boolean hasRemovedAny = sets.retainAll(allRoleIds);
            if (hasRemovedAny) {
                authService.saveOrUpdate(auth);
            }
        }

    }

    private Set<Long> findAllRoleIds() {
        return Sets.newHashSet(Lists.transform(roleService.findAll(), new Function<SysRole, Long>() {

            public Long apply(SysRole input) {
                return input.getId();
            }
        }));
    }


}
