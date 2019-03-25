/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseUpload;

import com.framework.demo.bo.showcaseUpload.ShowcaseUpload;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `showcase_upload`
 */
@Mapper
public interface ShowcaseUploadMapper extends DaoMapper<ShowcaseUpload, Long> {
}