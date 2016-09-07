/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.showcaseMoveable;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.framework.demo.showcaseMoveable.bo.ShowcaseMoveable;
import com.framework.demo.showcaseMoveable.dao.ShowcaseMoveableDao;
import com.framework.demo.showcaseMoveable.service.ShowcaseMoveableService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `showcase_moveable`
 */
@Service("showcaseMoveableService")
public class ShowcaseMoveableServiceImpl extends GenericSqlMapServiceImpl<ShowcaseMoveable, Long> implements ShowcaseMoveableService {
    @Resource(name = "showcaseMoveableDao")
    private ShowcaseMoveableDao showcaseMoveableDao;

    public SqlMapDao<ShowcaseMoveable, Long> getDao() {
        return showcaseMoveableDao;
    }
}