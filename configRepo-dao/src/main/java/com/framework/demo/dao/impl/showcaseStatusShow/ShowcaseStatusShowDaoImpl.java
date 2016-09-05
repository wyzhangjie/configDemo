/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.showcaseStatusShow;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseStatusShow.ShowcaseStatusShow;
import com.framework.demo.dao.showcaseStatusShow.ShowcaseStatusShowDao;
import com.framework.demo.dao.showcaseStatusShow.ShowcaseStatusShowMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `showcase_status_show`
 */
@Repository("showcaseStatusShowDao")
public class ShowcaseStatusShowDaoImpl extends ConfigurableBaseSqlMapDao<ShowcaseStatusShow, Long> implements ShowcaseStatusShowDao {
    @Autowired
    private ShowcaseStatusShowMapper showcaseStatusShowMapper;

    public DaoMapper<ShowcaseStatusShow, Long> getDaoMapper() {
        return showcaseStatusShowMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}