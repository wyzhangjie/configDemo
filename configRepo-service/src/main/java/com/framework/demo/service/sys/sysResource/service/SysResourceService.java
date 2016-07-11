/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysResource.service;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.sys.sysResource.bo.SysResource;

/**
 * This class corresponds to the database table `sys_resource`
 */
public interface SysResourceService extends GenericService<SysResource, Long> {
    String findActualResourceIdentity(SysResource resource);
}