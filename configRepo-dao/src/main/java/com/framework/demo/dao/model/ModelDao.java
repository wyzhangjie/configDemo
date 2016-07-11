/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.model;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.model.Model;

/**
 * This class corresponds to the database table `tb_model`
 */
public interface ModelDao extends SqlMapDao<Model, Integer> {
}