/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserStatusHistory.service.impl;


import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.service.sys.sysUserStatusHistory.service.SysUserStatusHistoryService;
import com.framework.demo.sys.sysUserStatusHistory.bo.SysUserStatusHistory;
import com.framework.demo.sys.sysUserStatusHistory.dao.SysUserStatusHistoryMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_user_status_history`
 */
@Service("sysUserStatusHistoryService")
public class SysUserStatusHistoryServiceImpl extends GenericSqlMapServiceImpl<SysUserStatusHistory, Long> implements SysUserStatusHistoryService {
    @Autowired
    private SysUserStatusHistoryMapper sysUserStatusHistoryDao;


    public DaoMapper<SysUserStatusHistory, Long> getDao() {
        return sysUserStatusHistoryDao;
    }


    public String getLastReason(SysUser user) {
        return sysUserStatusHistoryDao.getLastReason(user);
    }
}