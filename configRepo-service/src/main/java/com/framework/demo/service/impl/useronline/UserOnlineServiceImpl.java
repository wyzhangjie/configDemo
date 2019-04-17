package com.framework.demo.service.impl.useronline;

import com.framework.demo.service.useronline.UserOnlineService;
import com.framework.demo.sys.sysUserOnline.bo.SysUserOnline;
import com.framework.demo.sys.sysUserOnline.dao.SysUserOnlineMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;
import com.github.fartherp.framework.database.service.impl.ExtendGenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhjie.zhang on 2019/4/3.
 */
@Service("userOnlineService")
public class UserOnlineServiceImpl extends ExtendGenericSqlMapServiceImpl<SysUserOnline, Long> implements UserOnlineService {

    @Autowired
    private SysUserOnlineMapper sysUserOnlineMapper;

    @Override
    public ExtendDaoMapper<SysUserOnline, Long> getDao() {
        return sysUserOnlineMapper;
    }
}
