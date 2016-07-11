/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.datagrid;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.datagrid.EasyuiColumn;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
public interface EasyuiColumnService extends GenericService<EasyuiColumn, Integer> {
    void insertBatch(List<EasyuiColumn> columns);

    List<EasyuiColumn> findByModel(int modl);
}