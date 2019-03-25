package com.framework.demo.service.message;

import com.framework.demo.bo.personalMessage.PersonalMessage;
import com.framework.demo.enm.MessageState;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/25 0025
 * To change this template use File | Settings | File Templates.
 */
public interface MessageServiceI  {


    /**
     * 改变发件人 消息的原状态为目标状态
     *
     * @param senderId
     * @param oldState
     * @param newState
     */
    public Integer changeSenderState(Long senderId, MessageState oldState, MessageState newState) ;

    /**
     * 改变收件人人 消息的原状态为目标状态
     *
     * @param receiverId
     * @param oldState
     * @param newState
     */
    public Integer changeReceiverState(Long receiverId, MessageState oldState, MessageState newState) ;

    /**
     * 物理删除那些已删除的（即收件人和发件人 同时都删除了的）
     *
     * @param deletedState
     */
    public Integer clearDeletedMessage(MessageState deletedState) ;

    /**
     * 更改状态
     *
     * @param oldStates
     * @param newState
     * @param expireDays 当前时间-过期天数 时间之前的消息将改变状态
     */
    public Integer changeState(ArrayList<MessageState> oldStates, MessageState newState, int expireDays) ;

    /**
     * 统计用户收件箱未读消息
     *
     * @param userId
     * @return
     */
    public Long countUnread(Long userId) ;


    public void markRead(final Long userId, final Long[] ids) ;

    public List<PersonalMessage> findAllWithSort(Searchable searchable) ;


    Pagination<PersonalMessage> findBySeachableForPage(Searchable searchable);

    PersonalMessage saveOrUpdate(PersonalMessage message);

    PersonalMessage findById(Long parentId);
}
