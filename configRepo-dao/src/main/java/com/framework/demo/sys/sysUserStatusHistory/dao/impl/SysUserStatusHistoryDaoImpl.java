/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserStatusHistory.dao.impl;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.sys.sysUserStatusHistory.bo.SysUserStatusHistory;
import com.framework.demo.sys.sysUserStatusHistory.dao.SysUserStatusHistoryDao;
import com.framework.demo.sys.sysUserStatusHistory.dao.SysUserStatusHistoryMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `sys_user_status_history`
 */
@Repository("sysUserStatusHistoryDao")
public class SysUserStatusHistoryDaoImpl extends ConfigurableBaseSqlMapDao<SysUserStatusHistory, Long> implements SysUserStatusHistoryDao {
    @Autowired
    private SysUserStatusHistoryMapper sysUserStatusHistoryMapper;

    public DaoMapper<SysUserStatusHistory, Long> getDaoMapper() {
        return sysUserStatusHistoryMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public String getLastReason(SysUser user) {
        return sysUserStatusHistoryMapper.getLastReason(user);
    }
}