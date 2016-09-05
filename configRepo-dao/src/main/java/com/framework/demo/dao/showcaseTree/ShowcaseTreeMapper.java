/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseTree;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.showcaseTree.ShowcaseTree;

/**
 * This class corresponds to the database table `showcase_tree`
 */
@SqlMapper
public interface ShowcaseTreeMapper extends DaoMapper<ShowcaseTree, Long> {
}