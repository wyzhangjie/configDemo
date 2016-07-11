/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.general;

import cn.vansky.framework.common.util.MapUtils;
import cn.vansky.framework.core.kv.dao.KvDao;
import cn.vansky.framework.core.kv.handler.DefaultKvHandler;
import cn.vansky.framework.core.kv.handler.KvHandler;
import cn.vansky.framework.core.kv.handler.SimpleKvHandler;
import cn.vansky.framework.core.kv.service.KvService;
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
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 1).get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(2, "tb_role", "name",
                "id", MapUtils.<String, Object>build().get(), DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(3, "tb_user", "name",
                "id", MapUtils.<String, Object>build().put("name", ":user_name").get(),
                DefaultKvHandler.ALL));
        addHandler(new SimpleKvHandler(4, "td_composite_dictionary", "dic_name",
                "dic_id", MapUtils.<String, Object>build().put("dic_type", 2).get(),
                DefaultKvHandler.ALL));
    }
}
