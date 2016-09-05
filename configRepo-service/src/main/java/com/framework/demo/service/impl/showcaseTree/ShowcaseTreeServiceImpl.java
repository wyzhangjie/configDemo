/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseTree;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseTree.ShowcaseTree;
import com.framework.demo.dao.showcaseTree.ShowcaseTreeDao;
import com.framework.demo.service.showcaseTree.ShowcaseTreeService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_tree`
 */
@Service("showcaseTreeService")
public class ShowcaseTreeServiceImpl extends GenericSqlMapServiceImpl<ShowcaseTree, Long> implements ShowcaseTreeService {
    @Resource(name = "showcaseTreeDao")
    private ShowcaseTreeDao showcaseTreeDao;

    public SqlMapDao<ShowcaseTree, Long> getDao() {
        return showcaseTreeDao;
    }
}