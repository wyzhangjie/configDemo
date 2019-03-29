/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysGroup.bo;

import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_group`
 */
public abstract class SysGroupBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `sys_group`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_group`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_group`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_group`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `sys_group`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `sys_group`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `sys_group`.type
     */
    private static final String PROPERTY_TYPE = "type";

    /**
     * This field corresponds to the database column `sys_group`.type
     */
    private static final String PROPERTY_REMARK_TYPE = "";

    /**
     * This field corresponds to the database column `sys_group`.type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TYPE)
    private String type;

    /**
     * This field corresponds to the database column `sys_group`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `sys_group`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `sys_group`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This field corresponds to the database column `sys_group`.default_group
     */
    private static final String PROPERTY_DEFAULTGROUP = "defaultGroup";

    /**
     * This field corresponds to the database column `sys_group`.default_group
     */
    private static final String PROPERTY_REMARK_DEFAULTGROUP = "";

    /**
     * This field corresponds to the database column `sys_group`.default_group
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DEFAULTGROUP)
    private Boolean defaultGroup;

    /**
     * This method returns the value of the database column `sys_group`.id
     *
     * @return the value of `sys_group`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_group`.id
     *
     * @param id the value for `sys_group`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_group`.name
     *
     * @return the value of `sys_group`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `sys_group`.name
     *
     * @param name the value for `sys_group`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `sys_group`.type
     *
     * @return the value of `sys_group`.type
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the value of the database column `sys_group`.type
     *
     * @param type the value for `sys_group`.type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column `sys_group`.is_show
     *
     * @return the value of `sys_group`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `sys_group`.is_show
     *
     * @param isShow the value for `sys_group`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method returns the value of the database column `sys_group`.default_group
     *
     * @return the value of `sys_group`.default_group
     */
    public Boolean getDefaultGroup() {
        return defaultGroup;
    }

    /**
     * This method sets the value of the database column `sys_group`.default_group
     *
     * @param defaultGroup the value for `sys_group`.default_group
     */
    public void setDefaultGroup(Boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
    }
}