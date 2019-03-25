/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysTemplColr;

import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
@Mapper
public interface SysTemplColrMapper extends DaoMapper<SysTemplColr, Integer> {
    SysTemplColr findByModl(Integer model);
}