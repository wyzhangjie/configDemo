/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserOrganizationJob.service.impl;

import javax.annotation.Resource;

import com.framework.demo.service.sys.sysUserOrganizationJob.service.SysUserOrganizationJobService;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import com.framework.demo.sys.sysUserOrganizationJob.dao.SysUserOrganizationJobMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
@Service("SysUserOrganizationJobService")
public class SysUserOrganizationJobServiceImpl extends GenericSqlMapServiceImpl<SysUserOrganizationJob, Long> implements SysUserOrganizationJobService {
    @Autowired
    private SysUserOrganizationJobMapper SysUserOrganizationJobDao;


    public DaoMapper<SysUserOrganizationJob, Long> getDao() {
        return SysUserOrganizationJobDao;
    }
}