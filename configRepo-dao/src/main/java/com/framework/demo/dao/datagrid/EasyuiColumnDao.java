/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.github.fartherp.framework.database.dao.DaoMapper;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
public interface EasyuiColumnDao extends DaoMapper<EasyuiColumn, Integer> {
    void insertBatch(List<EasyuiColumn> columns);

    List<EasyuiColumn> findByModel(int modl);
}