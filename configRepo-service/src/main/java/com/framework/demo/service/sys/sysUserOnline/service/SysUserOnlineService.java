/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserOnline.service;

import com.github.fartherp.framework.database.mybatis.plugin.page.PageRequest;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.service.ExtendGenericService;
import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;

import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `sys_user_online`
 */
public interface SysUserOnlineService extends ExtendGenericService<SysUserOnline, String> {
    void offline(String s);


    SysUserOnline findOne(String s);

    void online(SysUserOnline sysUserOnline);

    Pagination<SysUserOnline> findExpiredUserOnlineList(Date expiredDate, PageRequest pageRequest);

    void batchOffline(List<String> needOfflineIdList);
}