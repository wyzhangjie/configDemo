/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.personalMessage;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.dao.SqlMapDao;
import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.enm.MessageState;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table `personal_message`
 */
public interface PersonalMessageDao extends SqlMapDao<PersonalMessage, Long> {
    Integer changeSenderState(Long senderId, MessageState oldState, MessageState newState, Date changeDate);

    Integer changeReceiverState(Long receiverId, MessageState oldState, MessageState newState, Date changeDate);

    Integer clearDeletedMessage(MessageState deletedState);

    Integer changeSenderState(ArrayList<MessageState> oldStates, MessageState newState, Date changeDate, Date changeDate1);

    Integer changeReceiverState(ArrayList<MessageState> oldStates, MessageState newState, Date changeDate, Date changeDate1);

    Long countUnread(Long userId, String boxtype);

    void markRead(Long userId, List<Long> longs);

    List<PersonalMessage> findBySeachable(Searchable searchable);

    Page<PersonalMessage> findBySeachableForPage(Searchable searchable);

    Integer changeState(ArrayList<MessageState> oldStates, MessageState newState, int expireDays);
}