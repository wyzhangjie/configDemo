/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.datagrid;


import javax.annotation.Resource;

import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.dao.datagrid.EasyuiColumnDao;
import com.framework.demo.service.datagrid.EasyuiColumnService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
@Service("easyuiColumnService")
public class EasyuiColumnServiceImpl extends GenericSqlMapServiceImpl<EasyuiColumn, Integer> implements EasyuiColumnService {
    @Resource(name = "easyuiColumnDao")
    private EasyuiColumnDao easyuiColumnDao;


    public DaoMapper<EasyuiColumn, Integer> getDao() {
        return easyuiColumnDao;
    }


    public void insertBatch(List<EasyuiColumn> columns) {
        easyuiColumnDao.insertBatch(columns);
    }


    public List<EasyuiColumn> findByModel(int modl) {
        return easyuiColumnDao.findByModel(modl);
    }
}