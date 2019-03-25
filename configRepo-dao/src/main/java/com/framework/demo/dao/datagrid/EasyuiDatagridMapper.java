/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.annotation.SqlMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
@Mapper
public interface EasyuiDatagridMapper extends DaoMapper<EasyuiDatagrid, Integer> {
    EasyuiDatagrid findByModel(int modl);
}