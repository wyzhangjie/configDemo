/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.general;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.framework.demo.bo.general.CompositeDictionary;
import com.framework.demo.dao.general.CompositeDictionaryDao;
import com.framework.demo.service.general.CompositeDictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
@Service("compositeDictionaryService")
public class CompositeDictionaryServiceImpl extends GenericSqlMapServiceImpl<CompositeDictionary, Long> implements CompositeDictionaryService {
    @Resource(name = "compositeDictionaryDao")
    private CompositeDictionaryDao compositeDictionaryDao;

    @Override
    public SqlMapDao<CompositeDictionary, Long> getDao() {
        return compositeDictionaryDao;
    }

    @Override
    public List<CompositeDictionary> findByParams(Map<String, Object> params) {
        return compositeDictionaryDao.findByParams(params);
    }

    @Override
    public Map<Integer, String> findMapByParams(Map<String, Object> params) {
        List<CompositeDictionary> list = findByParams(params);
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (CompositeDictionary c : list) {
            map.put(c.getDicId(), c.getDicDesc());
        }
        return map;
    }
}