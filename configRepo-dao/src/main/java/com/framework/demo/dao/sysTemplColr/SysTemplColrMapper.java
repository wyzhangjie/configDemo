/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysTemplColr;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
@SqlMapper
public interface SysTemplColrMapper extends DaoMapper<SysTemplColr, Integer> {
    SysTemplColr findByModl(Integer model);
}