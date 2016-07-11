/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.collection;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.collection.Collection;

/**
 * This class corresponds to the database table `tb_collection`
 */
public interface CollectionService extends GenericService<Collection, Integer> {
    int saveComit(String comitmentarea, String model);
}