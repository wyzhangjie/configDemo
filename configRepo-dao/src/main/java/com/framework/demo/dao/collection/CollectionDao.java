/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.collection;

import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.collection.Collection;

/**
 * This class corresponds to the database table `tb_collection`
 */
public interface CollectionDao extends SqlMapDao<Collection, Integer> {
    public int saveComit(String comitmentarea, String model);

}