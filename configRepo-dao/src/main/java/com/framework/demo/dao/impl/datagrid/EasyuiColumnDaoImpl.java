/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.datagrid;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.datagrid.EasyuiColumn;
import com.framework.demo.dao.datagrid.EasyuiColumnDao;
import com.framework.demo.dao.datagrid.EasyuiColumnMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class corresponds to the database table `easyui_column`
 */
@Repository("easyuiColumnDao")
public class EasyuiColumnDaoImpl extends ConfigurableBaseSqlMapDao<EasyuiColumn, Integer> implements EasyuiColumnDao {
    @Autowired
    private EasyuiColumnMapper easyuiColumnMapper;

    @Override
    public DaoMapper<EasyuiColumn, Integer> getDaoMapper() {
        return easyuiColumnMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public void insertBatch(List<EasyuiColumn> columns) {
        easyuiColumnMapper.insertBatch(columns);
    }

    @Override
    public List<EasyuiColumn> findByModel(int modl) {
        return easyuiColumnMapper.findByModel(modl);
    }
}