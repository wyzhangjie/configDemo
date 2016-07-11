/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroup.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysGroup.bo.SysGroup;

/**
 * This class corresponds to the database table `sys_group`
 */
@SqlMapper
public interface SysGroupMapper extends DaoMapper<SysGroup, Long> {
}