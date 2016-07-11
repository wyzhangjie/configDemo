/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
public interface EasyuiDatagridDao extends SqlMapDao<EasyuiDatagrid, Integer> {
    void insert(EasyuiDatagrid easyuiDatagrid);

    EasyuiDatagrid findByModel(int modl);
}