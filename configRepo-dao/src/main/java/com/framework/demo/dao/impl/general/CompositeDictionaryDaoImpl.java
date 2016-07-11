/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.general;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import com.framework.demo.bo.general.CompositeDictionary;
import com.framework.demo.dao.general.CompositeDictionaryDao;
import com.framework.demo.dao.general.CompositeDictionaryMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
@Repository("compositeDictionaryDao")
public class CompositeDictionaryDaoImpl extends ConfigurableBaseSqlMapDao<CompositeDictionary, Long> implements CompositeDictionaryDao {
    @Autowired
    private CompositeDictionaryMapper compositeDictionaryMapper;

    @Override
    public DaoMapper<CompositeDictionary, Long> getDaoMapper() {
        return compositeDictionaryMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public List<CompositeDictionary> findByParams(Map<String, Object> params) {
        return compositeDictionaryMapper.findByParams(params);
    }
}