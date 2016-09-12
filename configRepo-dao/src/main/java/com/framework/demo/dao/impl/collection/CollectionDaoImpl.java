/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.collection;


import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.bo.collection.Collection;
import com.framework.demo.dao.collection.CollectionDao;
import com.framework.demo.dao.collection.CollectionMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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