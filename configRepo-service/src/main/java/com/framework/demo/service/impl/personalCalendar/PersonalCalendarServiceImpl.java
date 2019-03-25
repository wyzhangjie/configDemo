/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.personalCalendar;

import com.framework.demo.bo.personalCalendar.PersonalCalendar;
import com.framework.demo.dao.personalCalendar.PersonalCalendarMapper;
import com.framework.demo.service.personalCalendar.PersonalCalendarService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * This class corresponds to the database table `personal_calendar`
 */
@Service("personalCalendarService")
public class PersonalCalendarServiceImpl extends GenericSqlMapServiceImpl<PersonalCalendar, Long> implements PersonalCalendarService {
    @Autowired
    private PersonalCalendarMapper personalCalendarDao;

    public DaoMapper<PersonalCalendar, Long> getDao() {
        return personalCalendarDao;
    }


    public Object countRecentlyCalendar(Long id, int i) {
        return personalCalendarDao.countRecentlyCalendar(id,new Date(),new Date(),i);
    }


    public List<PersonalCalendar> findAllWithNoPageNoSort(Searchable searchable) {
        searchable.removePageable();
        searchable.removeSort();
        return personalCalendarDao.findAllWithNoPageNoSort(searchable);
    }
}