/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.personalMessageContent;

import com.framework.demo.bo.personalMessageContent.PersonalMessageContent;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * This class corresponds to the database table `personal_message_content`
 */
@Mapper
public interface PersonalMessageContentMapper extends DaoMapper<PersonalMessageContent, Long> {
}