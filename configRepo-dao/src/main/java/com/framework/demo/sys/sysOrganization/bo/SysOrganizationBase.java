/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysOrganization.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import cn.vansky.framework.tree.bo.Treeable;

/**
 * This class corresponds to the database table `sys_organization`
 */
public abstract class SysOrganizationBase extends Treeable implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_organization`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_organization`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_organization`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_organization`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `sys_organization`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `sys_organization`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `sys_organization`.type
     */
    private static final String PROPERTY_TYPE = "type";

    /**
     * This field corresponds to the database column `sys_organization`.type
     */
    private static final String PROPERTY_REMARK_TYPE = "";

    /**
     * This field corresponds to the database column `sys_organization`.type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TYPE)
    private String type;

    /**
     * This field corresponds to the database column `sys_organization`.parent_id
     */
    private static final String PROPERTY_PARENTID = "parentId";

    /**
     * This field corresponds to the database column `sys_organization`.parent_id
     */
    private static final String PROPERTY_REMARK_PARENTID = "";

    /**
     * This field corresponds to the database column `sys_organization`.parent_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTID)
    private Long parentId;

    /**
     * This field corresponds to the database column `sys_organization`.parent_ids
     */
    private static final String PROPERTY_PARENTIDS = "parentIds";

    /**
     * This field corresponds to the database column `sys_organization`.parent_ids
     */
    private static final String PROPERTY_REMARK_PARENTIDS = "";

    /**
     * This field corresponds to the database column `sys_organization`.parent_ids
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTIDS)
    private String parentIds;

    /**
     * This field corresponds to the database column `sys_organization`.icon
     */
    private static final String PROPERTY_ICON = "icon";

    /**
     * This field corresponds to the database column `sys_organization`.icon
     */
    private static final String PROPERTY_REMARK_ICON = "";

    /**
     * This field corresponds to the database column `sys_organization`.icon
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ICON)
    private String icon;

    /**
     * This field corresponds to the database column `sys_organization`.weight
     */
    private static final String PROPERTY_WEIGHT = "weight";

    /**
     * This field corresponds to the database column `sys_organization`.weight
     */
    private static final String PROPERTY_REMARK_WEIGHT = "";

    /**
     * This field corresponds to the database column `sys_organization`.weight
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEIGHT)
    private Integer weight;

    /**
     * This field corresponds to the database column `sys_organization`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `sys_organization`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `sys_organization`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This method returns the value of the database column `sys_organization`.id
     *
     * @return the value of `sys_organization`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_organization`.id
     *
     * @param id the value for `sys_organization`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_organization`.name
     *
     * @return the value of `sys_organization`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `sys_organization`.name
     *
     * @param name the value for `sys_organization`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `sys_organization`.type
     *
     * @return the value of `sys_organization`.type
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the value of the database column `sys_organization`.type
     *
     * @param type the value for `sys_organization`.type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column `sys_organization`.parent_id
     *
     * @return the value of `sys_organization`.parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method sets the value of the database column `sys_organization`.parent_id
     *
     * @param parentId the value for `sys_organization`.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method returns the value of the database column `sys_organization`.parent_ids
     *
     * @return the value of `sys_organization`.parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method sets the value of the database column `sys_organization`.parent_ids
     *
     * @param parentIds the value for `sys_organization`.parent_ids
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * This method returns the value of the database column `sys_organization`.icon
     *
     * @return the value of `sys_organization`.icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method sets the value of the database column `sys_organization`.icon
     *
     * @param icon the value for `sys_organization`.icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method returns the value of the database column `sys_organization`.weight
     *
     * @return the value of `sys_organization`.weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method sets the value of the database column `sys_organization`.weight
     *
     * @param weight the value for `sys_organization`.weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method returns the value of the database column `sys_organization`.is_show
     *
     * @return the value of `sys_organization`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `sys_organization`.is_show
     *
     * @param isShow the value for `sys_organization`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}