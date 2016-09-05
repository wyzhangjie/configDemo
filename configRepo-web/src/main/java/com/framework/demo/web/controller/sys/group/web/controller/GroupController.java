/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.group.web.controller;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.enums.BooleanEnum;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import com.framework.demo.enm.GroupType;
import com.framework.demo.service.sys.sysGroup.service.SysGroupService;
import com.framework.demo.service.sys.sysGroupRelation.service.SysGroupRelationService;
import com.framework.demo.sys.sysGroup.bo.SysGroup;

import com.framework.demo.common.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.framework.demo.web.bind.annotation.PageableDefaults;
import com.framework.demo.web.controller.BaseCRUDController;
import com.framework.demo.web.controller.permission.PermissionList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>User: hyssop
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/admin/sys/group")
public class GroupController extends BaseCRUDController<SysGroup, Long> {

    @Autowired
    private SysGroupRelationService groupRelationService;


    public GroupController() {
        setListAlsoSetCommonData(true);
        setResourceIdentity("sys:group");
    }

    private SysGroupService getGroupService() {
        return (SysGroupService) baseService;
    }

    @Override
    protected void setCommonData(Model model) {
        super.setCommonData(model);
        model.addAttribute("types", GroupType.values());
        model.addAttribute("booleanList", BooleanEnum.values());
    }


    @RequestMapping(value = "{type}/list", method = RequestMethod.GET)
    @PageableDefaults(sort = "id=desc")
    public String list(@PathVariable("type") GroupType type, Searchable searchable, Model model) {

        searchable.addSearchParam("type_eq", type);

        return list(searchable, model);
    }

    @RequestMapping(value = "create/discard", method = RequestMethod.GET)
    public String showCreateForm(Model model) {
        throw new RuntimeException("discarded method");
    }


    @RequestMapping(value = "{type}/create", method = RequestMethod.GET)
    public String showCreateFormWithType(@PathVariable("type") GroupType type, Model model) {
        if (!model.containsAttribute("m")) {
            SysGroup group = new SysGroup();
            group.setType(type.getInfo());
            model.addAttribute("m", group);
        }
        return super.showCreateForm(model);
    }

    @RequestMapping(value = "{type}/create", method = RequestMethod.POST)
    public String create(
            Model model, @Valid @ModelAttribute("m") SysGroup m, BindingResult result,
            RedirectAttributes redirectAttributes) {

        return super.create(model, m, result, redirectAttributes);
    }


    @RequestMapping(value = "/changeStatus/{newStatus}")
    public String changeShowStatus(
            HttpServletRequest request,
            @PathVariable("newStatus") Boolean newStatus,
            @RequestParam("ids") Long[] ids
    ) {

        this.permissionList.assertHasUpdatePermission();

        for (Long id : ids) {
            SysGroup group = getGroupService().findById(id);
            group.setIsShow(newStatus);
            getGroupService().saveOrUpdate(group);
        }
        return "redirect:" + request.getAttribute(Constants.BACK_URL);
    }


    @RequestMapping(value = "/changeDefaultGroup/{newStatus}")
    public String changeDefaultGroup(
            HttpServletRequest request,
            @PathVariable("newStatus") Boolean newStatus,
            @RequestParam("ids") Long[] ids
    ) {

        this.permissionList.assertHasUpdatePermission();

        for (Long id : ids) {
            SysGroup group = getGroupService().findById(id);
            if (group.getType() != GroupType.user.toString()) {//只有用户组 可设置为默认 其他无效
                continue;
            }
            group.setDefaultGroup(newStatus);
            getGroupService().saveOrUpdate(group);
        }
        return "redirect:" + request.getAttribute(Constants.BACK_URL);
    }


    @RequestMapping("ajax/autocomplete")
    @PageableDefaults(value = 30)
    @ResponseBody
    public Set<Map<String, Object>> autocomplete (
            Searchable searchable,
            @RequestParam("term") String term) {
        Set<Map<String,Object>> maps = new HashSet<Map<String, Object>>();
        try {
            maps= getGroupService().findIdAndNames(searchable, term);
            return  maps;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maps;
    }


    ///////////////////////////////分组 内//////////////////////////////////////
    @RequestMapping(value = "/{group}/listRelation", method = RequestMethod.GET)
    @PageableDefaults(sort = "id=desc")
    public String listGroupRelation(@PathVariable("group") SysGroup group, Searchable searchable, Model model)  throws Exception{

        this.permissionList.assertHasViewPermission();

        searchable.addSearchParam("groupId_eq", group.getId());

        Page page = null;
        if (group.getType() == GroupType.user.toString()) {
            page = groupRelationService.findBySearchable(searchable);
        }

        if (group.getType() == GroupType.organization.toString()) {
            page = groupRelationService.findBySearchable(searchable);
        }

        model.addAttribute("page", page);

        return viewName("relation/relationList");
    }


    @RequestMapping(value = "/{group}/listRelation", headers = "table=true", method = RequestMethod.GET)
    @PageableDefaults(sort = "id=desc")
    public String listGroupRelationTable(@PathVariable("group") SysGroup group, Searchable searchable, Model model) {

        this.permissionList.assertHasViewPermission();

        try {
            this.listGroupRelation(group, searchable, model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return viewName("relation/relationListTable");

    }

    @RequestMapping(value = "{group}/batch/delete", method = RequestMethod.GET)
    public String batchDeleteGroupRelation(
            @PathVariable("group") SysGroup group,
            @RequestParam("ids") Long[] ids,
            @RequestParam(value = Constants.BACK_URL, required = false) String backURL,
            RedirectAttributes redirectAttributes) {

        this.permissionList.assertHasDeletePermission();

        if (group.getType() == GroupType.user.toString()) {
            groupRelationService.deleteBantch(ids);
        }

        if (group.getType() == GroupType.organization.toString()) {
            groupRelationService.deleteBantch(ids);
        }

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "删除成功");
        return redirectToUrl(backURL);

    }

    @RequestMapping(value = "{group}/batch/append", method = RequestMethod.GET)
    public String showBatchAppendGroupRelationForm(@PathVariable("group") SysGroup group) {

        this.permissionList.assertHasAnyPermission(
                new String[]{PermissionList.CREATE_PERMISSION, PermissionList.UPDATE_PERMISSION});

        if (group.getType() == GroupType.user.toString()) {
            return viewName("relation/appendUserGroupRelation");
        }

        if (group.getType() == GroupType.organization.toString()) {
            return viewName("relation/appendOrganizationGroupRelation");
        }

        throw new RuntimeException("group type error");
    }

    @RequestMapping(value = "{group}/batch/append", method = RequestMethod.POST)
    public String batchAppendGroupRelation(
            @PathVariable("group") SysGroup group,
            @RequestParam("ids") Long[] ids,
            //只有用户组 有fromIds endIds
            @RequestParam(value = "startIds", required = false) Long[] startIds,
            @RequestParam(value = "endIds", required = false) Long[] endIds,
            @RequestParam(value = Constants.BACK_URL, required = false) String backURL,
            RedirectAttributes redirectAttributes) {

        this.permissionList.assertHasAnyPermission(
                new String[]{PermissionList.CREATE_PERMISSION, PermissionList.UPDATE_PERMISSION});

        if (group.getType() == GroupType.organization.toString()) {
            groupRelationService.appendRelation(group.getId(), ids);
        }

        if (group.getType() == GroupType.user.toString()) {
            groupRelationService.appendRelation(group.getId(), ids, startIds, endIds);
        }


        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "批量添加成功");

        return redirectToUrl(backURL);
    }


}
