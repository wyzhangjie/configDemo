/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseUpdate;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.demo.bo.showcaseUpload.ShowcaseUpload;
import com.framework.demo.dao.showcaseUpload.ShowcaseUploadDao;
import com.framework.demo.service.showcaseUpdate.ShowcaseUploadService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_upload`
 */
@Service("showcaseUploadService")
public class ShowcaseUploadServiceImpl extends GenericSqlMapServiceImpl<ShowcaseUpload, Long> implements ShowcaseUploadService {
    @Resource(name = "showcaseUploadDao")
    private ShowcaseUploadDao showcaseUploadDao;

    public SqlMapDao<ShowcaseUpload, Long> getDao() {
        return showcaseUploadDao;
    }
}