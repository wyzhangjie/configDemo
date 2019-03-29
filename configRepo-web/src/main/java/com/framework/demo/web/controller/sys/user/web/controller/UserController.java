/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.user.web.controller;


import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.common.Constants;
import com.framework.demo.enm.UserStatus;
import com.framework.demo.service.sysuser.SysUserService;
import com.framework.demo.sys.sysJob.bo.SysJob;
import com.framework.demo.sys.sysOrganization.bo.SysOrganization;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import com.framework.demo.web.bind.annotation.CurrentUser;
import com.framework.demo.web.bind.annotation.PageableDefaults;
import com.framework.demo.web.bind.annotation.SearchableDefaults;
import com.framework.demo.web.controller.BaseCRUDController;
import com.framework.demo.web.validate.ValidateResponse;
import com.github.fartherp.framework.database.mybatis.plugin.search.enums.BooleanEnum;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;

/**
 * <p>User: hyssop
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller("adminUserController")
@RequestMapping(value = "/admin/sys/user")
public class UserController extends BaseCRUDController<SysUser, Long> {

    private SysUserService getUserService() {
        return (SysUserService) baseService;
    }

    public UserController() {
        setResourceIdentity("sys:user");
    }

    @Override
    protected void setCommonData(Model model) {
        model.addAttribute("statusList", UserStatus.values());
        model.addAttribute("booleanList", BooleanEnum.values());
    }


    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main(Model model) {
        return viewName("main");
    }

    @RequestMapping(value = "tree", method = RequestMethod.GET)
    public String tree(Model model) {
        return viewName("tree");
    }


    @RequestMapping(value = "list/discard", method = RequestMethod.GET)
    @PageableDefaults(sort = "id=desc")
    public String list(Searchable searchable, Model model) {
        throw new RuntimeException("discarded method");
    }

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    @PageableDefaults(sort = "id=desc")
    @SearchableDefaults(value = "deleted_eq=0")
    public String listAll(Searchable searchable, Model model) throws Exception {
        return list(null, null, searchable, model);
    }


    @RequestMapping(value = {"{organization}/{job}"}, method = RequestMethod.GET)
    @PageableDefaults(sort = "id=desc")
    @SearchableDefaults(value = "deleted_eq=0")
    public String list(
            @PathVariable("organization") SysOrganization organization,
            @PathVariable("job") SysJob sysJob,
            Searchable searchable, Model model) throws Exception {

        setCommonData(model);

        if (organization != null && !organization.isRoot()) {
            searchable.addSearchParam("organizationId", organization.getId());
        }
        if (sysJob != null && !sysJob.isRoot()) {
            searchable.addSearchParam("jobId", sysJob.getId());
        }

        return super.list(searchable, model);
    }


    @RequestMapping(value = "create/discard", method = RequestMethod.POST)
    @Override
    public String create(
            Model model, @Valid @ModelAttribute("m") SysUser m, BindingResult result,
            RedirectAttributes redirectAttributes) {
        throw new RuntimeException("discarded method");
    }

    @RequestMapping(value = "{id}/update/discard", method = RequestMethod.POST)
    @Override
    public String update(
            Model model, @Valid @ModelAttribute("m") SysUser m, BindingResult result,
            @RequestParam(value = Constants.BACK_URL, required = false) String backURL,
            RedirectAttributes redirectAttributes) {
        throw new RuntimeException("discarded method");
    }


    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createWithOrganization(
            Model model,
            @Valid @ModelAttribute("m") SysUser m, BindingResult result,
            @RequestParam(value = "organizationId", required = false) Long[] organizationIds,
            @RequestParam(value = "jobId", required = false) Long[][] jobIds,
            RedirectAttributes redirectAttributes) throws Exception {

        fillUserOrganization(m, organizationIds, jobIds);

        return super.create(model, m, result, redirectAttributes);
    }

    private void fillUserOrganization(SysUser m, Long[] organizationIds, Long[][] jobIds) {
        if (ArrayUtils.isEmpty(organizationIds)) {
            return;
        }
        for (int i = 0, l = organizationIds.length; i < l; i++) {

            //仅新增/修改一个 spring会自动split（“，”）--->给数组
            if (l == 1) {
                for (int j = 0, l2 = jobIds.length; j < l2; j++) {
                    SysUserOrganizationJob SysUserOrganizationJob = new SysUserOrganizationJob();
                    SysUserOrganizationJob.setOrganizationId(organizationIds[i]);
                    SysUserOrganizationJob.setJobId(jobIds[j][0]);
                /*    m.addOrganizationJob(SysUserOrganizationJob);*/
                }
            } else {
                Long[] jobId = jobIds[i];
                for (int j = 0, l2 = jobId.length; j < l2; j++) {
                    SysUserOrganizationJob SysUserOrganizationJob = new SysUserOrganizationJob();
                    SysUserOrganizationJob.setOrganizationId(organizationIds[i]);
                    SysUserOrganizationJob.setJobId(jobId[j]);
              /*      m.addOrganizationJob(SysUserOrganizationJob);*/
                }
            }

        }
    }

    @RequestMapping(value = "{id}/update", method = RequestMethod.POST)
    public String updateWithOrganization(
            Model model, @Valid @ModelAttribute("m") SysUser m, BindingResult result,
            @RequestParam(value = "organizationId", required = false) Long[] organizationIds,
            @RequestParam(value = "jobId", required = false) Long[][] jobIds,
            @RequestParam(value = Constants.BACK_URL, required = false) String backURL,
            RedirectAttributes redirectAttributes) throws Exception {

        fillUserOrganization(m, organizationIds, jobIds);

        return super.update(model, m, result, backURL, redirectAttributes);
    }


    @RequestMapping(value = "changePassword")
    public String changePassword(
            HttpServletRequest request,
            @RequestParam("ids") Long[] ids, @RequestParam("newPassword") String newPassword,
            @CurrentUser SysUser opUser,
            RedirectAttributes redirectAttributes) {

        getUserService().changePassword(opUser.getId(),  newPassword);

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "改密成功！");

        return redirectToUrl((String) request.getAttribute(Constants.BACK_URL));
    }

    @RequestMapping(value = "changeStatus/{newStatus}")
    public String changeStatus(
            HttpServletRequest request,
            @RequestParam("ids") Long[] ids,
            @PathVariable("newStatus") UserStatus newStatus,
            @RequestParam("reason") String reason,
            @CurrentUser SysUser opUser,
            RedirectAttributes redirectAttributes) {

        getUserService().changeStatus(opUser, ids, newStatus, reason);

        if (newStatus == UserStatus.normal) {
            redirectAttributes.addFlashAttribute(Constants.MESSAGE, "解封成功！");
        } else if (newStatus == UserStatus.blocked) {
            redirectAttributes.addFlashAttribute(Constants.MESSAGE, "封禁成功！");
        }

        return redirectToUrl((String) request.getAttribute(Constants.BACK_URL));
    }

    @RequestMapping(value = "recycle")
    public String recycle(HttpServletRequest request, @RequestParam("ids") Long[] ids, RedirectAttributes redirectAttributes) {
        for (Long id : ids) {
            SysUser user = getUserService().findById(id);
            user.setDeleted(Boolean.FALSE);
            getUserService().updateEntity(user);
        }
        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "还原成功！");
        return redirectToUrl((String) request.getAttribute(Constants.BACK_URL));
    }


    @RequestMapping("{user}/organizations")
    public String permissions(@PathVariable("user") SysUser user) {
        return viewName("organizationsTable");
    }


    @RequestMapping("ajax/autocomplete")
    @PageableDefaults(value = 30)
    @ResponseBody
    public Set<Map<String, Object>> autocomplete(
            Searchable searchable,
            @RequestParam("term") String term) throws InvocationTargetException, IllegalAccessException {

        return getUserService().findIdAndNames(searchable, term);
    }


    /**
     * 验证返回格式
     * 单个：[fieldId, 1|0, msg]
     * 多个：[[fieldId, 1|0, msg],[fieldId, 1|0, msg]]
     *
     * @param fieldId
     * @param fieldValue
     * @return
     */
    @RequestMapping(value = "validate", method = RequestMethod.GET)
    @ResponseBody
    public Object validate(
            @RequestParam("fieldId") String fieldId, @RequestParam("fieldValue") String fieldValue,
            @RequestParam(value = "id", required = false) Long id) {

        ValidateResponse response = ValidateResponse.newInstance();


        if ("username".equals(fieldId)) {
            SysUser user = getUserService().findByUsername(fieldValue);
            if (user == null || (user.getId().equals(id) && user.getUsername().equals(fieldValue))) {
                //如果msg 不为空 将弹出提示框
                response.validateSuccess(fieldId, "");
            } else {
                response.validateFail(fieldId, "用户名已被其他人使用");
            }
        }

        if ("email".equals(fieldId)) {
            SysUser user = getUserService().findByEmail(fieldValue);
            if (user == null || (user.getId().equals(id) && user.getEmail().equals(fieldValue))) {
                //如果msg 不为空 将弹出提示框
                response.validateSuccess(fieldId, "");
            } else {
                response.validateFail(fieldId, "邮箱已被其他人使用");
            }
        }

        if ("mobilePhoneNumber".equals(fieldId)) {
            SysUser user = getUserService().findByMobilePhoneNumber(fieldValue);
            if (user == null || (user.getId().equals(id) && user.getMobilePhoneNumber().equals(fieldValue))) {
                //如果msg 不为空 将弹出提示框
                response.validateSuccess(fieldId, "");
            } else {
                response.validateFail(fieldId, "手机号已被其他人使用");
            }
        }

        return response.result();
    }


}
