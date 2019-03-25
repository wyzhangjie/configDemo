/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.collection;

import com.framework.demo.bo.collection.Collection;
import com.framework.demo.dao.collection.CollectionMapper;
import com.framework.demo.service.collection.CollectionService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_collection`
 */
@Service("collectionService")
public class CollectionServiceImpl extends GenericSqlMapServiceImpl<Collection, Integer> implements CollectionService {
    @Autowired
    private CollectionMapper collectionMapper;

    public DaoMapper<Collection, Integer> getDao() {
        return collectionMapper;
    }


    @Override
    public int saveComit(String comitmentarea, String model) {
        return collectionMapper.saveComit(comitmentarea,model);
    }
}