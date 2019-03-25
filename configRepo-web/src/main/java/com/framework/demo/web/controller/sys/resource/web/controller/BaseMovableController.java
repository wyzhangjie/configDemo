/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.sys.resource.web.controller;


import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.service.showcaseMoveable.ShowcaseMoveableService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.framework.demo.utils.MessageUtils;
import com.framework.demo.web.bind.annotation.PageableDefaults;
import com.framework.demo.web.controller.BaseCRUDController;
import com.framework.demo.web.validate.AjaxResponse;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>User: hyssop
 * <p>Date: 13-2-22 下午4:15
 * <p>Version: 1.0
 */
public abstract class BaseMovableController<M extends FieldAccessVo, ID extends Serializable> extends BaseCRUDController {
    protected GenericService<M, ID> baseService;

    private ShowcaseMoveableService getMovableService() {
        return (ShowcaseMoveableService) baseService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @PageableDefaults(value = 10, sort = "weight=desc")

    public String list(Searchable searchable, Model model) throws Exception {
        return super.list(searchable, model);
    }

    @RequestMapping(value = "{fromId}/{toId}/up")
    @ResponseBody
    public AjaxResponse up(@PathVariable("fromId") Long fromId, @PathVariable("toId") Long toId) throws Exception {

        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }
        AjaxResponse ajaxResponse = new AjaxResponse("移动位置成功");
        try {
            getMovableService().up(fromId, toId);
        } catch (IllegalStateException e) {
            ajaxResponse.setSuccess(Boolean.FALSE);
            ajaxResponse.setMessage(MessageUtils.message("move.not.enough"));
        }
        return ajaxResponse;
    }

    @RequestMapping(value = "{fromId}/{toId}/down")
    @ResponseBody
    public AjaxResponse down(@PathVariable("fromId") Long fromId, @PathVariable("toId") Long toId) throws Exception {
        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        AjaxResponse ajaxResponse = new AjaxResponse("移动位置成功");
        try {
            getMovableService().down(fromId, toId);
        } catch (IllegalStateException e) {
            ajaxResponse.setSuccess(Boolean.FALSE);
            ajaxResponse.setMessage(MessageUtils.message("move.not.enough"));
        }
        return ajaxResponse;
    }

    @RequestMapping(value = "reweight")
    @ResponseBody
    public AjaxResponse reweight() throws InvocationTargetException, IllegalAccessException {

        if (this.permissionList != null) {
            this.permissionList.assertHasEditPermission();
        }

        AjaxResponse ajaxResponse = new AjaxResponse("优化权重成功！");
        try {
            getMovableService().reweight();
        } catch (IllegalStateException e) {
            ajaxResponse.setSuccess(Boolean.FALSE);
            ajaxResponse.setMessage("优化权重失败了！");
        }
        return ajaxResponse;
    }

}
