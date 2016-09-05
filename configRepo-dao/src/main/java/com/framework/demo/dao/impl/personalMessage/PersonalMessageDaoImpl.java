/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.personalMessage;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.dao.personalMessage.PersonalMessageDao;
import com.framework.demo.dao.personalMessage.PersonalMessageMapper;
import com.framework.demo.enm.MessageState;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @Override
    public Integer changeSenderState(Long senderId, MessageState oldState, MessageState newState, Date changeDate) {
        return personalMessageMapper.changeSenderState(senderId,oldState,newState,changeDate);
    }

    @Override
    public Integer changeReceiverState(Long receiverId, MessageState oldState, MessageState newState, Date changeDate) {
        return personalMessageMapper.changeReceiverState(receiverId,oldState,newState,changeDate);
    }

    @Override
    public Integer clearDeletedMessage(MessageState deletedState) {
        return personalMessageMapper.clearDeletedMessage(deletedState);
    }

    @Override
    public Integer changeSenderState(ArrayList<MessageState> oldStates, MessageState newState, Date changeDate, Date changeDate1) {
        return personalMessageMapper.changeSenderState(oldStates,newState,changeDate,changeDate1);
    }

    @Override
    public Integer changeReceiverState(ArrayList<MessageState> oldStates, MessageState newState, Date changeDate, Date changeDate1) {
        return personalMessageMapper.changeReceiverState(oldStates,newState,changeDate,changeDate1);
    }

    @Override
    public Long countUnread(Long userId, String boxtype) {
        return personalMessageMapper.countUnread(userId,boxtype);
    }

    @Override
    public void markRead(Long userId, List<Long> longs) {
         personalMessageMapper.markRead(userId, longs);
    }

    @Override
    public List<PersonalMessage> findBySeachable(Searchable searchable) {
        return personalMessageMapper.findBySeachable(searchable);
    }

    @Override
    public Page<PersonalMessage> findBySeachableForPage(Searchable searchable) {
        return personalMessageMapper.findBySeachableForPage(searchable);
    }

    @Override
    public Integer changeState(ArrayList<MessageState> oldStates, MessageState newState, int expireDays) {
        return personalMessageMapper.changeState(oldStates,newState,expireDays);
    }
}