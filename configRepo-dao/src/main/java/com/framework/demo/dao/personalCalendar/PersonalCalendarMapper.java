/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.personalCalendar;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.bo.personalCalendar.PersonalCalendar;

import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `personal_calendar`
 */
@SqlMapper
public interface PersonalCalendarMapper extends DaoMapper<PersonalCalendar, Long> {
    Object countRecentlyCalendar(Long userId, Date nowDate, Date nowTime, int i);

    List<PersonalCalendar> findAllWithNoPageNoSort(Searchable searchable);
}