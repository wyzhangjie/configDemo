/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysAuth.dao;

import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_auth`
 */
@Mapper
public interface SysAuthMapper extends ExtendDaoMapper<SysAuth, Long> {
   /* Set<String> findStringRoles(SysUser user);*/

    Set<String> findStringPermissions(SysUser user);

    SysAuth findByUserid(Long userId);
}