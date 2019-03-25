/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.datagrid;



import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.dao.datagrid.EasyuiColumnMapper;
import com.framework.demo.service.datagrid.EasyuiColumnService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
@Service("easyuiColumnService")
public class EasyuiColumnServiceImpl extends GenericSqlMapServiceImpl<EasyuiColumn, Integer> implements EasyuiColumnService {
    @Autowired
    private EasyuiColumnMapper easyuiColumnDao;


    public DaoMapper<EasyuiColumn, Integer> getDao() {
        return easyuiColumnDao;
    }


    public void insertBatch(List<EasyuiColumn> columns) {
        easyuiColumnDao.insertBatch(columns);
    }


    public List<EasyuiColumn> findByModel(int modl) {
        return easyuiColumnDao.findByModel(modl);
    }

    @Override
    public Pagination<EasyuiDatagrid> findBySearchable(Searchable searchable) {
        return easyuiColumnDao.findBySearchable(searchable);
    }
}