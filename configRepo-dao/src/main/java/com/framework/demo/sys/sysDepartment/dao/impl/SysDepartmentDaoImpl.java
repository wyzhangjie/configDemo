/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysDepartment.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysDepartment.bo.SysDepartment;
import com.framework.demo.sys.sysDepartment.dao.SysDepartmentDao;
import com.framework.demo.sys.sysDepartment.dao.SysDepartmentMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_department`
 */
@Repository("sysDepartmentDao")
public class SysDepartmentDaoImpl extends ConfigurableBaseSqlMapDao<SysDepartment, Integer> implements SysDepartmentDao {
    @Autowired
    private SysDepartmentMapper sysDepartmentMapper;


    public DaoMapper<SysDepartment, Integer> getDaoMapper() {
        return sysDepartmentMapper;
    }

    @Resource(name = "sqlSessionFactory")

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}