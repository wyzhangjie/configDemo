/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.sysTemplColor;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;

import javax.annotation.Resource;

import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.dao.sysTemplColr.SysTemplColrDao;
import com.framework.demo.dao.sysTemplColr.SysTemplColrMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
@Repository("sysTemplColrDao")
public class SysTemplColrDaoImpl extends ConfigurableBaseSqlMapDao<SysTemplColr, Integer> implements SysTemplColrDao {
    @Autowired
    private SysTemplColrMapper sysTemplColrMapper;

    public DaoMapper<SysTemplColr, Integer> getDaoMapper() {
        return sysTemplColrMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public int insert(SysTemplColr sysTemplColr) {
        return sysTemplColrMapper.insert(sysTemplColr);
    }

    public SysTemplColr findByModl(Integer model) {
        return sysTemplColrMapper.findByModl(model);
    }
}