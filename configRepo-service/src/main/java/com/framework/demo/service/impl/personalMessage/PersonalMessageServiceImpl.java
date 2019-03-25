/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.personalMessage;

import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.dao.personalMessage.PersonalMessageMapper;
import com.framework.demo.service.personalMessage.PersonalMessageService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * This class corresponds to the database table `personal_message`
 */
@Service("personalMessageService")
public class PersonalMessageServiceImpl extends GenericSqlMapServiceImpl<PersonalMessage, Long> implements PersonalMessageService {
    @Autowired
    private PersonalMessageMapper personalMessageDao;

    public DaoMapper<PersonalMessage, Long> getDao() {
        return personalMessageDao;
    }
}