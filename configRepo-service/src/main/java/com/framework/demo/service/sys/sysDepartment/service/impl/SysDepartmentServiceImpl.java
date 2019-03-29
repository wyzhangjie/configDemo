/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysDepartment.service.impl;

import com.framework.demo.service.sys.sysDepartment.service.SysDepartmentService;
import com.framework.demo.sys.sysDepartment.bo.SysDepartment;
import com.framework.demo.sys.sysDepartment.dao.SysDepartmentMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_department`
 */
@Service("sysDepartmentService")
public class SysDepartmentServiceImpl extends GenericSqlMapServiceImpl<SysDepartment, Integer> implements SysDepartmentService {
    @Autowired
    private SysDepartmentMapper sysDepartmentDao;


    public DaoMapper<SysDepartment, Integer> getDao() {
        return sysDepartmentDao;
    }
}