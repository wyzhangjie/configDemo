/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserLastOnline.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.sys.sysUserLastOnline.bo.SysUserLastOnline;
import com.framework.demo.sys.sysUserLastOnline.dao.SysUserLastOnlineDao;
import com.framework.demo.sys.sysUserLastOnline.dao.SysUserLastOnlineMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_user_last_online`
 */
@Repository("sysUserLastOnlineDao")
public class SysUserLastOnlineDaoImpl extends ConfigurableBaseSqlMapDao<SysUserLastOnline, Long> implements SysUserLastOnlineDao {
    @Autowired
    private SysUserLastOnlineMapper sysUserLastOnlineMapper;

    public DaoMapper<SysUserLastOnline, Long> getDaoMapper() {
        return sysUserLastOnlineMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public Object findByUserId(Long id) {
        return sysUserLastOnlineMapper.findByUserId(id);
    }
}