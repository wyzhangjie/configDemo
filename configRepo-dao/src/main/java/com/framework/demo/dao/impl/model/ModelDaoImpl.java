/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.model;


import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.bo.model.Model;
import com.framework.demo.dao.model.ModelDao;
import com.framework.demo.dao.model.ModelMapper;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `tb_model`
 */
@Repository("modelDao")
public class ModelDaoImpl extends ConfigurableBaseSqlMapDao<Model, Integer> implements ModelDao {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DaoMapper<Model, Integer> getDaoMapper() {
        return modelMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
    public static void main(String[] args){
        String tt=" ";
        System.out.println(StringUtils.isBlank(tt));
    }
}