/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOnline.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;
import com.framework.demo.sys.sysUserOnline.dao.SysUserOnlineDao;
import com.framework.demo.sys.sysUserOnline.dao.SysUserOnlineMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_user_online`
 */
@Repository("sysUserOnlineDao")
public class SysUserOnlineDaoImpl extends ConfigurableBaseSqlMapDao<SysUserOnline, String> implements SysUserOnlineDao {
    @Autowired
    private SysUserOnlineMapper sysUserOnlineMapper;


    public DaoMapper<SysUserOnline, String> getDaoMapper() {
        return sysUserOnlineMapper;
    }

    @Resource(name = "sqlSessionFactory")

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}