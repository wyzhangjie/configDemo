/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.datagrid;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.github.fartherp.framework.database.service.GenericService;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
public interface EasyuiDatagridService extends GenericService<EasyuiDatagrid, Integer> {

    void insert(EasyuiDatagrid easyuiDatagrid);

    EasyuiDatagrid findByModel(int modl);
}