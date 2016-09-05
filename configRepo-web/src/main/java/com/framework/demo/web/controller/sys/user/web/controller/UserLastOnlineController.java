/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.user.web.controller;


import com.framework.demo.sys.sysUserLastOnline.bo.SysUserLastOnline;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.framework.demo.web.controller.BaseCRUDController;

/**
 * <p>User: hyssop
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/admin/sys/user/lastOnline")
public class UserLastOnlineController extends BaseCRUDController<SysUserLastOnline, Long> {

    public UserLastOnlineController() {
        setResourceIdentity("sys:userLastOnline");
    }
}
