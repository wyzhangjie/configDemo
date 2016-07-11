/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
@SqlMapper
public interface EasyuiDatagridMapper extends DaoMapper<EasyuiDatagrid, Integer> {
    EasyuiDatagrid findByModel(int modl);
}