/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysOrganization.service.impl;


import com.framework.demo.service.sys.sysOrganization.service.SysOrganizationService;
import com.framework.demo.sys.sysOrganization.bo.SysOrganization;
import com.framework.demo.sys.sysOrganization.dao.SysOrganizationMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;
import com.github.fartherp.framework.tree.service.BaseTreeableServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_organization`
 */
@Service("sysOrganizationService")
public class SysOrganizationServiceImpl extends BaseTreeableServiceImpl<SysOrganization, Long> implements SysOrganizationService {

    @Autowired
    private SysOrganizationMapper sysOrganizationDao;

    public ExtendDaoMapper<SysOrganization, Long> getDao() {
        return sysOrganizationDao;
    }


}