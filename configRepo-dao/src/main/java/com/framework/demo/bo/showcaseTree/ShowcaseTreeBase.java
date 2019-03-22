/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.showcaseTree;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `showcase_tree`
 */
public abstract class ShowcaseTreeBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `showcase_tree`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `showcase_tree`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `showcase_tree`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `showcase_tree`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `showcase_tree`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `showcase_tree`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `showcase_tree`.parent_id
     */
    private static final String PROPERTY_PARENTID = "parentId";

    /**
     * This field corresponds to the database column `showcase_tree`.parent_id
     */
    private static final String PROPERTY_REMARK_PARENTID = "";

    /**
     * This field corresponds to the database column `showcase_tree`.parent_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTID)
    private Long parentId;

    /**
     * This field corresponds to the database column `showcase_tree`.parent_ids
     */
    private static final String PROPERTY_PARENTIDS = "parentIds";

    /**
     * This field corresponds to the database column `showcase_tree`.parent_ids
     */
    private static final String PROPERTY_REMARK_PARENTIDS = "";

    /**
     * This field corresponds to the database column `showcase_tree`.parent_ids
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTIDS)
    private String parentIds;

    /**
     * This field corresponds to the database column `showcase_tree`.icon
     */
    private static final String PROPERTY_ICON = "icon";

    /**
     * This field corresponds to the database column `showcase_tree`.icon
     */
    private static final String PROPERTY_REMARK_ICON = "";

    /**
     * This field corresponds to the database column `showcase_tree`.icon
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ICON)
    private String icon;

    /**
     * This field corresponds to the database column `showcase_tree`.weight
     */
    private static final String PROPERTY_WEIGHT = "weight";

    /**
     * This field corresponds to the database column `showcase_tree`.weight
     */
    private static final String PROPERTY_REMARK_WEIGHT = "";

    /**
     * This field corresponds to the database column `showcase_tree`.weight
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEIGHT)
    private Integer weight;

    /**
     * This field corresponds to the database column `showcase_tree`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `showcase_tree`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `showcase_tree`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This method returns the value of the database column `showcase_tree`.id
     *
     * @return the value of `showcase_tree`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `showcase_tree`.id
     *
     * @param id the value for `showcase_tree`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `showcase_tree`.name
     *
     * @return the value of `showcase_tree`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `showcase_tree`.name
     *
     * @param name the value for `showcase_tree`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `showcase_tree`.parent_id
     *
     * @return the value of `showcase_tree`.parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method sets the value of the database column `showcase_tree`.parent_id
     *
     * @param parentId the value for `showcase_tree`.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method returns the value of the database column `showcase_tree`.parent_ids
     *
     * @return the value of `showcase_tree`.parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method sets the value of the database column `showcase_tree`.parent_ids
     *
     * @param parentIds the value for `showcase_tree`.parent_ids
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * This method returns the value of the database column `showcase_tree`.icon
     *
     * @return the value of `showcase_tree`.icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method sets the value of the database column `showcase_tree`.icon
     *
     * @param icon the value for `showcase_tree`.icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method returns the value of the database column `showcase_tree`.weight
     *
     * @return the value of `showcase_tree`.weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method sets the value of the database column `showcase_tree`.weight
     *
     * @param weight the value for `showcase_tree`.weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method returns the value of the database column `showcase_tree`.is_show
     *
     * @return the value of `showcase_tree`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `showcase_tree`.is_show
     *
     * @param isShow the value for `showcase_tree`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}