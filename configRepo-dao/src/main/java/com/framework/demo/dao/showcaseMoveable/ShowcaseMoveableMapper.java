/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseMoveable;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.showcaseMoveable.ShowcaseMoveable;

/**
 * This class corresponds to the database table `showcase_moveable`
 */
@SqlMapper
public interface ShowcaseMoveableMapper extends DaoMapper<ShowcaseMoveable, Long> {
}