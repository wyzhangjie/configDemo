/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseUpdate;


import javax.annotation.Resource;

import com.framework.demo.bo.showcaseUpload.ShowcaseUpload;
import com.framework.demo.dao.showcaseUpload.ShowcaseUploadMapper;
import com.framework.demo.service.showcaseUpdate.ShowcaseUploadService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_upload`
 */
@Service("showcaseUploadService")
public class ShowcaseUploadServiceImpl extends GenericSqlMapServiceImpl<ShowcaseUpload, Long> implements ShowcaseUploadService {
    @Autowired
    private ShowcaseUploadMapper showcaseUploadDao;

    public DaoMapper<ShowcaseUpload, Long> getDao() {
        return showcaseUploadDao;
    }
}