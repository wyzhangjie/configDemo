/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.personalMessageContent;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `personal_message_content`
 */
public abstract class PersonalMessageContentBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `personal_message_content`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `personal_message_content`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `personal_message_content`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `personal_message_content`.message_id
     */
    private static final String PROPERTY_MESSAGEID = "messageId";

    /**
     * This field corresponds to the database column `personal_message_content`.message_id
     */
    private static final String PROPERTY_REMARK_MESSAGEID = "";

    /**
     * This field corresponds to the database column `personal_message_content`.message_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MESSAGEID)
    private Long messageId;

    /**
     * This field corresponds to the database column `personal_message_content`.content
     */
    private static final String PROPERTY_CONTENT = "content";

    /**
     * This field corresponds to the database column `personal_message_content`.content
     */
    private static final String PROPERTY_REMARK_CONTENT = "";

    /**
     * This field corresponds to the database column `personal_message_content`.content
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CONTENT)
    private String content;

    /**
     * This method returns the value of the database column `personal_message_content`.id
     *
     * @return the value of `personal_message_content`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `personal_message_content`.id
     *
     * @param id the value for `personal_message_content`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `personal_message_content`.message_id
     *
     * @return the value of `personal_message_content`.message_id
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * This method sets the value of the database column `personal_message_content`.message_id
     *
     * @param messageId the value for `personal_message_content`.message_id
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    /**
     * This method returns the value of the database column `personal_message_content`.content
     *
     * @return the value of `personal_message_content`.content
     */
    public String getContent() {
        return content;
    }

    /**
     * This method sets the value of the database column `personal_message_content`.content
     *
     * @param content the value for `personal_message_content`.content
     */
    public void setContent(String content) {
        this.content = content;
    }
}