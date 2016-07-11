/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysOrganization.dao;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.sys.sysOrganization.bo.SysOrganization;

/**
 * This class corresponds to the database table `sys_organization`
 */
@SqlMapper
public interface SysOrganizationMapper extends DaoMapper<SysOrganization, Long> {
}