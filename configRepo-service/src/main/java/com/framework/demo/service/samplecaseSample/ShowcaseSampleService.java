/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.samplecaseSample;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.showcaseSample.ShowcaseSample;
import org.springframework.data.domain.Page;

/**
 * This class corresponds to the database table `showcase_sample`
 */
public interface ShowcaseSampleService extends GenericService<ShowcaseSample, Long> {
    ShowcaseSample findByName(String fieldValue);
}