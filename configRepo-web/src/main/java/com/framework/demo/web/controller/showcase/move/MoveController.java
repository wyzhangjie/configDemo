/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.controller.showcase.move;

import com.framework.demo.bo.showcaseMoveable.ShowcaseMoveable;
import com.framework.demo.web.controller.sys.resource.web.controller.BaseMovableController;
import com.github.fartherp.framework.database.mybatis.plugin.search.enums.BooleanEnum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by demo.
 * Auth: hyssop
 * Date: 2016/9/5 0005
 */
@Controller
@RequestMapping(value = "/showcase/move")
public class MoveController extends BaseMovableController<ShowcaseMoveable, Long> {


    public MoveController() {
        setResourceIdentity("showcase:move");
    }

    public void setCommonData(Model model) {
        model.addAttribute("booleanList", BooleanEnum.values());
    }


   /* @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(Model model,
                         //表示只验证Create.class分组
                          ShowcaseMoveable move, BindingResult result,
                         RedirectAttributes redirectAttributes) {
        return super.create(model, move, result, redirectAttributes);
    }*/

}
