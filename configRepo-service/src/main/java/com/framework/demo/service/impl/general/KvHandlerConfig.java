/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.general;

import com.github.fartherp.framework.core.kv.dao.KvDao;
import com.github.fartherp.framework.core.kv.handler.DefaultKvHandler;
import com.github.fartherp.framework.core.kv.handler.KvHandler;
import com.github.fartherp.framework.core.kv.handler.SimpleKvHandler;
import com.github.fartherp.framework.core.kv.service.KvService;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;



/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/1/29
 */
@Service("kvHandlerConfig")
public class KvHandlerConfig {
    @Resource(name = "kvService")
    KvService kvService;

    @Resource(name = "kvDao")
    KvDao dao;

    public void addHandler(KvHandler handler) {
        kvService.addHandler(handler);
    }

    @PostConstruct
    void setup() {
        addHandler(new SimpleKvHandler(1, "td_composite_dictionary", "dic_name",
                "dic_id", com.github.fartherp.framework.common.util.MapUtil.<String, Object>build().put("dic_type", 1).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(2, "tb_role", "name",
                "id", com.github.fartherp.framework.common.util.MapUtil.<String, Object>build().get(), DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(3, "tb_user", "name",
                "id", com.github.fartherp.framework.common.util.MapUtil.<String, Object>build().put("name", ":user_name").get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(4, "td_composite_dictionary", "dic_name",
                "dic_id", com.github.fartherp.framework.common.util.MapUtil.<String, Object>build().put("dic_type", 2).get(),
                DefaultKvHandler.ALL));
    }
}
