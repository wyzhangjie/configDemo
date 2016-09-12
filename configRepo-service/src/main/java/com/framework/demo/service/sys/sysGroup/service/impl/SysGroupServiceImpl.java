/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysGroup.service.impl;

import cn.vansky.framework.core.orm.mybatis.plugin.search.enums.SearchOperator;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.service.sys.sysGroup.service.SysGroupService;
import com.framework.demo.sys.sysGroup.bo.SysGroup;
import com.framework.demo.sys.sysGroup.dao.SysGroupDao;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_group`
 */
@Service("sysGroupService")
public class SysGroupServiceImpl extends GenericSqlMapServiceImpl<SysGroup, Long> implements SysGroupService {
    @Resource(name = "sysGroupDao")
    private SysGroupDao sysGroupDao;

    public Set<Map<String, Object>> findIdAndNames(Searchable searchable, String groupName) throws Exception{

        searchable.addSearchFilter("name", SearchOperator.like, groupName);

        return Sets.newHashSet(
                Lists.transform(
                        findBySearchable(searchable).getContent(),
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



    public SqlMapDao<SysGroup, Long> getDao() {
        return sysGroupDao;
    }
}