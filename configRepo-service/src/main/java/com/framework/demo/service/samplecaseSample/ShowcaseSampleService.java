/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.samplecaseSample;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;

/**
 * This class corresponds to the database table `showcase_sample`
 */
public interface ShowcaseSampleService extends GenericService<ShowcaseSample, Long> {
    ShowcaseSample findByName(String fieldValue);
}