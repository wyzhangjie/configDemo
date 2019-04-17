/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.model;




import javax.annotation.Resource;

import com.framework.demo.bo.model.Model;
import com.framework.demo.dao.model.ModelMapper;
import com.framework.demo.service.model.ModelService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_model`
 */
@Service("modelService")
public class ModelServiceImpl extends GenericSqlMapServiceImpl<Model, Integer> implements ModelService {
    @Autowired
    private ModelMapper modelDao;


    public DaoMapper<Model, Integer> getDao() {
        return modelDao;
    }
}