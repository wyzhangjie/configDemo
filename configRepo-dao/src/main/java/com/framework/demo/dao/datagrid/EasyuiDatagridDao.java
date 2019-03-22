/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.github.fartherp.framework.database.dao.DaoMapper;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
public interface EasyuiDatagridDao extends DaoMapper<EasyuiDatagrid, Integer> {
    int insert(EasyuiDatagrid easyuiDatagrid);

    EasyuiDatagrid findByModel(int modl);
}