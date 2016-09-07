/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.personalCalendar;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import com.framework.demo.personalCalendar.bo.PersonalCalendar;

/**
 * This class corresponds to the database table `personal_calendar`
 */
@SqlMapper
public interface PersonalCalendarMapper extends DaoMapper<PersonalCalendar, Long> {
}