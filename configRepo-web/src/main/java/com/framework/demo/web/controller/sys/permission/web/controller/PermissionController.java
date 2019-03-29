/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.permission.web.controller;


import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sys.sysPermission.service.SysPermissionService;
import com.framework.demo.sys.sysPermission.bo.SysPermission;
import com.framework.demo.common.Constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.framework.demo.web.controller.BaseCRUDController;
import com.github.fartherp.framework.database.mybatis.plugin.search.enums.AvailableEnum;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>User: hyssop
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/admin/sys/permission/permission")
public class PermissionController extends BaseCRUDController<SysPermission, Long> {

    public PermissionController() {
        setResourceIdentity("sys:permission");
    }


    protected void setCommonData(Model model) {
        super.setCommonData(model);
        model.addAttribute("availableList", AvailableEnum.values());
    }
    @Autowired
    private SysPermissionService getBaseService() {
        return (SysPermissionService) baseService;
    }

    @RequestMapping(value = "/changeStatus/{newStatus}")
    public String changeStatus(
            HttpServletRequest request,
            @PathVariable("newStatus") Boolean newStatus,
            @RequestParam("ids") Long[] ids
    ) {

        this.permissionList.assertHasUpdatePermission();

        for (Long id : ids) {
            SysPermission permission = getBaseService().findById(id);
            permission.setIsShow(newStatus);
            baseService.saveOrUpdate(permission);
        }


        return "redirect:" + request.getAttribute(Constants.BACK_URL);
    }


}
