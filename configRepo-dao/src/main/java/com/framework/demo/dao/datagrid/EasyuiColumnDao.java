/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.datagrid.EasyuiColumn;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
public interface EasyuiColumnDao extends SqlMapDao<EasyuiColumn, Integer> {
    void insertBatch(List<EasyuiColumn> columns);

    List<EasyuiColumn> findByModel(int modl);
}