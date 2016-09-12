/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.personalCalendar;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.bo.personalCalendar.PersonalCalendar;

import java.util.List;

/**
 * This class corresponds to the database table `personal_calendar`
 */
public interface PersonalCalendarDao extends SqlMapDao<PersonalCalendar, Long> {
    Object countRecentlyCalendar(Long id, int i);

    List<PersonalCalendar> findAllWithNoPageNoSort(Searchable searchable);
}