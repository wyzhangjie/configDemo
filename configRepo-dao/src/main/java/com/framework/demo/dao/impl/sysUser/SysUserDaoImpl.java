/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.sysUser;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.sysUser.SysUserDao;
import com.framework.demo.dao.sysUser.SysUserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * This class corresponds to the database table `sys_user`
 */
@Repository("sysUserDao")
public class SysUserDaoImpl extends ConfigurableBaseSqlMapDao<SysUser, Long> implements SysUserDao {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public DaoMapper<SysUser, Long> getDaoMapper() {
        return sysUserMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.findByUsername(username);
    }

    @Override
    public SysUser login(String username, String password) {
        return sysUserMapper.login(username,password);
    }

    @Override
    public void changePassword(Long userId, String newPassword) {
        sysUserMapper.changePassword(userId,newPassword);
    }

    @Override
    public void correlationRoles(Long userId, Long[] roleIds) {
        sysUserMapper.correlationRoles(userId,roleIds);
    }

    @Override
    public void uncorrelationRoles(Long userId, Long[] roleIds) {
        sysUserMapper.uncorrelationRoles(userId,roleIds);
    }
}