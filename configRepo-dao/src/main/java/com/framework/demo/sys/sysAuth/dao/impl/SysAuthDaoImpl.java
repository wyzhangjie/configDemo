/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysAuth.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysAuth.bo.SysAuth.SysAuth;
import com.framework.demo.sys.sysAuth.dao.SysAuthDao;
import com.framework.demo.sys.sysAuth.dao.SysAuthMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_auth`
 */
@Repository("sysAuthDao")
public class SysAuthDaoImpl extends ConfigurableBaseSqlMapDao<SysAuth, Long> implements SysAuthDao {
    @Autowired
    private SysAuthMapper sysAuthMapper;

    @Override
    public DaoMapper<SysAuth, Long> getDaoMapper() {
        return sysAuthMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public Set<String> findStringRoles(SysUser user) {
        return sysAuthMapper.findStringRoles(user);
    }

    @Override
    public Set<String> findStringPermissions(SysUser user) {
        return sysAuthMapper.findStringPermissions(user);
    }
}