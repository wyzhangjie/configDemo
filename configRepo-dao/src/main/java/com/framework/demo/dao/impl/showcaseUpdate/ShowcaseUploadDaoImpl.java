/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.showcaseUpdate;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import com.framework.demo.showcaseUpload.bo.ShowcaseUpload;
import com.framework.demo.showcaseUpload.dao.ShowcaseUploadDao;
import com.framework.demo.showcaseUpload.dao.ShowcaseUploadMapper;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `showcase_upload`
 */
@Repository("showcaseUploadDao")
public class ShowcaseUploadDaoImpl extends ConfigurableBaseSqlMapDao<ShowcaseUpload, Long> implements ShowcaseUploadDao {
    @Autowired
    private ShowcaseUploadMapper showcaseUploadMapper;

    public DaoMapper<ShowcaseUpload, Long> getDaoMapper() {
        return showcaseUploadMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}