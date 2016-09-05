/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.showcaseMoveable;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseMoveable.ShowcaseMoveable;
import com.framework.demo.dao.showcaseMoveable.ShowcaseMoveableDao;
import com.framework.demo.dao.showcaseMoveable.ShowcaseMoveableMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `showcase_moveable`
 */
@Repository("showcaseMoveableDao")
public class ShowcaseMoveableDaoImpl extends ConfigurableBaseSqlMapDao<ShowcaseMoveable, Long> implements ShowcaseMoveableDao {
    @Autowired
    private ShowcaseMoveableMapper showcaseMoveableMapper;

    public DaoMapper<ShowcaseMoveable, Long> getDaoMapper() {
        return showcaseMoveableMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}