/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysDepartment.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysDepartment.service.SysDepartmentService;
import com.framework.demo.sys.sysDepartment.bo.SysDepartment;
import com.framework.demo.sys.sysDepartment.dao.SysDepartmentDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_department`
 */
@Service("sysDepartmentService")
public class SysDepartmentServiceImpl extends GenericSqlMapServiceImpl<SysDepartment, Integer> implements SysDepartmentService {
    @Resource(name = "sysDepartmentDao")
    private SysDepartmentDao sysDepartmentDao;

    @Override
    public SqlMapDao<SysDepartment, Integer> getDao() {
        return sysDepartmentDao;
    }
}