/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.showcase.deleted;

import cn.vansky.framework.core.orm.mybatis.plugin.search.enums.BooleanEnum;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;

import com.framework.demo.enm.Sex;
import com.framework.demo.service.samplecaseSample.ShowcaseSampleService;
import com.framework.demo.utils.converter.StringToDateConverter;
import com.framework.demo.vo.showcase.ShowcaseSampleVo;
import com.framework.demo.web.controller.BaseCRUDController;
import com.framework.demo.web.validate.ValidateResponse;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-1-28 下午4:29
 * <p>Version: 1.0
 */
@Controller
@RequestMapping(value = "/showcase/deleted")
public class DeletedSampleController extends BaseCRUDController<ShowcaseSample, Long> {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private ShowcaseSampleService getSampleService() {
        return (ShowcaseSampleService) baseService;
    }

    public DeletedSampleController() {
        setListAlsoSetCommonData(true);
        setResourceIdentity("showcase:deleted");
    }


    protected void setCommonData(Model model) {
        super.setCommonData(model);
        model.addAttribute("sexList", Sex.values());
        model.addAttribute("booleanList", BooleanEnum.values());
    }

    /**
     * 验证失败返回true
     *
     * @param m
     * @param result
     * @return
     */

    protected boolean hasError(ShowcaseSample m, BindingResult result) {
        Assert.notNull(m);
        //字段错误 前台使用<es:showFieldError commandName="showcase/sample"/> 显示
        try {
            if (m.getBirthday() != null && dateFormat.parse(m.getBirthday()).after(new Date())) {
                //前台字段名（前台使用[name=字段名]取得dom对象） 错误消息键。。
                result.rejectValue("m.birthday", "birthday.past");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //全局错误 前台使用<es:showGlobalError commandName="showcase/sample"/> 显示
        if (m.getName().contains("admin")) {
            result.reject("name.must.not.admin");
        }
        return result.hasErrors();
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
        if ("name".equals(fieldId)) {
            ShowcaseSample sample = getSampleService().findByName(fieldValue);
            if (sample == null || (sample.getId().equals(id) && sample.getName().equals(fieldValue))) {
                //如果msg 不为空 将弹出提示框
                response.validateSuccess(fieldId, "");
            } else {
                response.validateFail(fieldId, "该名称已被其他人使用");
            }
        }
        return response.result();
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
