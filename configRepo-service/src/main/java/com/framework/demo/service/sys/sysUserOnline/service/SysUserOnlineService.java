/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysUserOnline.service;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Page;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.PageRequest;
import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;

import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `sys_user_online`
 */
public interface SysUserOnlineService extends GenericService<SysUserOnline, String> {
    void offline(String s);


    SysUserOnline findOne(String s);

    void online(SysUserOnline sysUserOnline);

    Page<SysUserOnline> findExpiredUserOnlineList(Date expiredDate, PageRequest pageRequest);

    void batchOffline(List<String> needOfflineIdList);
}