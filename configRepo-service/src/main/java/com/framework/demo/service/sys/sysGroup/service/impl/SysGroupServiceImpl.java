/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysGroup.service.impl;



import javax.annotation.Resource;

import com.framework.demo.service.sys.sysGroup.service.SysGroupService;
import com.framework.demo.sys.sysGroup.bo.SysGroup;
import com.framework.demo.sys.sysGroup.dao.SysGroupMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.search.enums.SearchOperator;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.impl.ExtendGenericSqlMapServiceImpl;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_group`
 */
@Service("sysGroupService")
public class SysGroupServiceImpl extends ExtendGenericSqlMapServiceImpl<SysGroup, Long> implements SysGroupService {
    @Autowired
    private SysGroupMapper sysGroupDao;

    public Set<Map<String, Object>> findIdAndNames(Searchable searchable, String groupName) throws Exception{

        searchable.addSearchFilter("name", SearchOperator.like, groupName);

        return Sets.newHashSet(
                Lists.transform(
                        findBySearchable(searchable).getRows(),
                        new Function<SysGroup, Map<String, Object>>() {

                            public Map<String, Object> apply(SysGroup input) {
                                Map<String, Object> data = Maps.newHashMap();
                                data.put("label", input.getName());
                                data.put("value", input.getId());
                                return data;
                            }
                        }
                )
        );
    }



    public ExtendDaoMapper<SysGroup, Long> getDao() {
        return sysGroupDao;
    }
}