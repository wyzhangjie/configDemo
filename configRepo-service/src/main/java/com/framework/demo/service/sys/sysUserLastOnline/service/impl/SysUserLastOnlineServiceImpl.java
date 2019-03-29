/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserLastOnline.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysUserLastOnline.service.SysUserLastOnlineService;
import com.framework.demo.sys.sysUserLastOnline.bo.SysUserLastOnline;

import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_user_last_online`
 */
@Service("sysUserLastOnlineService")
public class SysUserLastOnlineServiceImpl extends GenericSqlMapServiceImpl<SysUserLastOnline, Long> implements SysUserLastOnlineService {
    @Resource(name = "sysUserLastOnlineDao")
    private SysUserLastOnlineDao sysUserLastOnlineDao;


    public SqlMapDao<SysUserLastOnline, Long> getDao() {
        return sysUserLastOnlineDao;
    }


    public Object findByUserId(Long id) {
        return sysUserLastOnlineDao.findByUserId(id);
    }
}