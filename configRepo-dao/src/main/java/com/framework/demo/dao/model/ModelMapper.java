/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.model;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.model.Model;

/**
 * This class corresponds to the database table `tb_model`
 */
@SqlMapper
public interface ModelMapper extends DaoMapper<Model, Integer> {
}