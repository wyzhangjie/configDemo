/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package org.apache.shiro.session.mgt;


import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;
import org.apache.shiro.session.Session;
import org.apache.shiro.web.session.mgt.WebSessionContext;
import org.springframework.stereotype.Repository;
import com.framework.demo.utils.HexObjUtils;
import com.framework.demo.utils.IpUtils;

import javax.servlet.http.HttpServletRequest;


@Repository
public class OnlineSessionFactory implements SessionFactory {

    public Session createSession(SessionContext initData) {
        OnlineSession session = new OnlineSession();
        if (initData != null && initData instanceof WebSessionContext) {
            WebSessionContext sessionContext = (WebSessionContext) initData;
            HttpServletRequest request = (HttpServletRequest) sessionContext.getServletRequest();
            if (request != null) {
                session.setHost(IpUtils.getIpAddr(request));
                session.setUserAgent(request.getHeader("User-Agent"));
                session.setSystemHost(request.getLocalAddr() + ":" + request.getLocalPort());
            }
        }
        return session;
    }

    public Session createSession(SysUserOnline userOnline) {
        return (Session)HexObjUtils.nullSafeGet(userOnline.getSession());
    }
}
