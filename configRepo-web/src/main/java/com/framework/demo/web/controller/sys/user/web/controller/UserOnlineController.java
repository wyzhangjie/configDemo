/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.user.web.controller;


import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.mgt.OnlineSession;
import org.apache.shiro.session.mgt.eis.OnlineSessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.framework.demo.utils.MessageUtils;
import com.framework.demo.web.controller.BaseCRUDController;

/**
 * <p>User: hyssop
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/admin/sys/user/online")
public class UserOnlineController extends BaseCRUDController<SysUserOnline, String> {

    @Autowired
    private OnlineSessionDAO onlineSessionDAO;

    public UserOnlineController() {
    }



    public String list(Searchable searchable, Model model) {
        if (!SecurityUtils.getSubject().isPermitted("sys:userOnline:view or monitor:userOnline:view")) {
            throw new UnauthorizedException(MessageUtils.message("no.view.permission", "sys:userOnline:view或monitor:userOnline:view"));
        }
        return super.list(searchable, model);
    }

    @RequestMapping("/forceLogout")
    public String forceLogout(@RequestParam(value = "ids") String[] ids) {

        if (!SecurityUtils.getSubject().isPermitted("sys:userOnline or monitor:userOnline")) {
            throw new UnauthorizedException(MessageUtils.message("no.view.permission", "sys:userOnline或monitor:userOnline"));
        }

        for (String id : ids) {
            SysUserOnline online = baseService.findById(id);
            if (online == null) {
                continue;
            }
            OnlineSession onlineSession = (OnlineSession) onlineSessionDAO.readSession(online.getId());
            if (onlineSession == null) {
                continue;
            }
            onlineSession.setStatus(OnlineSession.OnlineStatus.force_logout);
            online.setStatus(OnlineSession.OnlineStatus.force_logout.getInfo());
            baseService.saveOrUpdate(online);
        }
        return redirectToUrl(null);
    }

}
