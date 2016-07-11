/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysResource.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysResource.service.SysResourceService;
import com.framework.demo.sys.sysResource.bo.SysResource;
import com.framework.demo.sys.sysResource.dao.SysResourceDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_resource`
 */
@Service("sysResourceService")
public class SysResourceServiceImpl extends GenericSqlMapServiceImpl<SysResource, Long> implements SysResourceService {
    @Resource(name = "sysResourceDao")
    private SysResourceDao sysResourceDao;

    @Override
    public SqlMapDao<SysResource, Long> getDao() {
        return sysResourceDao;
    }

    @Override
    public String findActualResourceIdentity(SysResource resource) {
        return sysResourceDao.findActualResourceIdentity(resource);
    }
}