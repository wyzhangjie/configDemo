/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserLastOnline.dao;

import com.framework.demo.sys.sysUserLastOnline.bo.SysUserLastOnline;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_user_last_online`
 */
@Mapper
public interface SysUserLastOnlineMapper extends DaoMapper<SysUserLastOnline, Long> {
    Object findByUserId(Long id);
}