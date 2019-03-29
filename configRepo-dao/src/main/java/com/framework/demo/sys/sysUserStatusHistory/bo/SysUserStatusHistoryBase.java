/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserStatusHistory.bo;

import com.github.fartherp.framework.database.dao.FieldAccessVo;
import java.util.Date;

/**
 * This class corresponds to the database table `sys_user_status_history`
 */
public abstract class SysUserStatusHistoryBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `sys_user_status_history`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_user_status_history`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_user_status_history`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_user_status_history`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `sys_user_status_history`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "";

    /**
     * This field corresponds to the database column `sys_user_status_history`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field corresponds to the database column `sys_user_status_history`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `sys_user_status_history`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "";

    /**
     * This field corresponds to the database column `sys_user_status_history`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private String status;

    /**
     * This field corresponds to the database column `sys_user_status_history`.reason
     */
    private static final String PROPERTY_REASON = "reason";

    /**
     * This field corresponds to the database column `sys_user_status_history`.reason
     */
    private static final String PROPERTY_REMARK_REASON = "";

    /**
     * This field corresponds to the database column `sys_user_status_history`.reason
     */
    @ColumnDescription(desc = PROPERTY_REMARK_REASON)
    private String reason;

    /**
     * This field corresponds to the database column `sys_user_status_history`.op_user_id
     */
    private static final String PROPERTY_OPUSERID = "opUserId";

    /**
     * This field corresponds to the database column `sys_user_status_history`.op_user_id
     */
    private static final String PROPERTY_REMARK_OPUSERID = "";

    /**
     * This field corresponds to the database column `sys_user_status_history`.op_user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OPUSERID)
    private Long opUserId;

    /**
     * This field corresponds to the database column `sys_user_status_history`.op_date
     */
    private static final String PROPERTY_OPDATE = "opDate";

    /**
     * This field corresponds to the database column `sys_user_status_history`.op_date
     */
    private static final String PROPERTY_REMARK_OPDATE = "";

    /**
     * This field corresponds to the database column `sys_user_status_history`.op_date
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OPDATE)
    private Date opDate;

    /**
     * This method returns the value of the database column `sys_user_status_history`.id
     *
     * @return the value of `sys_user_status_history`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_user_status_history`.id
     *
     * @param id the value for `sys_user_status_history`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_user_status_history`.user_id
     *
     * @return the value of `sys_user_status_history`.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `sys_user_status_history`.user_id
     *
     * @param userId the value for `sys_user_status_history`.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `sys_user_status_history`.status
     *
     * @return the value of `sys_user_status_history`.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `sys_user_status_history`.status
     *
     * @param status the value for `sys_user_status_history`.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `sys_user_status_history`.reason
     *
     * @return the value of `sys_user_status_history`.reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method sets the value of the database column `sys_user_status_history`.reason
     *
     * @param reason the value for `sys_user_status_history`.reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method returns the value of the database column `sys_user_status_history`.op_user_id
     *
     * @return the value of `sys_user_status_history`.op_user_id
     */
    public Long getOpUserId() {
        return opUserId;
    }

    /**
     * This method sets the value of the database column `sys_user_status_history`.op_user_id
     *
     * @param opUserId the value for `sys_user_status_history`.op_user_id
     */
    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

    /**
     * This method returns the value of the database column `sys_user_status_history`.op_date
     *
     * @return the value of `sys_user_status_history`.op_date
     */
    public Date getOpDate() {
        return opDate;
    }

    /**
     * This method sets the value of the database column `sys_user_status_history`.op_date
     *
     * @param opDate the value for `sys_user_status_history`.op_date
     */
    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }
}