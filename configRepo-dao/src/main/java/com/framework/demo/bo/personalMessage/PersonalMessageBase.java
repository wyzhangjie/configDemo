/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.personalMessage;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class corresponds to the database table `personal_message`
 */
public abstract class PersonalMessageBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `personal_message`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `personal_message`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `personal_message`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `personal_message`.sender_id
     */
    private static final String PROPERTY_SENDERID = "senderId";

    /**
     * This field corresponds to the database column `personal_message`.sender_id
     */
    private static final String PROPERTY_REMARK_SENDERID = "";

    /**
     * This field corresponds to the database column `personal_message`.sender_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SENDERID)
    private Long senderId;

    /**
     * This field corresponds to the database column `personal_message`.receiver_id
     */
    private static final String PROPERTY_RECEIVERID = "receiverId";

    /**
     * This field corresponds to the database column `personal_message`.receiver_id
     */
    private static final String PROPERTY_REMARK_RECEIVERID = "";

    /**
     * This field corresponds to the database column `personal_message`.receiver_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RECEIVERID)
    private Long receiverId;

    /**
     * This field corresponds to the database column `personal_message`.send_date
     */
    private static final String PROPERTY_SENDDATE = "sendDate";

    /**
     * This field corresponds to the database column `personal_message`.send_date
     */
    private static final String PROPERTY_REMARK_SENDDATE = "";

    /**
     * This field corresponds to the database column `personal_message`.send_date
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SENDDATE)
    private Date sendDate;

    /**
     * This field corresponds to the database column `personal_message`.title
     */
    private static final String PROPERTY_TITLE = "title";

    /**
     * This field corresponds to the database column `personal_message`.title
     */
    private static final String PROPERTY_REMARK_TITLE = "";

    /**
     * This field corresponds to the database column `personal_message`.title
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TITLE)
    private String title;

    /**
     * This field corresponds to the database column `personal_message`.sender_state
     */
    private static final String PROPERTY_SENDERSTATE = "senderState";

    /**
     * This field corresponds to the database column `personal_message`.sender_state
     */
    private static final String PROPERTY_REMARK_SENDERSTATE = "";

    /**
     * This field corresponds to the database column `personal_message`.sender_state
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SENDERSTATE)
    private String senderState;

    /**
     * This field corresponds to the database column `personal_message`.sender_state_change_date
     */
    private static final String PROPERTY_SENDERSTATECHANGEDATE = "senderStateChangeDate";

    /**
     * This field corresponds to the database column `personal_message`.sender_state_change_date
     */
    private static final String PROPERTY_REMARK_SENDERSTATECHANGEDATE = "";

    /**
     * This field corresponds to the database column `personal_message`.sender_state_change_date
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SENDERSTATECHANGEDATE)
    private Date senderStateChangeDate;

    /**
     * This field corresponds to the database column `personal_message`.receiver_state
     */
    private static final String PROPERTY_RECEIVERSTATE = "receiverState";

    /**
     * This field corresponds to the database column `personal_message`.receiver_state
     */
    private static final String PROPERTY_REMARK_RECEIVERSTATE = "";

    /**
     * This field corresponds to the database column `personal_message`.receiver_state
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RECEIVERSTATE)
    private String receiverState;

    /**
     * This field corresponds to the database column `personal_message`.receiver_state_change_date
     */
    private static final String PROPERTY_RECEIVERSTATECHANGEDATE = "receiverStateChangeDate";

    /**
     * This field corresponds to the database column `personal_message`.receiver_state_change_date
     */
    private static final String PROPERTY_REMARK_RECEIVERSTATECHANGEDATE = "";

    /**
     * This field corresponds to the database column `personal_message`.receiver_state_change_date
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RECEIVERSTATECHANGEDATE)
    private Date receiverStateChangeDate;

    /**
     * This field corresponds to the database column `personal_message`.type
     */
    private static final String PROPERTY_TYPE = "type";

    /**
     * This field corresponds to the database column `personal_message`.type
     */
    private static final String PROPERTY_REMARK_TYPE = "";

    /**
     * This field corresponds to the database column `personal_message`.type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TYPE)
    private String type;

    /**
     * This field corresponds to the database column `personal_message`.is_read
     */
    private static final String PROPERTY_ISREAD = "isRead";

    /**
     * This field corresponds to the database column `personal_message`.is_read
     */
    private static final String PROPERTY_REMARK_ISREAD = "";

    /**
     * This field corresponds to the database column `personal_message`.is_read
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISREAD)
    private Boolean isRead;

    /**
     * This field corresponds to the database column `personal_message`.is_replied
     */
    private static final String PROPERTY_ISREPLIED = "isReplied";

    /**
     * This field corresponds to the database column `personal_message`.is_replied
     */
    private static final String PROPERTY_REMARK_ISREPLIED = "";

    /**
     * This field corresponds to the database column `personal_message`.is_replied
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISREPLIED)
    private Boolean isReplied;

    /**
     * This field corresponds to the database column `personal_message`.parent_id
     */
    private static final String PROPERTY_PARENTID = "parentId";

    /**
     * This field corresponds to the database column `personal_message`.parent_id
     */
    private static final String PROPERTY_REMARK_PARENTID = "";

    /**
     * This field corresponds to the database column `personal_message`.parent_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTID)
    private Long parentId;

    /**
     * This field corresponds to the database column `personal_message`.parent_ids
     */
    private static final String PROPERTY_PARENTIDS = "parentIds";

    /**
     * This field corresponds to the database column `personal_message`.parent_ids
     */
    private static final String PROPERTY_REMARK_PARENTIDS = "";

    /**
     * This field corresponds to the database column `personal_message`.parent_ids
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTIDS)
    private String parentIds;

    /**
     * This method returns the value of the database column `personal_message`.id
     *
     * @return the value of `personal_message`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `personal_message`.id
     *
     * @param id the value for `personal_message`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `personal_message`.sender_id
     *
     * @return the value of `personal_message`.sender_id
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * This method sets the value of the database column `personal_message`.sender_id
     *
     * @param senderId the value for `personal_message`.sender_id
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * This method returns the value of the database column `personal_message`.receiver_id
     *
     * @return the value of `personal_message`.receiver_id
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method sets the value of the database column `personal_message`.receiver_id
     *
     * @param receiverId the value for `personal_message`.receiver_id
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method returns the value of the database column `personal_message`.send_date
     *
     * @return the value of `personal_message`.send_date
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * This method sets the value of the database column `personal_message`.send_date
     *
     * @param sendDate the value for `personal_message`.send_date
     */
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * This method returns the value of the database column `personal_message`.title
     *
     * @return the value of `personal_message`.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method sets the value of the database column `personal_message`.title
     *
     * @param title the value for `personal_message`.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column `personal_message`.sender_state
     *
     * @return the value of `personal_message`.sender_state
     */
    public String getSenderState() {
        return senderState;
    }

    /**
     * This method sets the value of the database column `personal_message`.sender_state
     *
     * @param senderState the value for `personal_message`.sender_state
     */
    public void setSenderState(String senderState) {
        this.senderState = senderState;
    }

    /**
     * This method returns the value of the database column `personal_message`.sender_state_change_date
     *
     * @return the value of `personal_message`.sender_state_change_date
     */
    public Date getSenderStateChangeDate() {
        return senderStateChangeDate;
    }

    /**
     * This method sets the value of the database column `personal_message`.sender_state_change_date
     *
     * @param senderStateChangeDate the value for `personal_message`.sender_state_change_date
     */
    public void setSenderStateChangeDate(Date senderStateChangeDate) {
        this.senderStateChangeDate = senderStateChangeDate;
    }

    /**
     * This method returns the value of the database column `personal_message`.receiver_state
     *
     * @return the value of `personal_message`.receiver_state
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * This method sets the value of the database column `personal_message`.receiver_state
     *
     * @param receiverState the value for `personal_message`.receiver_state
     */
    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    /**
     * This method returns the value of the database column `personal_message`.receiver_state_change_date
     *
     * @return the value of `personal_message`.receiver_state_change_date
     */
    public Date getReceiverStateChangeDate() {
        return receiverStateChangeDate;
    }

    /**
     * This method sets the value of the database column `personal_message`.receiver_state_change_date
     *
     * @param receiverStateChangeDate the value for `personal_message`.receiver_state_change_date
     */
    public void setReceiverStateChangeDate(Date receiverStateChangeDate) {
        this.receiverStateChangeDate = receiverStateChangeDate;
    }

    /**
     * This method returns the value of the database column `personal_message`.type
     *
     * @return the value of `personal_message`.type
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the value of the database column `personal_message`.type
     *
     * @param type the value for `personal_message`.type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column `personal_message`.is_read
     *
     * @return the value of `personal_message`.is_read
     */
    public Boolean getIsRead() {
        return isRead;
    }

    /**
     * This method sets the value of the database column `personal_message`.is_read
     *
     * @param isRead the value for `personal_message`.is_read
     */
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * This method returns the value of the database column `personal_message`.is_replied
     *
     * @return the value of `personal_message`.is_replied
     */
    public Boolean getIsReplied() {
        return isReplied;
    }

    /**
     * This method sets the value of the database column `personal_message`.is_replied
     *
     * @param isReplied the value for `personal_message`.is_replied
     */
    public void setIsReplied(Boolean isReplied) {
        this.isReplied = isReplied;
    }

    /**
     * This method returns the value of the database column `personal_message`.parent_id
     *
     * @return the value of `personal_message`.parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method sets the value of the database column `personal_message`.parent_id
     *
     * @param parentId the value for `personal_message`.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method returns the value of the database column `personal_message`.parent_ids
     *
     * @return the value of `personal_message`.parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method sets the value of the database column `personal_message`.parent_ids
     *
     * @param parentIds the value for `personal_message`.parent_ids
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }
}