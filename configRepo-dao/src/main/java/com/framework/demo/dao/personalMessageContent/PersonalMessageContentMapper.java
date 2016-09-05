/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.personalMessageContent;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.bo.personalMessageContent.PersonalMessageContent;

/**
 * This class corresponds to the database table `personal_message_content`
 */
@SqlMapper
public interface PersonalMessageContentMapper extends DaoMapper<PersonalMessageContent, Long> {
}