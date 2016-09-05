/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.service.message;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.framework.demo.bo.collection.Collection;
import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.dao.collection.CollectionDao;
import com.framework.demo.dao.personalCalendar.PersonalCalendarDao;
import com.framework.demo.dao.personalMessage.PersonalMessageDao;
import com.framework.demo.enm.MessageState;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * <p>User: hyssop
 * <p>Date: 13-5-22 下午2:40
 * <p>Version: 1.0
 */
@Service("messageService")
public class MessageService   extends GenericSqlMapServiceImpl<PersonalMessage, Long> implements MessageServiceI {

    @Resource(name = "personalMessageDao")
    private PersonalMessageDao personalMessageDao;

    @Override
    public SqlMapDao<PersonalMessage, Long> getDao() {
        return personalMessageDao;
    }


    @Override
    public Integer changeSenderState(Long senderId, MessageState oldState, MessageState newState) {
        return personalMessageDao.changeSenderState(senderId,oldState,newState,new Date());
    }

    @Override
    public Integer changeReceiverState(Long receiverId, MessageState oldState, MessageState newState) {
        return personalMessageDao.changeReceiverState(receiverId,oldState,newState,new Date());
    }

    @Override
    public Integer clearDeletedMessage(MessageState deletedState) {
        return personalMessageDao.clearDeletedMessage(deletedState);
    }

    @Override
    public Integer changeState(ArrayList<MessageState> oldStates, MessageState newState, int expireDays) {
        return personalMessageDao.changeState(oldStates,newState,expireDays);
    }

    @Override
    public Long countUnread(Long userId) {
        return personalMessageDao.countUnread(userId,MessageState.in_box.getInfo());
    }

    @Override
    public void markRead(Long userId, Long[] ids) {
         personalMessageDao.markRead(userId, Arrays.asList(ids));
    }

    public List<PersonalMessage> findAllWithSort(Searchable searchable) {
        return personalMessageDao.findBySeachable(searchable);
    }

    public Page<PersonalMessage> findBySeachableForPage(Searchable searchable) {
        return personalMessageDao.findBySeachableForPage(searchable);
    }


}
