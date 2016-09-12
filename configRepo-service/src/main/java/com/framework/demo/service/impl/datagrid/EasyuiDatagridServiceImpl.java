/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.datagrid;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.dao.datagrid.EasyuiDatagridDao;
import com.framework.demo.service.datagrid.EasyuiDatagridService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
@Service("easyuiDatagridService")
public class EasyuiDatagridServiceImpl extends GenericSqlMapServiceImpl<EasyuiDatagrid, Integer> implements EasyuiDatagridService {
    @Resource(name = "easyuiDatagridDao")
    private EasyuiDatagridDao easyuiDatagridDao;


    public SqlMapDao<EasyuiDatagrid, Integer> getDao() {
        return easyuiDatagridDao;
    }


    public void insert(EasyuiDatagrid easyuiDatagrid) {
        easyuiDatagridDao.insert(easyuiDatagrid);
    }


    public EasyuiDatagrid findByModel(int modl) {
        return easyuiDatagridDao.findByModel(modl);
    }
}