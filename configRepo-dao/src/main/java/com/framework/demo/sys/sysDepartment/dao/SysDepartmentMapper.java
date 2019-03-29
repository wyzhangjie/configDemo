/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysDepartment.dao;

import com.framework.demo.sys.sysDepartment.bo.SysDepartment;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_department`
 */
@Mapper
public interface SysDepartmentMapper extends DaoMapper<SysDepartment, Integer> {
}