/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysSysUserOrganizationJob.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysSysUserOrganizationJob.service.SysSysUserOrganizationJobService;
import com.framework.demo.sys.sysSysUserOrganizationJob.bo.SysSysUserOrganizationJob;

import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
@Service("sysSysUserOrganizationJobService")
public class SysSysUserOrganizationJobServiceImpl extends GenericSqlMapServiceImpl<SysSysUserOrganizationJob, Long> implements SysSysUserOrganizationJobService {
    @Resource(name = "sysSysUserOrganizationJobDao")
    private SysSysUserOrganizationJobDao sysSysUserOrganizationJobDao;


    public SqlMapDao<SysSysUserOrganizationJob, Long> getDao() {
        return sysSysUserOrganizationJobDao;
    }
}