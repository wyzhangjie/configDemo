/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysJob.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import cn.vansky.framework.tree.bo.Treeable;

/**
 * This class corresponds to the database table `sys_job`
 */
public abstract class SysJobBase extends Treeable<Long> implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_job`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_job`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_job`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_job`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `sys_job`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `sys_job`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `sys_job`.parent_id
     */
    private static final String PROPERTY_PARENTID = "parentId";

    /**
     * This field corresponds to the database column `sys_job`.parent_id
     */
    private static final String PROPERTY_REMARK_PARENTID = "";

    /**
     * This field corresponds to the database column `sys_job`.parent_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTID)
    private Long parentId;

    /**
     * This field corresponds to the database column `sys_job`.parent_ids
     */
    private static final String PROPERTY_PARENTIDS = "parentIds";

    /**
     * This field corresponds to the database column `sys_job`.parent_ids
     */
    private static final String PROPERTY_REMARK_PARENTIDS = "";

    /**
     * This field corresponds to the database column `sys_job`.parent_ids
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTIDS)
    private String parentIds;

    /**
     * This field corresponds to the database column `sys_job`.icon
     */
    private static final String PROPERTY_ICON = "icon";

    /**
     * This field corresponds to the database column `sys_job`.icon
     */
    private static final String PROPERTY_REMARK_ICON = "";

    /**
     * This field corresponds to the database column `sys_job`.icon
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ICON)
    private String icon;

    /**
     * This field corresponds to the database column `sys_job`.weight
     */
    private static final String PROPERTY_WEIGHT = "weight";

    /**
     * This field corresponds to the database column `sys_job`.weight
     */
    private static final String PROPERTY_REMARK_WEIGHT = "";

    /**
     * This field corresponds to the database column `sys_job`.weight
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEIGHT)
    private Integer weight;

    /**
     * This field corresponds to the database column `sys_job`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `sys_job`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `sys_job`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This method returns the value of the database column `sys_job`.id
     *
     * @return the value of `sys_job`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_job`.id
     *
     * @param id the value for `sys_job`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_job`.name
     *
     * @return the value of `sys_job`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `sys_job`.name
     *
     * @param name the value for `sys_job`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `sys_job`.parent_id
     *
     * @return the value of `sys_job`.parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method sets the value of the database column `sys_job`.parent_id
     *
     * @param parentId the value for `sys_job`.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method returns the value of the database column `sys_job`.parent_ids
     *
     * @return the value of `sys_job`.parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method sets the value of the database column `sys_job`.parent_ids
     *
     * @param parentIds the value for `sys_job`.parent_ids
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * This method returns the value of the database column `sys_job`.icon
     *
     * @return the value of `sys_job`.icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method sets the value of the database column `sys_job`.icon
     *
     * @param icon the value for `sys_job`.icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method returns the value of the database column `sys_job`.weight
     *
     * @return the value of `sys_job`.weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method sets the value of the database column `sys_job`.weight
     *
     * @param weight the value for `sys_job`.weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method returns the value of the database column `sys_job`.is_show
     *
     * @return the value of `sys_job`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `sys_job`.is_show
     *
     * @param isShow the value for `sys_job`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}