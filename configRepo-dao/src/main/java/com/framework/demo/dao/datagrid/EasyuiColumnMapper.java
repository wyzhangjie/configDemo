/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.datagrid;

import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.annotation.SqlMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
@Mapper
public interface EasyuiColumnMapper extends DaoMapper<EasyuiColumn, Integer> {
    List<EasyuiColumn> findByModel(int modl);

    Pagination<EasyuiDatagrid> findBySearchable(Searchable searchable);
}