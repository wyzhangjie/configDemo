/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.personalCalendar;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import javax.annotation.Resource;

import com.framework.demo.bo.personalCalendar.PersonalCalendar;
import com.framework.demo.dao.personalCalendar.PersonalCalendarDao;
import com.framework.demo.service.personalCalendar.PersonalCalendarService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class corresponds to the database table `personal_calendar`
 */
@Service("personalCalendarService")
public class PersonalCalendarServiceImpl extends GenericSqlMapServiceImpl<PersonalCalendar, Long> implements PersonalCalendarService {
    @Resource(name = "personalCalendarDao")
    private PersonalCalendarDao personalCalendarDao;

    public SqlMapDao<PersonalCalendar, Long> getDao() {
        return personalCalendarDao;
    }


    public Object countRecentlyCalendar(Long id, int i) {
        return personalCalendarDao.countRecentlyCalendar(id,i);
    }


    public List<PersonalCalendar> findAllWithNoPageNoSort(Searchable searchable) {
        searchable.removePageable();
        searchable.removeSort();
        return personalCalendarDao.findAllWithNoPageNoSort(searchable);
    }
}