/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysAuth.bo.SysAuth;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_auth`
 */
public abstract class SysAuthBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_auth`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_auth`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_auth`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_auth`.organization_id
     */
    private static final String PROPERTY_ORGANIZATIONID = "organizationId";

    /**
     * This field corresponds to the database column `sys_auth`.organization_id
     */
    private static final String PROPERTY_REMARK_ORGANIZATIONID = "";

    /**
     * This field corresponds to the database column `sys_auth`.organization_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ORGANIZATIONID)
    private Long organizationId;

    /**
     * This field corresponds to the database column `sys_auth`.job_id
     */
    private static final String PROPERTY_JOBID = "jobId";

    /**
     * This field corresponds to the database column `sys_auth`.job_id
     */
    private static final String PROPERTY_REMARK_JOBID = "";

    /**
     * This field corresponds to the database column `sys_auth`.job_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_JOBID)
    private Long jobId;

    /**
     * This field corresponds to the database column `sys_auth`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `sys_auth`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "";

    /**
     * This field corresponds to the database column `sys_auth`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field corresponds to the database column `sys_auth`.group_id
     */
    private static final String PROPERTY_GROUPID = "groupId";

    /**
     * This field corresponds to the database column `sys_auth`.group_id
     */
    private static final String PROPERTY_REMARK_GROUPID = "";

    /**
     * This field corresponds to the database column `sys_auth`.group_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_GROUPID)
    private Long groupId;

    /**
     * This field corresponds to the database column `sys_auth`.role_ids
     */
    private static final String PROPERTY_ROLEIDS = "roleIds";

    /**
     * This field corresponds to the database column `sys_auth`.role_ids
     */
    private static final String PROPERTY_REMARK_ROLEIDS = "";

    /**
     * This field corresponds to the database column `sys_auth`.role_ids
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ROLEIDS)
    private String roleIds;

    /**
     * This field corresponds to the database column `sys_auth`.type
     */
    private static final String PROPERTY_TYPE = "type";

    /**
     * This field corresponds to the database column `sys_auth`.type
     */
    private static final String PROPERTY_REMARK_TYPE = "";

    /**
     * This field corresponds to the database column `sys_auth`.type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TYPE)
    private String type;

    /**
     * This method returns the value of the database column `sys_auth`.id
     *
     * @return the value of `sys_auth`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_auth`.id
     *
     * @param id the value for `sys_auth`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_auth`.organization_id
     *
     * @return the value of `sys_auth`.organization_id
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * This method sets the value of the database column `sys_auth`.organization_id
     *
     * @param organizationId the value for `sys_auth`.organization_id
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * This method returns the value of the database column `sys_auth`.job_id
     *
     * @return the value of `sys_auth`.job_id
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method sets the value of the database column `sys_auth`.job_id
     *
     * @param jobId the value for `sys_auth`.job_id
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * This method returns the value of the database column `sys_auth`.user_id
     *
     * @return the value of `sys_auth`.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `sys_auth`.user_id
     *
     * @param userId the value for `sys_auth`.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `sys_auth`.group_id
     *
     * @return the value of `sys_auth`.group_id
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method sets the value of the database column `sys_auth`.group_id
     *
     * @param groupId the value for `sys_auth`.group_id
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method returns the value of the database column `sys_auth`.role_ids
     *
     * @return the value of `sys_auth`.role_ids
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * This method sets the value of the database column `sys_auth`.role_ids
     *
     * @param roleIds the value for `sys_auth`.role_ids
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    /**
     * This method returns the value of the database column `sys_auth`.type
     *
     * @return the value of `sys_auth`.type
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the value of the database column `sys_auth`.type
     *
     * @param type the value for `sys_auth`.type
     */
    public void setType(String type) {
        this.type = type;
    }
}