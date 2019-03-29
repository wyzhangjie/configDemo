/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseTree;

import com.framework.demo.bo.showcaseTree.ShowcaseTree;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.dao.ExtendDaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `showcase_tree`
 */
@Mapper
public interface ShowcaseTreeMapper extends ExtendDaoMapper<ShowcaseTree, Long> {
}