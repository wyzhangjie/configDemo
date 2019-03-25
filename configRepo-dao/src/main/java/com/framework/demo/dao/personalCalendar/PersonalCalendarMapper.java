/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.personalCalendar;

import com.framework.demo.bo.personalCalendar.PersonalCalendar;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `personal_calendar`
 */
@Mapper
public interface PersonalCalendarMapper extends DaoMapper<PersonalCalendar, Long> {
    Object countRecentlyCalendar(Long userId, Date nowDate, Date nowTime, int i);

    List<PersonalCalendar> findAllWithNoPageNoSort(Searchable searchable);
}