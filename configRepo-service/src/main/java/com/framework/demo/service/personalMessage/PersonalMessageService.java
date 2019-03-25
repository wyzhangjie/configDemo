/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.personalMessage;

import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.bo.personalMessage.PersonalMessage;

/**
 * This class corresponds to the database table `personal_message`
 */
public interface PersonalMessageService extends GenericService<PersonalMessage, Long> {
}