/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserOrganizationJob.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysUserOrganizationJob.service.SysUserOrganizationJobService;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import com.framework.demo.sys.sysUserOrganizationJob.dao.SysUserOrganizationJobDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
@Service("sysUserOrganizationJobService")
public class SysUserOrganizationJobServiceImpl extends GenericSqlMapServiceImpl<SysUserOrganizationJob, Long> implements SysUserOrganizationJobService {
    @Resource(name = "sysUserOrganizationJobDao")
    private SysUserOrganizationJobDao sysUserOrganizationJobDao;


    public SqlMapDao<SysUserOrganizationJob, Long> getDao() {
        return sysUserOrganizationJobDao;
    }
}