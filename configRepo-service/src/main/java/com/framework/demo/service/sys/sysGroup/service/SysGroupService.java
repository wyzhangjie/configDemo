/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sys.sysGroup.service;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.sys.sysGroup.bo.SysGroup;

import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_group`
 */
public interface SysGroupService extends GenericService<SysGroup, Long> {
    Set<Map<String,Object>> findIdAndNames(Searchable searchable, String term) throws Exception;
}