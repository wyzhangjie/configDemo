/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseSample;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;

/**
 * This class corresponds to the database table `showcase_sample`
 */
@SqlMapper
public interface ShowcaseSampleMapper extends DaoMapper<ShowcaseSample, Long> {
    ShowcaseSample findByName(String name);
}