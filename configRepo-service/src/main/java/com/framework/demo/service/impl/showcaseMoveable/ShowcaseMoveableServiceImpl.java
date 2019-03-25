/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseMoveable;

import com.framework.demo.bo.showcaseMoveable.ShowcaseMoveable;
import com.framework.demo.dao.showcaseMoveable.ShowcaseMoveableMapper;
import com.framework.demo.service.showcaseMoveable.ShowcaseMoveableService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

/**
 * This class corresponds to the database table `showcase_moveable`
 */
@Service("showcaseMoveableService")
public class ShowcaseMoveableServiceImpl extends GenericSqlMapServiceImpl<ShowcaseMoveable, Long> implements ShowcaseMoveableService {
    @Autowired
    private ShowcaseMoveableMapper showcaseMoveableDao;

    public DaoMapper<ShowcaseMoveable, Long> getDao() {
        return showcaseMoveableDao;
    }

    @Override
    public void up(Long fromId, Long toId) throws Exception {

    }

    @Override
    public void down(Long fromId, Long toId) throws Exception {

    }

    @Override
    public void reweight() throws InvocationTargetException, IllegalAccessException {

    }
}