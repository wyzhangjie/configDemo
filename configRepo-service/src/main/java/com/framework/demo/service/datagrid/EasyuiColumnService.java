/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.datagrid;

import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.GenericService;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
public interface EasyuiColumnService extends GenericService<EasyuiColumn, Integer> {
    void insertBatch(List<EasyuiColumn> columns);

    List<EasyuiColumn> findByModel(int modl);

    Pagination<EasyuiDatagrid> findBySearchable(Searchable searchable);
}