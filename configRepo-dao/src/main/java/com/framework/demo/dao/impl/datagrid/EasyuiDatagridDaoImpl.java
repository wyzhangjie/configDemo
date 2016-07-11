/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.datagrid;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.dao.datagrid.EasyuiDatagridDao;
import com.framework.demo.dao.datagrid.EasyuiDatagridMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
@Repository("easyuiDatagridDao")
public class EasyuiDatagridDaoImpl extends ConfigurableBaseSqlMapDao<EasyuiDatagrid, Integer> implements EasyuiDatagridDao {
    @Autowired
    private EasyuiDatagridMapper easyuiDatagridMapper;

    @Override
    public DaoMapper<EasyuiDatagrid, Integer> getDaoMapper() {
        return easyuiDatagridMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public void insert(EasyuiDatagrid easyuiDatagrid) {
        easyuiDatagridMapper.insert(easyuiDatagrid);
    }

    @Override
    public EasyuiDatagrid findByModel(int modl) {
        return easyuiDatagridMapper.findByModel(modl);
    }
}