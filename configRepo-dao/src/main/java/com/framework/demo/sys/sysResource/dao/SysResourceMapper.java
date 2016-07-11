/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysResource.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysResource.bo.SysResource;

/**
 * This class corresponds to the database table `sys_resource`
 */
@SqlMapper
public interface SysResourceMapper extends DaoMapper<SysResource, Long> {
    String findActualResourceIdentity(SysResource resource);
}