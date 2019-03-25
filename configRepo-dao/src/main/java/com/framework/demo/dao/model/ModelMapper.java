/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.model;

import com.framework.demo.bo.model.Model;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.annotation.SqlMapper;

/**
 * This class corresponds to the database table `tb_model`
 */
@SqlMapper
public interface ModelMapper extends DaoMapper<Model, Integer> {
}