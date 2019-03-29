/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysJob.service.impl;

import javax.annotation.Resource;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.tree.service.BaseTreeableServiceImpl;
import com.framework.demo.service.sys.sysJob.service.SysJobService;
import com.framework.demo.sys.sysJob.bo.SysJob;

import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_job`
 */
@Service("sysJobService")
public class SysJobServiceImpl extends BaseTreeableServiceImpl<SysJob> implements SysJobService {
    @Resource(name = "sysJobDao")
    private SysJobDao sysJobDao;


    public SqlMapDao<SysJob, Long> getDao() {
        return sysJobDao;
    }


    public void updateSelftAndChild(SysJob source, Long newParentId, String newParentIds, int newWeight) {

    }
}