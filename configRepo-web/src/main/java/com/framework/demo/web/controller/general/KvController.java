/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.web.controller.general;

import cn.vansky.framework.core.kv.handler.KvHandlerSupport;
import cn.vansky.framework.core.kv.service.KvService;
import cn.vansky.framework.core.util.JsonResp;
import com.framework.demo.web.controller.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/1/23
 */
@Controller
@RequestMapping(value = "/kv")
public class KvController  extends AbstractController {
    public static final int HINT_MAX = 10;

  /*  @Resource
    KvService kvService;

    *//**
     * 全表查询
     * @param vo 扩展信息
     * @return json
     *//*
    @RequestMapping(value = "/hint")
    @ResponseBody
    public String hint(KvVo vo) {
        KvHandlerSupport support = kvService.lookup(vo.getModule());
        if (!support.isExist()) {
            return JsonResp.asData().error("无此模块").toJson();
        }
        support.setDefaultValue(vo.getDefaultValue());
        List<Map<Object, Object>> list = kvService.all(support, vo.convertMap());
        return JsonResp.asList().addAll(list).toJson();
    }

    *//**
     * 全模糊查询
     * @param vo 扩展信息
     * @return json
     *//*
    @RequestMapping(value = "/fuzzy")
    @ResponseBody
    public String fuzzy(KvVo vo) {
        KvHandlerSupport support = kvService.lookup(vo.getModule());
        if (!support.isExist()) {
            return JsonResp.asData().error("无此模块").toJson();
        }
        String key = vo.getKey() != null ? vo.getKey() : "";
        List<Map<Object, Object>> list = kvService.fuzzy(support, key, vo.convertMap(), HINT_MAX);
        return JsonResp.asList().addAll(list).toJson();
    }*/
}
