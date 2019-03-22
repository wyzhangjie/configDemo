/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.collection;


import javax.annotation.Resource;

import com.framework.demo.bo.collection.Collection;
import com.framework.demo.dao.collection.CollectionDao;
import com.framework.demo.dao.collection.CollectionMapper;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class corresponds to the database table `tb_collection`
 */
@Repository("collectionDao")
public class CollectionDaoImpl extends ConfigurableBaseSqlMapDao<Collection, Integer> implements CollectionDao {
    @Autowired
    private CollectionMapper collectionMapper;

    public DaoMapper<Collection, Integer> getDaoMapper() {
        return collectionMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
    public int saveComit(String comitmentarea, String model) {
        return collectionMapper.saveComit(comitmentarea,model);
    }

    public long countBySearchable(Searchable searchable) {
        return 0;
    }
}