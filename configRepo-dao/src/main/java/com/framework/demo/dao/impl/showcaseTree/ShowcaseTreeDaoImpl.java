/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.showcaseTree;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseTree.ShowcaseTree;
import com.framework.demo.dao.showcaseTree.ShowcaseTreeDao;
import com.framework.demo.dao.showcaseTree.ShowcaseTreeMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `showcase_tree`
 */
@Repository("showcaseTreeDao")
public class ShowcaseTreeDaoImpl extends ConfigurableBaseSqlMapDao<ShowcaseTree, Long> implements ShowcaseTreeDao {
    @Autowired
    private ShowcaseTreeMapper showcaseTreeMapper;

    public DaoMapper<ShowcaseTree, Long> getDaoMapper() {
        return showcaseTreeMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}