/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseMoveable;

import com.framework.demo.bo.showcaseMoveable.ShowcaseMoveable;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `showcase_moveable`
 */
@Mapper
public interface ShowcaseMoveableMapper extends DaoMapper<ShowcaseMoveable, Long> {
}