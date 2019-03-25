/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysUserOrganizationJob.bo;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_user_organization_job`
 */
public abstract class SysUserOrganizationJobBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `sys_user_organization_job`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_user_organization_job`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field corresponds to the database column `sys_user_organization_job`.organization_id
     */
    private static final String PROPERTY_ORGANIZATIONID = "organizationId";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.organization_id
     */
    private static final String PROPERTY_REMARK_ORGANIZATIONID = "";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.organization_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ORGANIZATIONID)
    private Long organizationId;

    /**
     * This field corresponds to the database column `sys_user_organization_job`.job_id
     */
    private static final String PROPERTY_JOBID = "jobId";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.job_id
     */
    private static final String PROPERTY_REMARK_JOBID = "";

    /**
     * This field corresponds to the database column `sys_user_organization_job`.job_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_JOBID)
    private Long jobId;

    /**
     * This method returns the value of the database column `sys_user_organization_job`.id
     *
     * @return the value of `sys_user_organization_job`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_user_organization_job`.id
     *
     * @param id the value for `sys_user_organization_job`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_user_organization_job`.user_id
     *
     * @return the value of `sys_user_organization_job`.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `sys_user_organization_job`.user_id
     *
     * @param userId the value for `sys_user_organization_job`.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `sys_user_organization_job`.organization_id
     *
     * @return the value of `sys_user_organization_job`.organization_id
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * This method sets the value of the database column `sys_user_organization_job`.organization_id
     *
     * @param organizationId the value for `sys_user_organization_job`.organization_id
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * This method returns the value of the database column `sys_user_organization_job`.job_id
     *
     * @return the value of `sys_user_organization_job`.job_id
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method sets the value of the database column `sys_user_organization_job`.job_id
     *
     * @param jobId the value for `sys_user_organization_job`.job_id
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
}