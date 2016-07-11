/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserStatusHistory.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.service.sys.sysUserStatusHistory.service.SysUserStatusHistoryService;
import com.framework.demo.sys.sysUserStatusHistory.bo.SysUserStatusHistory;
import com.framework.demo.sys.sysUserStatusHistory.dao.SysUserStatusHistoryDao;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_user_status_history`
 */
@Service("sysUserStatusHistoryService")
public class SysUserStatusHistoryServiceImpl extends GenericSqlMapServiceImpl<SysUserStatusHistory, Long> implements SysUserStatusHistoryService {
    @Resource(name = "sysUserStatusHistoryDao")
    private SysUserStatusHistoryDao sysUserStatusHistoryDao;

    @Override
    public SqlMapDao<SysUserStatusHistory, Long> getDao() {
        return sysUserStatusHistoryDao;
    }

    @Override
    public String getLastReason(SysUser user) {
        return sysUserStatusHistoryDao.getLastReason(user);
    }
}