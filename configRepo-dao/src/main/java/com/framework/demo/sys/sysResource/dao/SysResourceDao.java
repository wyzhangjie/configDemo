/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysResource.dao;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.sys.sysResource.bo.SysResource;

/**
 * This class corresponds to the database table `sys_resource`
 */
public interface SysResourceDao extends SqlMapDao<SysResource, Long> {
    String findActualResourceIdentity(SysResource resource);
}