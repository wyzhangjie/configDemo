/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.service.message;


import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.dao.personalMessage.PersonalMessageMapper;
import com.framework.demo.enm.MessageState;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PersonalMessageMapper personalMessageDao;


    public DaoMapper<PersonalMessage, Long> getDao() {
        return personalMessageDao;
    }



    public Integer changeSenderState(Long senderId, MessageState oldState, MessageState newState) {
        return personalMessageDao.changeSenderState(senderId,oldState,newState,new Date());
    }


    public Integer changeReceiverState(Long receiverId, MessageState oldState, MessageState newState) {
        return personalMessageDao.changeReceiverState(receiverId,oldState,newState,new Date());
    }


    public Integer clearDeletedMessage(MessageState deletedState) {
        return personalMessageDao.clearDeletedMessage(deletedState);
    }


    public Integer changeState(ArrayList<MessageState> oldStates, MessageState newState, int expireDays) {
        return personalMessageDao.changeState(oldStates,newState,expireDays);
    }


    public Long countUnread(Long userId) {
        return personalMessageDao.countUnread(userId,MessageState.in_box.getInfo());
    }


    public void markRead(Long userId, Long[] ids) {
         personalMessageDao.markRead(userId, Arrays.asList(ids));
    }

    public List<PersonalMessage> findAllWithSort(Searchable searchable) {
        return personalMessageDao.findBySeachable(searchable);
    }

    public Pagination<PersonalMessage> findBySeachableForPage(Searchable searchable) {
        return personalMessageDao.findBySeachableForPage(searchable);
    }


}
