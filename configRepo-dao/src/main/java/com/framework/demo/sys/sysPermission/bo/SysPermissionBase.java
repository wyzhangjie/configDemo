/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysPermission.bo;

import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_permission`
 */
public abstract class SysPermissionBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `sys_permission`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_permission`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_permission`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_permission`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `sys_permission`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `sys_permission`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `sys_permission`.permission
     */
    private static final String PROPERTY_PERMISSION = "permission";

    /**
     * This field corresponds to the database column `sys_permission`.permission
     */
    private static final String PROPERTY_REMARK_PERMISSION = "";

    /**
     * This field corresponds to the database column `sys_permission`.permission
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PERMISSION)
    private String permission;

    /**
     * This field corresponds to the database column `sys_permission`.description
     */
    private static final String PROPERTY_DESCRIPTION = "description";

    /**
     * This field corresponds to the database column `sys_permission`.description
     */
    private static final String PROPERTY_REMARK_DESCRIPTION = "";

    /**
     * This field corresponds to the database column `sys_permission`.description
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DESCRIPTION)
    private String description;

    /**
     * This field corresponds to the database column `sys_permission`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `sys_permission`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `sys_permission`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This method returns the value of the database column `sys_permission`.id
     *
     * @return the value of `sys_permission`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_permission`.id
     *
     * @param id the value for `sys_permission`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_permission`.name
     *
     * @return the value of `sys_permission`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `sys_permission`.name
     *
     * @param name the value for `sys_permission`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `sys_permission`.permission
     *
     * @return the value of `sys_permission`.permission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method sets the value of the database column `sys_permission`.permission
     *
     * @param permission the value for `sys_permission`.permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * This method returns the value of the database column `sys_permission`.description
     *
     * @return the value of `sys_permission`.description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method sets the value of the database column `sys_permission`.description
     *
     * @param description the value for `sys_permission`.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method returns the value of the database column `sys_permission`.is_show
     *
     * @return the value of `sys_permission`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `sys_permission`.is_show
     *
     * @param isShow the value for `sys_permission`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}