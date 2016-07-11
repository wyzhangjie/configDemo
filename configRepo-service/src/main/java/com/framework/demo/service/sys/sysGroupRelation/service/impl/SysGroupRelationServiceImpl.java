/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysGroupRelation.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysGroupRelation.service.SysGroupRelationService;
import com.framework.demo.sys.sysGroupRelation.bo.SysGroupRelation;
import com.framework.demo.sys.sysGroupRelation.dao.SysGroupRelationDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
@Service("sysGroupRelationService")
public class SysGroupRelationServiceImpl extends GenericSqlMapServiceImpl<SysGroupRelation, Long> implements SysGroupRelationService {
    @Resource(name = "sysGroupRelationDao")
    private SysGroupRelationDao sysGroupRelationDao;

    @Override
    public SqlMapDao<SysGroupRelation, Long> getDao() {
        return sysGroupRelationDao;
    }
}