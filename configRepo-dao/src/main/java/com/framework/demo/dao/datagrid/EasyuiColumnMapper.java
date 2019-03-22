/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.annotation.SqlMapper;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
@SqlMapper
public interface EasyuiColumnMapper extends DaoMapper<EasyuiColumn, Integer> {
    List<EasyuiColumn> findByModel(int modl);
}