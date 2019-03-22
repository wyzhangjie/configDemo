/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.collection;

import com.framework.demo.bo.collection.Collection;
import com.github.fartherp.framework.database.dao.DaoMapper;

/**
 * This class corresponds to the database table `tb_collection`
 */
public interface CollectionDao extends DaoMapper<Collection, Integer> {
    public int saveComit(String comitmentarea, String model);

}