/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseTree;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import cn.vansky.framework.tree.service.BaseTreeableServiceImpl;
import com.framework.demo.bo.showcaseTree.ShowcaseTree;
import com.framework.demo.dao.showcaseTree.ShowcaseTreeDao;
import com.framework.demo.service.showcaseTree.ShowcaseTreeService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

/**
 * This class corresponds to the database table `showcase_tree`
 */
@Service("showcaseTreeService")
public class ShowcaseTreeServiceImpl extends BaseTreeableServiceImpl<ShowcaseTree, Long> implements ShowcaseTreeService  {
    @Resource(name = "showcaseTreeDao")
    private ShowcaseTreeDao showcaseTreeDao;



    public SqlMapDao getDao() {
        return showcaseTreeDao;
    }


    public void updateSelftAndChild(ShowcaseTree source, Long newParentId, String newParentIds, int newWeight) {

    }
}