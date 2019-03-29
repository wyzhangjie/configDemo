/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroupRelation.bo;

import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_group_relation`
 */
public abstract class SysGroupRelationBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `sys_group_relation`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_group_relation`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_group_relation`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_group_relation`.group_id
     */
    private static final String PROPERTY_GROUPID = "groupId";

    /**
     * This field corresponds to the database column `sys_group_relation`.group_id
     */
    private static final String PROPERTY_REMARK_GROUPID = "";

    /**
     * This field corresponds to the database column `sys_group_relation`.group_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_GROUPID)
    private Long groupId;

    /**
     * This field corresponds to the database column `sys_group_relation`.organization_id
     */
    private static final String PROPERTY_ORGANIZATIONID = "organizationId";

    /**
     * This field corresponds to the database column `sys_group_relation`.organization_id
     */
    private static final String PROPERTY_REMARK_ORGANIZATIONID = "";

    /**
     * This field corresponds to the database column `sys_group_relation`.organization_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ORGANIZATIONID)
    private Long organizationId;

    /**
     * This field corresponds to the database column `sys_group_relation`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `sys_group_relation`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "";

    /**
     * This field corresponds to the database column `sys_group_relation`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field corresponds to the database column `sys_group_relation`.start_user_id
     */
    private static final String PROPERTY_STARTUSERID = "startUserId";

    /**
     * This field corresponds to the database column `sys_group_relation`.start_user_id
     */
    private static final String PROPERTY_REMARK_STARTUSERID = "";

    /**
     * This field corresponds to the database column `sys_group_relation`.start_user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STARTUSERID)
    private Long startUserId;

    /**
     * This field corresponds to the database column `sys_group_relation`.end_user_id
     */
    private static final String PROPERTY_ENDUSERID = "endUserId";

    /**
     * This field corresponds to the database column `sys_group_relation`.end_user_id
     */
    private static final String PROPERTY_REMARK_ENDUSERID = "";

    /**
     * This field corresponds to the database column `sys_group_relation`.end_user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ENDUSERID)
    private Long endUserId;

    /**
     * This method returns the value of the database column `sys_group_relation`.id
     *
     * @return the value of `sys_group_relation`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_group_relation`.id
     *
     * @param id the value for `sys_group_relation`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_group_relation`.group_id
     *
     * @return the value of `sys_group_relation`.group_id
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method sets the value of the database column `sys_group_relation`.group_id
     *
     * @param groupId the value for `sys_group_relation`.group_id
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method returns the value of the database column `sys_group_relation`.organization_id
     *
     * @return the value of `sys_group_relation`.organization_id
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * This method sets the value of the database column `sys_group_relation`.organization_id
     *
     * @param organizationId the value for `sys_group_relation`.organization_id
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * This method returns the value of the database column `sys_group_relation`.user_id
     *
     * @return the value of `sys_group_relation`.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `sys_group_relation`.user_id
     *
     * @param userId the value for `sys_group_relation`.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `sys_group_relation`.start_user_id
     *
     * @return the value of `sys_group_relation`.start_user_id
     */
    public Long getStartUserId() {
        return startUserId;
    }

    /**
     * This method sets the value of the database column `sys_group_relation`.start_user_id
     *
     * @param startUserId the value for `sys_group_relation`.start_user_id
     */
    public void setStartUserId(Long startUserId) {
        this.startUserId = startUserId;
    }

    /**
     * This method returns the value of the database column `sys_group_relation`.end_user_id
     *
     * @return the value of `sys_group_relation`.end_user_id
     */
    public Long getEndUserId() {
        return endUserId;
    }

    /**
     * This method sets the value of the database column `sys_group_relation`.end_user_id
     *
     * @param endUserId the value for `sys_group_relation`.end_user_id
     */
    public void setEndUserId(Long endUserId) {
        this.endUserId = endUserId;
    }
}