/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.showcaseTree;

import com.github.fartherp.framework.database.service.GenericService;
import cn.vansky.framework.tree.service.BaseTreeableService;
import com.framework.demo.bo.showcaseTree.ShowcaseTree;

/**
 * This class corresponds to the database table `showcase_tree`
 */
public interface ShowcaseTreeService  extends BaseTreeableService<ShowcaseTree, Long> {
}