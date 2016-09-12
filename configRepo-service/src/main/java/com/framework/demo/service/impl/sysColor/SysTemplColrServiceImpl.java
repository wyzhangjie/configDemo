/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.sysColor;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.dao.sysTemplColr.SysTemplColrDao;
import com.framework.demo.service.sysColor.SysTemplColrService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
@Service("sysTemplColrService")
public class SysTemplColrServiceImpl extends GenericSqlMapServiceImpl<SysTemplColr, Integer> implements SysTemplColrService {
    @Resource(name = "sysTemplColrDao")
    private SysTemplColrDao sysTemplColrDao;


    public SqlMapDao<SysTemplColr, Integer> getDao() {
        return sysTemplColrDao;
    }


    public int insert(SysTemplColr sysTemplColr) {
        return sysTemplColrDao.insert(sysTemplColr);
    }


    public SysTemplColr findByModl(Integer model) {
        return sysTemplColrDao.findByModl(model);
    }
}