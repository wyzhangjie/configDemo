/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sysColor;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
public interface SysTemplColrService extends GenericService<SysTemplColr, Integer> {
    int insert(SysTemplColr sysTemplColr);

    SysTemplColr findByModl(Integer model);
}