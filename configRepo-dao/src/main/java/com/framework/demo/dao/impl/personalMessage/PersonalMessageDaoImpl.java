/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.personalMessage;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Page;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.dao.personalMessage.PersonalMessageDao;
import com.framework.demo.dao.personalMessage.PersonalMessageMapper;
import com.framework.demo.enm.MessageState;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `personal_message`
 */
@Repository("personalMessageDao")
public class PersonalMessageDaoImpl extends ConfigurableBaseSqlMapDao<PersonalMessage, Long> implements PersonalMessageDao {
    @Autowired
    private PersonalMessageMapper personalMessageMapper;

    public DaoMapper<PersonalMessage, Long> getDaoMapper() {
        return personalMessageMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    public Integer changeSenderState(Long senderId, MessageState oldState, MessageState newState, Date changeDate) {
        return personalMessageMapper.changeSenderState(senderId,oldState,newState,changeDate);
    }

    public Integer changeReceiverState(Long receiverId, MessageState oldState, MessageState newState, Date changeDate) {
        return personalMessageMapper.changeReceiverState(receiverId,oldState,newState,changeDate);
    }

    public Integer clearDeletedMessage(MessageState deletedState) {
        return personalMessageMapper.clearDeletedMessage(deletedState);
    }

    public Integer changeSenderState(ArrayList<MessageState> oldStates, MessageState newState, Date changeDate, Date changeDate1) {
        return personalMessageMapper.changeSenderState(oldStates,newState,changeDate,changeDate1);
    }

    public Integer changeReceiverState(ArrayList<MessageState> oldStates, MessageState newState, Date changeDate, Date changeDate1) {
        return personalMessageMapper.changeReceiverState(oldStates,newState,changeDate,changeDate1);
    }

    public Long countUnread(Long userId, String boxtype) {
        return personalMessageMapper.countUnread(userId,boxtype);
    }

    public void markRead(Long userId, List<Long> longs) {
         personalMessageMapper.markRead(userId, longs);
    }

    public List<PersonalMessage> findBySeachable(Searchable searchable) {
        return personalMessageMapper.findBySeachable(searchable);
    }

    public Page<PersonalMessage> findBySeachableForPage(Searchable searchable) {
        return personalMessageMapper.findBySeachableForPage(searchable);
    }

    public Integer changeState(ArrayList<MessageState> oldStates, MessageState newState, int expireDays) {
        return personalMessageMapper.changeState(oldStates,newState,expireDays);
    }
}