/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.sysColor;


import javax.annotation.Resource;

import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.dao.sysTemplColr.SysTemplColrMapper;
import com.framework.demo.service.sysColor.SysTemplColrService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
@Service("sysTemplColrService")
public class SysTemplColrServiceImpl extends GenericSqlMapServiceImpl<SysTemplColr, Integer> implements SysTemplColrService {
    @Autowired
    private SysTemplColrMapper sysTemplColrDao;


    public DaoMapper<SysTemplColr, Integer> getDao() {
        return sysTemplColrDao;
    }


    public int insert(SysTemplColr sysTemplColr) {
        return sysTemplColrDao.insert(sysTemplColr);
    }


    public SysTemplColr findByModl(Integer model) {
        return sysTemplColrDao.findByModl(model);
    }
}