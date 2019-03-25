/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.general;

import com.framework.demo.bo.general.CompositeDictionary;
import com.github.fartherp.framework.database.service.GenericService;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
public interface CompositeDictionaryService extends GenericService<CompositeDictionary, Long> {

    List<CompositeDictionary> findByParams(Map<String, Object> params);

    Map<Integer, String> findMapByParams(Map<String, Object> params);
}