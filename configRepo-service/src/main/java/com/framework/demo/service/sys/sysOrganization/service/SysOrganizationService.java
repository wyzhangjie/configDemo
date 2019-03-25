/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysOrganization.service;

import com.github.fartherp.framework.database.service.GenericService;
import cn.vansky.framework.tree.service.BaseTreeableService;
import com.framework.demo.sys.sysOrganization.bo.SysOrganization;

/**
 * This class corresponds to the database table `sys_organization`
 */
public interface SysOrganizationService extends BaseTreeableService<SysOrganization, Long> {
}