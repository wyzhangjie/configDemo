/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseStatusShow;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseStatusShow.ShowcaseStatusShow;
import com.framework.demo.service.showcaseStatusShow.ShowcaseStatusShowService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_status_show`
 */
@Service("showcaseStatusShowService")
public class ShowcaseStatusShowServiceImpl extends GenericSqlMapServiceImpl<ShowcaseStatusShow, Long> implements ShowcaseStatusShowService {
    @Resource(name = "showcaseStatusShowDao")
    private ShowcaseStatusShowDao showcaseStatusShowDao;

    public SqlMapDao<ShowcaseStatusShow, Long> getDao() {
        return showcaseStatusShowDao;
    }
}