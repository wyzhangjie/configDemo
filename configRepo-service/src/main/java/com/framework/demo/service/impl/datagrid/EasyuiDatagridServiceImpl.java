/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.datagrid;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.dao.datagrid.EasyuiDatagridMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;



/**
 * This class corresponds to the database table `easyui_datagrid`
 */
@Service("easyuiDatagridService")
public class EasyuiDatagridServiceImpl extends GenericSqlMapServiceImpl<EasyuiDatagrid, Integer>  {
    @Resource(name = "easyuiDatagridDao")
    private EasyuiDatagridMapper easyuiDatagridDao;


    public DaoMapper<EasyuiDatagrid, Integer> getDao() {
        return easyuiDatagridDao;
    }


    public void insert(EasyuiDatagrid easyuiDatagrid) {
        easyuiDatagridDao.insert(easyuiDatagrid);
    }


    public EasyuiDatagrid findByModel(int modl) {
        return easyuiDatagridDao.findByModel(modl);
    }
}