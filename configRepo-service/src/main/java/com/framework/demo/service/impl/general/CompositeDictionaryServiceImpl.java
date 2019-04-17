/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.general;

import com.framework.demo.bo.general.CompositeDictionary;
import com.framework.demo.dao.general.CompositeDictionaryMapper;
import com.framework.demo.service.general.CompositeDictionaryService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
@Service("compositeDictionaryService")
public class CompositeDictionaryServiceImpl extends GenericSqlMapServiceImpl<CompositeDictionary, Long> implements CompositeDictionaryService {
    @Autowired
    private CompositeDictionaryMapper compositeDictionaryDao;


    public DaoMapper<CompositeDictionary, Long> getDao() {
        return compositeDictionaryDao;
    }


    public List<CompositeDictionary> findByParams(Map<String, Object> params) {
        return compositeDictionaryDao.findByParams(params);
    }


    public Map<Integer, String> findMapByParams(Map<String, Object> params) {
        List<CompositeDictionary> list = findByParams(params);
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (CompositeDictionary c : list) {
            map.put(c.getDicId(), c.getDicDesc());
        }
        return map;
    }
}