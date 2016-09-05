/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.personalMessageContent;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.personalMessageContent.PersonalMessageContent;
import com.framework.demo.dao.personalMessageContent.PersonalMessageContentDao;
import com.framework.demo.service.personalMessageContent.PersonalMessageContentService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `personal_message_content`
 */
@Service("personalMessageContentService")
public class PersonalMessageContentServiceImpl extends GenericSqlMapServiceImpl<PersonalMessageContent, Long> implements PersonalMessageContentService {
    @Resource(name = "personalMessageContentDao")
    private PersonalMessageContentDao personalMessageContentDao;

    public SqlMapDao<PersonalMessageContent, Long> getDao() {
        return personalMessageContentDao;
    }
}