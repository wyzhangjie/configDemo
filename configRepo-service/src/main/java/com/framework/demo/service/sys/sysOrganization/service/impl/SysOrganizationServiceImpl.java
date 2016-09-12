/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysOrganization.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import javax.annotation.Resource;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import cn.vansky.framework.tree.service.BaseTreeableServiceImpl;
import com.framework.demo.service.sys.sysOrganization.service.SysOrganizationService;
import com.framework.demo.sys.sysJob.bo.SysJob;
import com.framework.demo.sys.sysOrganization.bo.SysOrganization;
import com.framework.demo.sys.sysOrganization.dao.SysOrganizationDao;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_organization`
 */
@Service("sysOrganizationService")
public class SysOrganizationServiceImpl extends BaseTreeableServiceImpl<SysOrganization, Long> implements SysOrganizationService {

    @Resource(name = "sysOrganizationDao")
    private SysOrganizationDao sysOrganizationDao;

    public SqlMapDao<SysOrganization, Long> getDao() {
        return sysOrganizationDao;
    }


}