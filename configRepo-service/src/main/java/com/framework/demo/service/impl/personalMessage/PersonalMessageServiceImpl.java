/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.personalMessage;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.dao.personalMessage.PersonalMessageDao;
import com.framework.demo.service.personalMessage.PersonalMessageService;
import org.springframework.stereotype.Service;

/**
 * This class corresponds to the database table `personal_message`
 */
@Service("personalMessageService")
public class PersonalMessageServiceImpl extends GenericSqlMapServiceImpl<PersonalMessage, Long> implements PersonalMessageService {
    @Resource(name = "personalMessageDao")
    private PersonalMessageDao personalMessageDao;

    public SqlMapDao<PersonalMessage, Long> getDao() {
        return personalMessageDao;
    }
}