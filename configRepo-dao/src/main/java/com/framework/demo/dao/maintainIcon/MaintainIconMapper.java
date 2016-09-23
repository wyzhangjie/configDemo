/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.maintainIcon;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.maintainIcon.MaintainIcon;

/**
 * This class corresponds to the database table `maintain_icon`
 */
@SqlMapper
public interface MaintainIconMapper extends DaoMapper<MaintainIcon, Long> {
}