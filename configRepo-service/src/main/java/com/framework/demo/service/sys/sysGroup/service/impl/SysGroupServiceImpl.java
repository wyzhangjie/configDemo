/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysGroup.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysGroup.service.SysGroupService;
import com.framework.demo.sys.sysGroup.bo.SysGroup;
import com.framework.demo.sys.sysGroup.dao.SysGroupDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_group`
 */
@Service("sysGroupService")
public class SysGroupServiceImpl extends GenericSqlMapServiceImpl<SysGroup, Long> implements SysGroupService {
    @Resource(name = "sysGroupDao")
    private SysGroupDao sysGroupDao;

    @Override
    public SqlMapDao<SysGroup, Long> getDao() {
        return sysGroupDao;
    }
}