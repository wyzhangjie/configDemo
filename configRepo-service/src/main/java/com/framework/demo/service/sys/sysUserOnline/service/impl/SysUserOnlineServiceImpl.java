/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserOnline.service.impl;

import javax.annotation.Resource;

import com.framework.demo.service.sys.sysUserOnline.service.SysUserOnlineService;
import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;
import com.framework.demo.sys.sysUserOnline.dao.SysUserOnlineMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.PageRequest;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `sys_user_online`
 */
@Service("sysUserOnlineService")
public class SysUserOnlineServiceImpl extends GenericSqlMapServiceImpl<SysUserOnline, String> implements SysUserOnlineService {

    @Autowired
    private SysUserOnlineMapper sysUserOnlineDao;

    public DaoMapper<SysUserOnline, String> getDao() {
        return sysUserOnlineDao;
    }

    public void offline(String s) {
        SysUserOnline userOnline = findOne(s);
        if (userOnline != null) {
            delete(userOnline.getId());
        }
    }

    public SysUserOnline findOne(String s) {
        return sysUserOnlineDao.selectByPrimaryKey(s);
    }


    public void online(SysUserOnline sysUserOnline) {
        sysUserOnlineDao.insert(sysUserOnline);
    }

    public Pagination<SysUserOnline> findExpiredUserOnlineList(Date expiredDate, PageRequest pageRequest) {
        return null;
    }

    public void batchOffline(List<String> needOfflineIdList) {

    }
}