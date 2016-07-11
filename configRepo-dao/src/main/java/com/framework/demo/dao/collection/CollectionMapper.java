/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.collection;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.collection.Collection;

/**
 * This class corresponds to the database table `tb_collection`
 */
@SqlMapper
public interface CollectionMapper extends DaoMapper<Collection, Integer> {
    int saveComit(String comitmentarea, String model);
}