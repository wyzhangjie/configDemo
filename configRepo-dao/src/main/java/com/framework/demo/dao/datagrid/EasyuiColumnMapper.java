/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.datagrid.EasyuiColumn;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
@SqlMapper
public interface EasyuiColumnMapper extends DaoMapper<EasyuiColumn, Integer> {
    List<EasyuiColumn> findByModel(int modl);
}