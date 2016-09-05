/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.showcaseMoveable;

import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.showcaseMoveable.ShowcaseMoveable;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * This class corresponds to the database table `showcase_moveable`
 */
public interface ShowcaseMoveableService extends GenericService<ShowcaseMoveable, Long> {


    void up(Long fromId, Long toId) throws Exception;

    void down(Long fromId, Long toId) throws Exception;

    void reweight() throws InvocationTargetException, IllegalAccessException;
}