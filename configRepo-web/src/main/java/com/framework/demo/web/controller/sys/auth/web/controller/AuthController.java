/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.auth.web.controller;


import com.framework.demo.enm.AuthType;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sysRole.SysRoleService;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;
import com.framework.demo.common.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.framework.demo.web.bind.annotation.SearchableDefaults;
import com.framework.demo.web.controller.BaseCRUDController;

import javax.validation.Valid;

/**
 * <p>User: hyssop
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/admin/sys/auth")
public class AuthController extends BaseCRUDController<SysAuth, Long> {

    @Autowired
    private SysRoleService roleService;

    public AuthController() {
        setListAlsoSetCommonData(true);
        setResourceIdentity("sys:auth");
    }

    private SysAuthService getAuthService() {
        return (SysAuthService) baseService;
    }


    protected void setCommonData(Model model) {
        super.setCommonData(model);
        model.addAttribute("types", AuthType.values());

        Searchable searchable = Searchable.newSearchable();
//        searchable.addSearchFilter("show", SearchOperator.eq, true);
        try {
            model.addAttribute("roles", roleService.findBySearchable(searchable));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @SearchableDefaults(value = "type_eq=user")

    public String list(Searchable searchable, Model model) throws Exception{
        String typeName = String.valueOf(searchable.getValue("type_eq"));
        model.addAttribute("type", AuthType.valueOf(typeName));
        return super.list(searchable, model);
    }

    @RequestMapping(value = "create/discarded", method = RequestMethod.GET)
    public String showCreateForm(Model model) {
        throw new RuntimeException("discard method");
    }

    @RequestMapping(value = "create/discarded", method = RequestMethod.POST)
    public String create(
            Model model, @Valid @ModelAttribute("m") SysAuth m, BindingResult result,
            RedirectAttributes redirectAttributes) {
        throw new RuntimeException("discard method");
    }

    @RequestMapping(value = "{type}/create", method = RequestMethod.GET)
    public String showCreateFormWithType(@PathVariable("type") AuthType type, Model model) throws Exception{
        SysAuth auth = new SysAuth();
        auth.setType(type.name());
        model.addAttribute("m", auth);
        return super.showCreateForm(model);
    }

    @RequestMapping(value = "{type}/create", method = RequestMethod.POST)
    public String createWithType(
            Model model,
            @RequestParam(value = "userIds", required = false) Long[] userIds,
            @RequestParam(value = "groupIds", required = false) Long[] groupIds,
            @RequestParam(value = "organizationIds", required = false) Long[] organizationIds,
            @RequestParam(value = "jobIds", required = false) Long[][] jobIds,
            @Valid @ModelAttribute("m") SysAuth m, BindingResult result,
            RedirectAttributes redirectAttributes) {
        this.permissionList.assertHasCreatePermission();
        if (hasError(m, result)) {
            return showCreateForm(model);
        }
        if (m.getType() == AuthType.user.toString()) {
            getAuthService().addUserAuth(userIds, m);
        } else if (m.getType() == AuthType.user_group.toString() || m.getType() == AuthType.organization_group.toString()) {
            getAuthService().addGroupAuth(groupIds, m);
        } else if (m.getType() == AuthType.organization_job.toString()) {
            getAuthService().addOrganizationJobAuth(organizationIds, jobIds, m);
        }
        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "新增成功");
        return redirectToUrl("/admin/sys/auth?search.type_eq=" + m.getType());
    }
}
