/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserOnline.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysUserOnline.service.SysUserOnlineService;
import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;
import com.framework.demo.sys.sysUserOnline.dao.SysUserOnlineDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `sys_user_online`
 */
@Service("sysUserOnlineService")
public class SysUserOnlineServiceImpl extends GenericSqlMapServiceImpl<SysUserOnline, String> implements SysUserOnlineService {
    @Resource(name = "sysUserOnlineDao")
    private SysUserOnlineDao sysUserOnlineDao;

    @Override
    public SqlMapDao<SysUserOnline, String> getDao() {
        return sysUserOnlineDao;
    }

    @Override
    public void offline(String s) {
        SysUserOnline userOnline = findOne(s);
        if (userOnline != null) {
            delete(userOnline);
        }
    }

    @Override
    public SysUserOnline findOne(String s) {
        return sysUserOnlineDao.findById(s);
    }

    @Override
    public void online(SysUserOnline sysUserOnline) {
        sysUserOnlineDao.update(sysUserOnline);
    }

    @Override
    public Page<SysUserOnline> findExpiredUserOnlineList(Date expiredDate, PageRequest pageRequest) {
        return null;
    }

    @Override
    public void batchOffline(List<String> needOfflineIdList) {

    }
}