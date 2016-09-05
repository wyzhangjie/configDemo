/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysOrganization.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import javax.annotation.Resource;

import com.framework.demo.service.common.BaseTreeableService;
import com.framework.demo.service.sys.sysOrganization.service.SysOrganizationService;
import com.framework.demo.sys.sysOrganization.bo.SysOrganization;
import com.framework.demo.sys.sysOrganization.dao.SysOrganizationDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_organization`
 */
@Service("sysOrganizationService")
class SysOrganizationServiceImpl extends BaseTreeableService<SysOrganization, Long> implements SysOrganizationService {
    @Resource(name = "sysOrganizationDao")
    private SysOrganizationDao sysOrganizationDao;

    private BaseTreeableService baseTreeableService;
    @Override
    public SqlMapDao<SysOrganization, Long> getDao() {
        return sysOrganizationDao;
    }


}