/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.user.web.controller;

import cn.vansky.framework.core.orm.mybatis.plugin.search.enums.BooleanEnum;
import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.bo.sysUser.SysUser;

import com.framework.demo.enm.UserStatus;
import com.framework.demo.service.showcaseTree.ShowcaseTreeService;
import com.framework.demo.service.sys.sysUserLastOnline.service.SysUserLastOnlineService;
import com.framework.demo.service.sys.sysUserStatusHistory.service.PasswordService;
import com.framework.demo.service.sysuser.SysUserService;

import com.framework.demo.web.controller.BaseController;
import com.framework.demo.web.controller.sys.user.web.bind.annotation.CurrentUser;
import com.framework.demo.common.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 登录用户的个人信息
 * <p>User: hyssop
 * <p>Date: 13-3-30 下午2:00
 * <p>Version: 1.0
 */
@Controller()
@RequestMapping("/admin/sys/user/loginUser")
public class LoginUserController extends BaseController<SysUser, Long> {
    @Autowired
    ShowcaseTreeService showcaseTreeService;

    @Autowired
    private SysUserService userService;

    @Autowired
    private PasswordService passwordService;

    @Autowired
    private SysUserLastOnlineService sysUserLastOnlineService;



    public void setCommonData(Model model) {
        model.addAttribute("booleanList", BooleanEnum.values());
        model.addAttribute("statusList", UserStatus.values());
    }

    @RequestMapping("/viewInfo")
    public String viewInfo(@CurrentUser SysUser user, Model model) {
        setCommonData(model);
        model.addAttribute(Constants.OP_NAME, "查看个人资料");
        user = userService.findById(user.getId());
        model.addAttribute("user", user);
        model.addAttribute("lastOnline", sysUserLastOnlineService.findByUserId(user.getId()));
        return viewName("editForm");
    }

    @RequestMapping(value = "/updateInfo", method = RequestMethod.GET)
    public String updateInfoForm(@CurrentUser SysUser user, Model model) {
        setCommonData(model);
        model.addAttribute(Constants.OP_NAME, "修改个人资料");
        model.addAttribute("user", user);
        return viewName("editForm");
    }

    @RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
    public String updateInfo(
            @CurrentUser SysUser user,
            @RequestParam("email") String email,
            @RequestParam("mobilePhoneNumber") String mobilePhoneNumber,
            Model model,
            RedirectAttributes redirectAttributes) {

        if (email == null || !email.matches(SysUser.EMAIL_PATTERN)) {
            model.addAttribute(Constants.ERROR, "请输入正确的邮箱地址");
            return updateInfoForm(user, model);
        }

        if (mobilePhoneNumber == null || !mobilePhoneNumber.matches(SysUser.MOBILE_PHONE_NUMBER_PATTERN)) {
            model.addAttribute(Constants.ERROR, "请输入正确的手机号");
            return updateInfoForm(user, model);
        }

        SysUser emailDbUser = userService.findByEmail(email);
        if (emailDbUser != null && !emailDbUser.equals(user)) {
            model.addAttribute(Constants.ERROR, "邮箱地址已经被其他人使用，请换一个");
            return updateInfoForm(user, model);
        }

        SysUser mobilePhoneNumberDbUser = userService.findByMobilePhoneNumber(mobilePhoneNumber);
        if (mobilePhoneNumberDbUser != null && !mobilePhoneNumberDbUser.equals(user)) {
            model.addAttribute(Constants.ERROR, "手机号已经被其他人使用，请换一个");
            return updateInfoForm(user, model);
        }

        user.setEmail(email);
        user.setMobilePhoneNumber(mobilePhoneNumber);
        userService.saveOrUpdate(user);

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "修改个人资料成功");

        return redirectToUrl(viewName("updateInfo"));

    }


    @RequestMapping(value = "/changePassword", method = RequestMethod.GET)
    public String changePasswordForm(@CurrentUser SysUser user, Model model) {
        setCommonData(model);
        model.addAttribute(Constants.OP_NAME, "修改密码");
        model.addAttribute("user", user);
        return viewName("changePasswordForm");
    }

    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public String changePassword(
            @CurrentUser SysUser user,
            @RequestParam(value = "oldPassword") String oldPassword,
            @RequestParam(value = "newPassword1") String newPassword1,
            @RequestParam(value = "newPassword2") String newPassword2,
            Model model,
            RedirectAttributes redirectAttributes) {

        if (!passwordService.matches(user, oldPassword)) {
            model.addAttribute(Constants.ERROR, "旧密码不正确");
            return changePasswordForm(user, model);
        }

        if (StringUtils.isEmpty(newPassword1) || StringUtils.isEmpty(newPassword2)) {
            model.addAttribute(Constants.ERROR, "必须输入新密码");
            return changePasswordForm(user, model);
        }

        if (!newPassword1.equals(newPassword2)) {
            model.addAttribute(Constants.ERROR, "两次输入的密码不一致");
            return changePasswordForm(user, model);
        }

        userService.changePassword(user.getId(), newPassword1);

        redirectAttributes.addFlashAttribute(Constants.MESSAGE, "修改密码成功");
        return redirectToUrl(viewName("changePassword"));
    }


}
