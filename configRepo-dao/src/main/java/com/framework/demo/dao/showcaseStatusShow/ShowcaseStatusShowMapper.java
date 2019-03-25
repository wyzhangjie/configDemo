/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseStatusShow;

import com.framework.demo.bo.showcaseStatusShow.ShowcaseStatusShow;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `showcase_status_show`
 */
@Mapper
public interface ShowcaseStatusShowMapper extends DaoMapper<ShowcaseStatusShow, Long> {
}