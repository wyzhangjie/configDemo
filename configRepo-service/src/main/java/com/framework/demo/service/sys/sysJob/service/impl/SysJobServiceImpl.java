package com.framework.demo.service.sys.sysJob.service.impl;


import com.framework.demo.service.sys.sysJob.service.SysJobService;
import com.framework.demo.sys.sysJob.bo.SysJob;
import com.framework.demo.sys.sysJob.dao.SysJobMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;
import com.github.fartherp.framework.tree.service.BaseTreeableServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_job`
 */
@Service("sysJobService")
public class SysJobServiceImpl extends BaseTreeableServiceImpl<SysJob, Long> implements SysJobService {
    @Autowired
    private SysJobMapper sysJobDao;


    public ExtendDaoMapper<SysJob, Long> getDao() {
        return sysJobDao;
    }


    public void updateSelftAndChild(SysJob source, Long newParentId, String newParentIds, int newWeight) {

    }
}