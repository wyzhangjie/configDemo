/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.personalMessageContent;

import javax.annotation.Resource;

import com.framework.demo.bo.personalMessageContent.PersonalMessageContent;
import com.framework.demo.dao.personalMessageContent.PersonalMessageContentMapper;
import com.framework.demo.service.personalMessageContent.PersonalMessageContentService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `personal_message_content`
 */
@Service("personalMessageContentService")
public class PersonalMessageContentServiceImpl extends GenericSqlMapServiceImpl<PersonalMessageContent, Long> implements PersonalMessageContentService {
    @Autowired
    private PersonalMessageContentMapper personalMessageContentDao;

    public DaoMapper<PersonalMessageContent, Long> getDao() {
        return personalMessageContentDao;
    }
}