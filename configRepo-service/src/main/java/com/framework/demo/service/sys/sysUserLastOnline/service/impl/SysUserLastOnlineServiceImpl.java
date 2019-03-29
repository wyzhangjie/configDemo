/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserLastOnline.service.impl;



import javax.annotation.Resource;

import com.framework.demo.service.sys.sysUserLastOnline.service.SysUserLastOnlineService;
import com.framework.demo.sys.sysUserLastOnline.bo.SysUserLastOnline;
import com.framework.demo.sys.sysUserLastOnline.dao.SysUserLastOnlineMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_user_last_online`
 */
@Service("sysUserLastOnlineService")
public class SysUserLastOnlineServiceImpl extends GenericSqlMapServiceImpl<SysUserLastOnline, Long> implements SysUserLastOnlineService {
    @Resource(name = "sysUserLastOnlineDao")
    private SysUserLastOnlineMapper sysUserLastOnlineDao;


    public DaoMapper<SysUserLastOnline, Long> getDao() {
        return sysUserLastOnlineDao;
    }


    public Object findByUserId(Long id) {
        return sysUserLastOnlineDao.findByUserId(id);
    }
}