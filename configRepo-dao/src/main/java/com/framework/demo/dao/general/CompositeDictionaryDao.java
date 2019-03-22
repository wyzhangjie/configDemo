/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.general;

import com.framework.demo.bo.general.CompositeDictionary;
import com.github.fartherp.framework.database.dao.DaoMapper;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
public interface CompositeDictionaryDao extends DaoMapper<CompositeDictionary, Long> {

    List<CompositeDictionary> findByParams(Map<String, Object> params);
}