/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseSample;

import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `showcase_sample`
 */
@Mapper
public interface ShowcaseSampleMapper extends DaoMapper<ShowcaseSample, Long> {
    ShowcaseSample findByName(String name);
}