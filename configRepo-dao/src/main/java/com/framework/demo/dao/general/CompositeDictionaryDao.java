/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.general;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.general.CompositeDictionary;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
public interface CompositeDictionaryDao extends SqlMapDao<CompositeDictionary, Long> {

    List<CompositeDictionary> findByParams(Map<String, Object> params);
}