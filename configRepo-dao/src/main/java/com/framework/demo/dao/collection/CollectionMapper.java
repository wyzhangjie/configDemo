/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.collection;

import com.framework.demo.bo.collection.Collection;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.annotation.SqlMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `tb_collection`
 */
@Mapper
public interface CollectionMapper extends DaoMapper<Collection, Integer> {
    int saveComit(String comitmentarea, String model);
}