/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.sysRole;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_role`
 */
public abstract class SysRoleBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_role`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_role`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_role`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_role`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `sys_role`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `sys_role`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `sys_role`.role
     */
    private static final String PROPERTY_ROLE = "role";

    /**
     * This field corresponds to the database column `sys_role`.role
     */
    private static final String PROPERTY_REMARK_ROLE = "";

    /**
     * This field corresponds to the database column `sys_role`.role
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ROLE)
    private String role;

    /**
     * This field corresponds to the database column `sys_role`.description
     */
    private static final String PROPERTY_DESCRIPTION = "description";

    /**
     * This field corresponds to the database column `sys_role`.description
     */
    private static final String PROPERTY_REMARK_DESCRIPTION = "";

    /**
     * This field corresponds to the database column `sys_role`.description
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DESCRIPTION)
    private String description;

    /**
     * This field corresponds to the database column `sys_role`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `sys_role`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `sys_role`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This method returns the value of the database column `sys_role`.id
     *
     * @return the value of `sys_role`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_role`.id
     *
     * @param id the value for `sys_role`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_role`.name
     *
     * @return the value of `sys_role`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `sys_role`.name
     *
     * @param name the value for `sys_role`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `sys_role`.role
     *
     * @return the value of `sys_role`.role
     */
    public String getRole() {
        return role;
    }

    /**
     * This method sets the value of the database column `sys_role`.role
     *
     * @param role the value for `sys_role`.role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method returns the value of the database column `sys_role`.description
     *
     * @return the value of `sys_role`.description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method sets the value of the database column `sys_role`.description
     *
     * @param description the value for `sys_role`.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method returns the value of the database column `sys_role`.is_show
     *
     * @return the value of `sys_role`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `sys_role`.is_show
     *
     * @param isShow the value for `sys_role`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}