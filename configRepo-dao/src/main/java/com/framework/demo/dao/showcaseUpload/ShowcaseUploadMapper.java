/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseUpload;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.showcaseUpload.ShowcaseUpload;

/**
 * This class corresponds to the database table `showcase_upload`
 */
@SqlMapper
public interface ShowcaseUploadMapper extends DaoMapper<ShowcaseUpload, Long> {
}