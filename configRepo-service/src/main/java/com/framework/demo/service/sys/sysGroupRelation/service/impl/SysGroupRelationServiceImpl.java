/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysGroupRelation.service.impl;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysGroupRelation.service.SysGroupRelationService;
import com.framework.demo.sys.sysGroupRelation.bo.SysGroupRelation;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
@Service("sysGroupRelationService")
public class SysGroupRelationServiceImpl extends GenericSqlMapServiceImpl<SysGroupRelation, Long> implements SysGroupRelationService {
    @Resource(name = "sysGroupRelationDao")
    private SysGroupRelationDao sysGroupRelationDao;


    public SqlMapDao<SysGroupRelation, Long> getDao() {
        return sysGroupRelationDao;
    }


    public void appendRelation(Long groupId, Long[] userIds, Long[] startUserIds, Long[] endUserIds) {
        if (ArrayUtils.isEmpty(userIds) && ArrayUtils.isEmpty(startUserIds)) {
            return;
        }
        if (!ArrayUtils.isEmpty(userIds)) {
            for (Long userId : userIds) {
                if (userId == null) {
                    continue;
                }
                SysGroupRelation r = sysGroupRelationDao.findByGroupIdAndUserId(groupId, userId);
                if (r == null) {
                    r = new SysGroupRelation();
                    r.setGroupId(groupId);
                    r.setUserId(userId);
                    saveOrUpdate(r);
                }
            }
        }

        if (!ArrayUtils.isEmpty(startUserIds)) {
            for (int i = 0, l = startUserIds.length; i < l; i++) {
                Long startUserId = startUserIds[i];
                Long endUserId = endUserIds[i];
                //范围查 如果在指定范围内 就没必要再新增一个 如当前是[10,20] 如果数据库有[9,21]
                SysGroupRelation r = sysGroupRelationDao.findByGroupIdAndStartUserIdLessThanEqualAndEndUserIdGreaterThanEqual(groupId, startUserId, endUserId);

                if (r == null) {
                    //删除范围内的
                    deleteInRange(startUserId, endUserId);
                    r = new SysGroupRelation();
                    r.setGroupId(groupId);
                    r.setStartUserId(startUserId);
                    r.setEndUserId(endUserId);
                    saveOrUpdate(r);
                }

            }
        }
    }

    private void deleteInRange(Long startUserId, Long endUserId) {
        sysGroupRelationDao.deleteInRange(startUserId,endUserId);
    }



    public void appendRelation(Long groupId, Long[] organizationIds) {
        if (ArrayUtils.isEmpty(organizationIds)) {
            return;
        }
        for (Long organizationId : organizationIds) {
            if (organizationId == null) {
                continue;
            }
            SysGroupRelation r = sysGroupRelationDao.findByGroupIdAndOrganizationId(groupId, organizationId);
            if (r == null) {
                r = new SysGroupRelation();
                r.setGroupId(groupId);
                r.setOrganizationId(organizationId);
                saveOrUpdate(r);
            }
        }
    }
}