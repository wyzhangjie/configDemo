/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.model;


import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.model.Model;
import com.framework.demo.dao.model.ModelDao;
import com.framework.demo.service.model.ModelService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_model`
 */
@Service("modelService")
public class ModelServiceImpl extends GenericSqlMapServiceImpl<Model, Integer> implements ModelService {
    @Resource(name = "modelDao")
    private ModelDao modelDao;

    @Override
    public SqlMapDao<Model, Integer> getDao() {
        return modelDao;
    }
}