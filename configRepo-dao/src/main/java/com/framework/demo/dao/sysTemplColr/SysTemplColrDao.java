/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysTemplColr;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
public interface SysTemplColrDao extends SqlMapDao<SysTemplColr, Integer> {
    int insert(SysTemplColr sysTemplColr);

    SysTemplColr findByModl(Integer model);
}