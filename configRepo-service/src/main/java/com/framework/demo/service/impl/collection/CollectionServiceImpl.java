/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.collection;

import javax.annotation.Resource;

import com.framework.demo.bo.collection.Collection;
import com.framework.demo.dao.collection.CollectionDao;
import com.framework.demo.service.collection.CollectionService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `tb_collection`
 */
@Service("collectionService")
public class CollectionServiceImpl extends GenericSqlMapServiceImpl<Collection, Integer> implements CollectionService {
    @Resource(name = "collectionDao")
    private CollectionDao collectionDao;


    public DaoMapper<Collection, Integer> getDao() {
        return collectionDao;
    }


    public int saveComit(String comitmentarea, String model) {
        return collectionDao.saveComit(comitmentarea,model);
    }
}