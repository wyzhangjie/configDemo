/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysJob.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;

import javax.annotation.Resource;

import com.framework.demo.service.common.BaseTreeableService;
import com.framework.demo.service.sys.sysJob.service.SysJobService;
import com.framework.demo.sys.sysJob.bo.SysJob;
import com.framework.demo.sys.sysJob.dao.SysJobDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_job`
 */
@Service("sysJobService")
public class SysJobServiceImpl extends BaseTreeableService<SysJob, Long> implements SysJobService {
    @Resource(name = "sysJobDao")
    private SysJobDao sysJobDao;

    @Override
    public SqlMapDao<SysJob, Long> getDao() {
        return sysJobDao;
    }
}