/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.permission.web.controller;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.enums.AvailableEnum;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.service.sys.sysPermission.service.SysPermissionService;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.google.common.collect.Sets;

import com.framework.demo.common.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.framework.demo.web.controller.BaseCRUDController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/**
 * <p>User: hyssop
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/admin/sys/permission/role")
public class RoleController extends BaseCRUDController<SysRole, Long> {

    @Autowired
    private SysPermissionService permissionService;

    public RoleController() {
        setResourceIdentity("sys:role");
    }

    @Override
    protected void setCommonData(Model model){
        super.setCommonData(model);
        model.addAttribute("availableList", AvailableEnum.values());

        Searchable searchable = Searchable.newSearchable();
//        searchable.addSearchFilter("show", SearchOperator.eq, true);
        try {
            model.addAttribute("permissions", permissionService.findBySearchable(searchable));
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping(value = "create/discard", method = RequestMethod.POST)
    @Override
    public String create(
            Model model, @Valid @ModelAttribute("m") SysRole m, BindingResult result,
            RedirectAttributes redirectAttributes) {
        throw new RuntimeException("discarded method");
    }

    @RequestMapping(value = "{id}/update/discard", method = RequestMethod.POST)
    @Override
    public String update(
            Model model, @Valid @ModelAttribute("m") SysRole m, BindingResult result,
            @RequestParam(value = Constants.BACK_URL, required = false) String backURL,
            RedirectAttributes redirectAttributes) {

        throw new RuntimeException("discarded method");
    }


    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createWithResourcePermission(
            Model model,
            @Valid @ModelAttribute("m") SysRole role, BindingResult result,
            @RequestParam("resourceId") Long[] resourceIds,
            @RequestParam("permissionIds") Long[][] permissionIds,
            RedirectAttributes redirectAttributes) {

        fillResourcePermission(role, resourceIds, permissionIds);

        return super.create(model, role, result, redirectAttributes);
    }

    @RequestMapping(value = "{id}/update", method = RequestMethod.POST)
    public String updateWithResourcePermission(
            Model model,
            @Valid @ModelAttribute("m") SysRole role, BindingResult result,
            @RequestParam("resourceId") Long[] resourceIds,
            @RequestParam("permissionIds") Long[][] permissionIds,
            @RequestParam(value = Constants.BACK_URL, required = false) String backURL,
            RedirectAttributes redirectAttributes) {

        fillResourcePermission(role, resourceIds, permissionIds);

        return super.update(model, role, result, backURL, redirectAttributes);
    }

    private void fillResourcePermission(SysRole role, Long[] resourceIds, Long[][] permissionIds) {
        int resourceLength = resourceIds.length;
        if (resourceIds.length == 0) {
            return;
        }

        if (resourceLength == 1) { //如果长度为1  那么permissionIds就变成如[[0],[1],[2]]这种
            Set<Long> permissionIdSet = Sets.newHashSet();
            for (Long[] permissionId : permissionIds) {
                permissionIdSet.add(permissionId[0]);
            }
            SysRoleResourcePermission sysRoleResourcePermission = new SysRoleResourcePermission();
            sysRoleResourcePermission.setResourceId(resourceIds[0]);
            sysRoleResourcePermission.setPermissionIds(StringUtils.arrayToDelimitedString(permissionIdSet.toArray(), ","));
            role.addResourcePermission(
                    sysRoleResourcePermission
            );

        } else {
            for (int i = 0; i < resourceLength; i++) {
                SysRoleResourcePermission sysRoleResourcePermission = new SysRoleResourcePermission();
                sysRoleResourcePermission.setResourceId(resourceIds[i]);
                sysRoleResourcePermission.setPermissionIds(StringUtils.arrayToDelimitedString(Sets.newHashSet(permissionIds[i]).toArray(),","));

                role.addResourcePermission(
                        sysRoleResourcePermission
                );
            }
        }

    }

    @RequestMapping(value = "/changeStatus/{newStatus}")
    public String changeStatus(
            HttpServletRequest request,
            @PathVariable("newStatus") Boolean newStatus,
            @RequestParam("ids") Long[] ids,
            RedirectAttributes redirectAttributes
    ) {

        this.permissionList.assertHasUpdatePermission();

        for (Long id : ids) {
            SysRole role = baseService.findById(id);
            role.setIsShow(newStatus);
            baseService.saveOrUpdate(role);
        }

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "操作成功！");

        return "redirect:" + request.getAttribute(Constants.BACK_URL);
    }


    @RequestMapping("{role}/permissions")
    public String permissions(@PathVariable("role") SysRole role) {
        return viewName("permissionsTable");
    }

}
