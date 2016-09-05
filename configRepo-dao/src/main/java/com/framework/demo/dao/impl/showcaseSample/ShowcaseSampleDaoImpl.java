/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.showcaseSample;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import cn.vansky.framework.core.dao.FieldAccessVo;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.framework.demo.dao.showcaseSample.ShowcaseSampleDao;
import com.framework.demo.dao.showcaseSample.ShowcaseSampleMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class corresponds to the database table `showcase_sample`
 */
@Repository("showcaseSampleDao")
public class ShowcaseSampleDaoImpl extends ConfigurableBaseSqlMapDao<ShowcaseSample, Long> implements ShowcaseSampleDao {
    @Autowired
    private ShowcaseSampleMapper showcaseSampleMapper;

    @Override
    public DaoMapper<ShowcaseSample, Long> getDaoMapper() {
        return showcaseSampleMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public ShowcaseSample findByName(String fieldValue) {
        return showcaseSampleMapper.findByName(fieldValue);
    }


}