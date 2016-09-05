/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.showcaseStatusShow;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.showcaseStatusShow.ShowcaseStatusShow;

/**
 * This class corresponds to the database table `showcase_status_show`
 */
@SqlMapper
public interface ShowcaseStatusShowMapper extends DaoMapper<ShowcaseStatusShow, Long> {
}