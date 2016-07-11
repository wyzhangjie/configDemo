/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOnline.bo;

import org.apache.shiro.session.mgt.OnlineSession;
import utils.HexObjUtils;

import java.io.IOException;

/**
 * This class corresponds to the database table `sys_user_online`
 */
public class SysUserOnline extends SysUserOnlineBase {
    public static final SysUserOnline fromOnlineSession(OnlineSession session) throws IOException {
        SysUserOnline online = new SysUserOnline();
        online.setId(String.valueOf(session.getId()));
        online.setUserId(session.getUserId());
        online.setUsername(session.getUsername());

        online.setLastAccessTime(session.getLastAccessTime());
        online.setTimeout(session.getTimeout());
        online.setHost(session.getHost());
        online.setUserAgent(session.getUserAgent());
        online.setSystemHost(session.getSystemHost());
        online.setSession(HexObjUtils.nullSafeSet(session));

        return online;
    }
}