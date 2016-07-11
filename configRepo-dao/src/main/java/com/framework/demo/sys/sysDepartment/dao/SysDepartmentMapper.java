/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysDepartment.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysDepartment.bo.SysDepartment;

/**
 * This class corresponds to the database table `sys_department`
 */
@SqlMapper
public interface SysDepartmentMapper extends DaoMapper<SysDepartment, Integer> {
}