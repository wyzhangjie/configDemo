/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.user.task;

import cn.vansky.framework.core.orm.mybatis.plugin.page.PageRequest;
import cn.vansky.framework.core.orm.mybatis.plugin.page.Pagination;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.service.sys.sysJob.service.SysJobService;
import com.framework.demo.service.sys.sysOrganization.service.SysOrganizationService;
import com.framework.demo.service.sys.sysUserOrganizationJob.service.SysUserOrganizationJobService;
import com.framework.demo.service.sysuser.SysUserService;

import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.framework.demo.utils.LogUtils;

import java.util.Collection;

/**
 * 清理无关联的User-Organization/Job关系
 * 1、User-Organization/Job
 * <p/>
 * <p>User: hyssop
 * <p>Date: 13-5-13 下午5:09
 * <p>Version: 1.0
 */
@Service()
public class UserClearRelationTask {

    @Autowired
    private SysUserService userService;

    @Autowired
    private SysOrganizationService organizationService;

    @Autowired
    private SysUserOrganizationJobService sysUserOrganizationJobService;


    @Autowired
    private SysJobService sysJobService;
    /**
     * 清除删除的用户-组织机构/工作职务对应的关系
     */
    public void clearDeletedUserRelation() {

        //删除用户不存在的情况的SysUserOrganizationJob（比如手工从数据库物理删除）。。
        userService.deleteSysUserOrganizationJobOnNotExistsUser();

        Pagination<SysUserOrganizationJob> page = null;

        int pn = 0;
        final int PAGE_SIZE = 100;
        Pagination pageable = null;
        do {
            pageable = new PageRequest(pn++, PAGE_SIZE);
            page = userService.findSysUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);

            //开启新事物清除
            try {
                UserClearRelationTask userClearRelationTask = (UserClearRelationTask) AopContext.currentProxy();
                userClearRelationTask.doClear(page.getRows());
            } catch (Exception e) {
                //出异常也无所谓
                LogUtils.logError("clear user relation error", e);

            }
            //清空会话

        } while (page.hasNextPage());

    }

    public void doClear(Collection<SysUserOrganizationJob> SysUserOrganizationJobColl) {
        for (SysUserOrganizationJob SysUserOrganizationJob : SysUserOrganizationJobColl) {

            SysUser user = userService.findById(SysUserOrganizationJob.getUserId());

            if (organizationService.findById(SysUserOrganizationJob.getOrganizationId())==null) {
                sysUserOrganizationJobService.delete(SysUserOrganizationJob);//如果是组织机构删除了 直接移除
            } else if (sysJobService.findById(SysUserOrganizationJob.getJobId())==null) {
                sysUserOrganizationJobService.delete(SysUserOrganizationJob);
                SysUserOrganizationJob.setJobId(null);
                sysUserOrganizationJobService.saveOrUpdate(SysUserOrganizationJob);
            }
            //不加也可 加上的目的是为了清缓存
            userService.saveOrUpdate(user);
        }

    }
}
