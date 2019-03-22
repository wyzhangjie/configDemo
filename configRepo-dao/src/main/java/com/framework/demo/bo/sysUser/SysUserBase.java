/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.sysUser;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

import java.util.Date;

/**
 * This class corresponds to the database table `sys_user`
 */
public abstract class SysUserBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `sys_user`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_user`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_user`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_user`.username
     */
    private static final String PROPERTY_USERNAME = "username";

    /**
     * This field corresponds to the database column `sys_user`.username
     */
    private static final String PROPERTY_REMARK_USERNAME = "";

    /**
     * This field corresponds to the database column `sys_user`.username
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERNAME)
    private String username;

    /**
     * This field corresponds to the database column `sys_user`.email
     */
    private static final String PROPERTY_EMAIL = "email";

    /**
     * This field corresponds to the database column `sys_user`.email
     */
    private static final String PROPERTY_REMARK_EMAIL = "";

    /**
     * This field corresponds to the database column `sys_user`.email
     */
    @ColumnDescription(desc = PROPERTY_REMARK_EMAIL)
    private String email;

    /**
     * This field corresponds to the database column `sys_user`.mobile_phone_number
     */
    private static final String PROPERTY_MOBILEPHONENUMBER = "mobilePhoneNumber";

    /**
     * This field corresponds to the database column `sys_user`.mobile_phone_number
     */
    private static final String PROPERTY_REMARK_MOBILEPHONENUMBER = "";

    /**
     * This field corresponds to the database column `sys_user`.mobile_phone_number
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MOBILEPHONENUMBER)
    private String mobilePhoneNumber;

    /**
     * This field corresponds to the database column `sys_user`.password
     */
    private static final String PROPERTY_PASSWORD = "password";

    /**
     * This field corresponds to the database column `sys_user`.password
     */
    private static final String PROPERTY_REMARK_PASSWORD = "";

    /**
     * This field corresponds to the database column `sys_user`.password
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PASSWORD)
    private String password;

    /**
     * This field corresponds to the database column `sys_user`.salt
     */
    private static final String PROPERTY_SALT = "salt";

    /**
     * This field corresponds to the database column `sys_user`.salt
     */
    private static final String PROPERTY_REMARK_SALT = "";

    /**
     * This field corresponds to the database column `sys_user`.salt
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SALT)
    private String salt;

    /**
     * This field corresponds to the database column `sys_user`.create_date
     */
    private static final String PROPERTY_CREATEDATE = "createDate";

    /**
     * This field corresponds to the database column `sys_user`.create_date
     */
    private static final String PROPERTY_REMARK_CREATEDATE = "";

    /**
     * This field corresponds to the database column `sys_user`.create_date
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATEDATE)
    private Date createDate;

    /**
     * This field corresponds to the database column `sys_user`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `sys_user`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "";

    /**
     * This field corresponds to the database column `sys_user`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private String status;

    /**
     * This field corresponds to the database column `sys_user`.deleted
     */
    private static final String PROPERTY_DELETED = "deleted";

    /**
     * This field corresponds to the database column `sys_user`.deleted
     */
    private static final String PROPERTY_REMARK_DELETED = "";

    /**
     * This field corresponds to the database column `sys_user`.deleted
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DELETED)
    private Boolean deleted;

    /**
     * This field corresponds to the database column `sys_user`.admin
     */
    private static final String PROPERTY_ADMIN = "admin";

    /**
     * This field corresponds to the database column `sys_user`.admin
     */
    private static final String PROPERTY_REMARK_ADMIN = "";

    /**
     * This field corresponds to the database column `sys_user`.admin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ADMIN)
    private Boolean admin;

    /**
     * This method returns the value of the database column `sys_user`.id
     *
     * @return the value of `sys_user`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_user`.id
     *
     * @param id the value for `sys_user`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_user`.username
     *
     * @return the value of `sys_user`.username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method sets the value of the database column `sys_user`.username
     *
     * @param username the value for `sys_user`.username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column `sys_user`.email
     *
     * @return the value of `sys_user`.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method sets the value of the database column `sys_user`.email
     *
     * @param email the value for `sys_user`.email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method returns the value of the database column `sys_user`.mobile_phone_number
     *
     * @return the value of `sys_user`.mobile_phone_number
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * This method sets the value of the database column `sys_user`.mobile_phone_number
     *
     * @param mobilePhoneNumber the value for `sys_user`.mobile_phone_number
     */
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    /**
     * This method returns the value of the database column `sys_user`.password
     *
     * @return the value of `sys_user`.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method sets the value of the database column `sys_user`.password
     *
     * @param password the value for `sys_user`.password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column `sys_user`.salt
     *
     * @return the value of `sys_user`.salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method sets the value of the database column `sys_user`.salt
     *
     * @param salt the value for `sys_user`.salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method returns the value of the database column `sys_user`.create_date
     *
     * @return the value of `sys_user`.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method sets the value of the database column `sys_user`.create_date
     *
     * @param createDate the value for `sys_user`.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method returns the value of the database column `sys_user`.status
     *
     * @return the value of `sys_user`.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `sys_user`.status
     *
     * @param status the value for `sys_user`.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `sys_user`.deleted
     *
     * @return the value of `sys_user`.deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method sets the value of the database column `sys_user`.deleted
     *
     * @param deleted the value for `sys_user`.deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method returns the value of the database column `sys_user`.admin
     *
     * @return the value of `sys_user`.admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * This method sets the value of the database column `sys_user`.admin
     *
     * @param admin the value for `sys_user`.admin
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}