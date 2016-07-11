/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.general;

import cn.vansky.framework.core.kv.dao.KvDao;
import cn.vansky.framework.core.kv.handler.DefaultKvHandler;
import com.google.common.base.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/4/24
 */
public class TeamNameKvHandler extends DefaultKvHandler {
    private KvDao kvDao;

    public TeamNameKvHandler(Integer name, String tableName, String keyField, String valueField,
                              Map<String, Object> extraFields, int sqFlag, boolean daoExecuteFlag, KvDao kvDao) {
        super(name, tableName, keyField, valueField, extraFields, sqFlag, daoExecuteFlag, 0);
        this.kvDao = kvDao;
    }

    @Override
    protected void setupTemplates() {
        this.fn = new Function<Map<String, Object>, List<Map<String, Object>>>() {
            @Override
            public List<Map<String, Object>> apply(Map<String, Object> input) {
                List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
                String sql = "select team_name, id from tb_team where team_name = :team_name";
                result.addAll(kvDao.execute(sql, input));
                return result;
            }
        };
    }
}
