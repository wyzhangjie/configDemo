/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.web.controller;

import cn.vansky.framework.core.kv.handler.KvHandlerSupport;
import cn.vansky.framework.core.kv.service.KvService;
import cn.vansky.framework.core.util.JsonResp;
import cn.vansky.security.ISecurity;
import cn.vansky.security.single.MD5;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/4/4
 */
public abstract class AbstractController {

    @Resource(name = "kvService")
    KvService kvService;

    /**
     * 统一初始化页面
     * @return
     */
    @RequestMapping(value = "/{model}")
    public ModelAndView init(@PathVariable String model,@RequestParam(value = "modl", required = false) String modl) {
        RequestMapping r = this.getClass().getAnnotation(RequestMapping.class);
        ModelAndView mv =  new ModelAndView(r.value()[0] + "/" + model);
        mv.getModel().put("modl",modl);
        return mv;
    }
    @RequestMapping(value = "/{model1}/{model2}")
    public ModelAndView init1(@PathVariable String model1,@PathVariable String model2,@RequestParam(value = "modl", required = false) String modl) {
        RequestMapping r = this.getClass().getAnnotation(RequestMapping.class);
        ModelAndView mv =  new ModelAndView(r.value()[0] + "/" + model1+"/"+model2);
        mv.getModel().put("modl",modl);
        return mv;
    }
    protected String validation(Map<String, Object> p) {
        KvHandlerSupport support = kvService.lookup(Integer.parseInt(p.get("module").toString()));
        if (!support.isExist()) {
            return JsonResp.asData().error("无此模块").toJson();
        }
        List<Map<Object, Object>> list = kvService.all(support, p);
        if (list != null && !list.isEmpty()) {
            if (p.get("id") != null && p.get("id").equals(list.get(0).get("value"))) {
                return null;
            }
            return JsonResp.asData().error(p.get("desc") + "已存在,请重新添加").toJson();
        }
        return null;
    }
    public static void main(String[] args){
        ISecurity security = new MD5();
        System.out.println(security.encryptToBase64("123456"));
    }
}
