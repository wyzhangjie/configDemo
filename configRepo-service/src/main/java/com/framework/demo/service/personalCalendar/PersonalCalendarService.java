/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.personalCalendar;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.personalCalendar.PersonalCalendar;

import java.util.List;

/**
 * This class corresponds to the database table `personal_calendar`
 */
public interface PersonalCalendarService extends GenericService<PersonalCalendar, Long> {
    Object countRecentlyCalendar(Long id, int i);

    List<PersonalCalendar> findAllWithNoPageNoSort(Searchable searchable);
}