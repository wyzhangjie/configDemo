/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.service.message;

import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.enm.MessageState;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * <p>User: hyssop
 * <p>Date: 13-5-22 下午2:52
 * <p>Version: 1.0
 */
public interface MessageApiService {
    public static final String REPLY_PREFIX = "回复：";
    public static final String FOWRARD_PREFIX = "转发：";
    public static final String FOWRARD_TEMPLATE = "<br/><br/>-----------转发消息------------<br/>发件人:%s<br/>收件人：%s<br/>标题：%s<br/><br/>%s";

    /**
     * 得到用户 指定状态的消息
     *
     * @param userId
     * @param state
     * @param pageable
     * @return
     */
    public Pagination<PersonalMessage> findUserMessage(Long userId, MessageState state, Pagination pageable);

    /**
     * 查询消息的祖先 和 后代
     *
     * @param message
     * @return
     */
    List<PersonalMessage> findAncestorsAndDescendants(PersonalMessage message);

    /**
     * 保存草稿
     *
     * @param message
     */
    void saveDraft(PersonalMessage message);

    /**
     * 发送消息
     *
     * @param message
     */
    public void send(PersonalMessage message);

    /**
     * 发送系统消息给多个人
     *
     * @param receiverIds
     * @param message
     */
    public void sendSystemMessage(Long[] receiverIds, PersonalMessage message);

    /**
     * 发送系统消息给所有人
     *
     * @param message
     */
    public void sendSystemMessageToAllUser(PersonalMessage message) throws InvocationTargetException, IllegalAccessException;

    /**
     * 将消息移动到垃圾箱
     *
     * @param userId
     * @param messageId
     * @return
     */
    public void recycle(Long userId, Long messageId);

    /**
     * 批量将消息移动到垃圾箱
     *
     * @param userId
     * @param messageIds
     * @return
     */
    public void recycle(Long userId, Long[] messageIds);

    /**
     * 将消息保存到收藏箱
     *
     * @param userId
     * @param messageId
     * @return
     */
    public void store(Long userId, Long messageId);

    /**
     * 批量将消息保存到收藏箱
     *
     * @param userId
     * @param messageIds
     * @return
     */
    public void store(Long userId, Long[] messageIds);

    /**
     * 从垃圾箱删除消息
     *
     * @param userId
     * @param messageId
     */
    public void delete(Long userId, Long messageId);

    /**
     * 从垃圾箱删除消息
     *
     * @param userId
     * @param messageIds
     */
    public void delete(Long userId, Long[] messageIds);

    /**
     * 清空指定状态的消息
     *
     * @param userId
     * @param state
     */
    public void clearBox(Long userId, MessageState state);

    /**
     * 清空草稿箱
     *
     * @param userId
     */
    public void clearDraftBox(Long userId);

    /**
     * 清空收件箱
     *
     * @param userId
     */
    public void clearInBox(Long userId);

    /**
     * 清空收件箱
     *
     * @param userId
     */
    public void clearOutBox(Long userId);

    /**
     * 清空收藏箱
     *
     * @param userId
     */
    public void clearStoreBox(Long userId);

    /**
     * 清空垃圾箱
     *
     * @param userId
     */
    public void clearTrashBox(Long userId);

    /**
     * 未读收件箱消息总数
     *
     * @param userId
     */
    public Long countUnread(Long userId);


    /**
     * 标识为已读
     *
     * @param message
     */
    public void markRead(PersonalMessage message);

    /**
     * 标识为已回复
     *
     * @param message
     */
    public void markReplied(PersonalMessage message);


    void markRead(Long userId, Long[] ids);
}
