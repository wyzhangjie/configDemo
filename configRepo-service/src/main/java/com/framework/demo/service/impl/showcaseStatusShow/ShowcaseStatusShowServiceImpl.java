/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseStatusShow;


import javax.annotation.Resource;

import com.framework.demo.bo.showcaseStatusShow.ShowcaseStatusShow;
import com.framework.demo.dao.showcaseStatusShow.ShowcaseStatusShowMapper;
import com.framework.demo.service.showcaseStatusShow.ShowcaseStatusShowService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_status_show`
 */
@Service("showcaseStatusShowService")
public class ShowcaseStatusShowServiceImpl extends GenericSqlMapServiceImpl<ShowcaseStatusShow, Long> implements ShowcaseStatusShowService {
    @Autowired
    private ShowcaseStatusShowMapper showcaseStatusShowDao;

    public DaoMapper<ShowcaseStatusShow, Long> getDao() {
        return showcaseStatusShowDao;
    }
}