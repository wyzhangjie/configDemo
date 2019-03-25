/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.maintainIcon;


import com.framework.demo.bo.maintainIcon.MaintainIcon;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `maintain_icon`
 */
@Mapper
public interface MaintainIconMapper extends DaoMapper<MaintainIcon, Long> {
}