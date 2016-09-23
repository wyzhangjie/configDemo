/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.maintainIcon;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.bo.maintainIcon.MaintainIcon;
import com.framework.demo.dao.maintainIcon.MaintainIconDao;
import com.framework.demo.dao.maintainIcon.MaintainIconMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `maintain_icon`
 */
@Repository("maintainIconDao")
public class MaintainIconDaoImpl extends ConfigurableBaseSqlMapDao<MaintainIcon, Long> implements MaintainIconDao {
    @Autowired
    private MaintainIconMapper maintainIconMapper;

    public DaoMapper<MaintainIcon, Long> getDaoMapper() {
        return maintainIconMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}