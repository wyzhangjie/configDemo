/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.personalCalendar;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.bo.personalCalendar.PersonalCalendar;
import com.framework.demo.dao.personalCalendar.PersonalCalendarDao;
import com.framework.demo.dao.personalCalendar.PersonalCalendarMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `personal_calendar`
 */
@Repository("personalCalendarDao")
public class PersonalCalendarDaoImpl extends ConfigurableBaseSqlMapDao<PersonalCalendar, Long> implements PersonalCalendarDao {
    @Autowired
    private PersonalCalendarMapper personalCalendarMapper;

    public DaoMapper<PersonalCalendar, Long> getDaoMapper() {
        return personalCalendarMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public Object countRecentlyCalendar(Long userId, int i) {
        Date nowDate = new Date();
        Date nowTime = new Time(nowDate.getHours(), nowDate.getMinutes(), nowDate.getSeconds());
        nowDate.setHours(0);
        nowDate.setMinutes(0);
        nowDate.setSeconds(0);

        return personalCalendarMapper.countRecentlyCalendar(userId, nowDate, nowTime, i);
    }

    public List<PersonalCalendar> findAllWithNoPageNoSort(Searchable searchable) {
        return personalCalendarMapper.findAllWithNoPageNoSort(searchable);
    }
}