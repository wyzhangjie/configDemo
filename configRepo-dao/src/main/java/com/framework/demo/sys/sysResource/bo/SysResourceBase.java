/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysResource.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_resource`
 */
public abstract class SysResourceBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_resource`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_resource`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_resource`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_resource`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `sys_resource`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `sys_resource`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `sys_resource`.identity
     */
    private static final String PROPERTY_IDENTITY = "identity";

    /**
     * This field corresponds to the database column `sys_resource`.identity
     */
    private static final String PROPERTY_REMARK_IDENTITY = "";

    /**
     * This field corresponds to the database column `sys_resource`.identity
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IDENTITY)
    private String identity;

    /**
     * This field corresponds to the database column `sys_resource`.url
     */
    private static final String PROPERTY_URL = "url";

    /**
     * This field corresponds to the database column `sys_resource`.url
     */
    private static final String PROPERTY_REMARK_URL = "";

    /**
     * This field corresponds to the database column `sys_resource`.url
     */
    @ColumnDescription(desc = PROPERTY_REMARK_URL)
    private String url;

    /**
     * This field corresponds to the database column `sys_resource`.parent_id
     */
    private static final String PROPERTY_PARENTID = "parentId";

    /**
     * This field corresponds to the database column `sys_resource`.parent_id
     */
    private static final String PROPERTY_REMARK_PARENTID = "";

    /**
     * This field corresponds to the database column `sys_resource`.parent_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTID)
    private Long parentId;

    /**
     * This field corresponds to the database column `sys_resource`.parent_ids
     */
    private static final String PROPERTY_PARENTIDS = "parentIds";

    /**
     * This field corresponds to the database column `sys_resource`.parent_ids
     */
    private static final String PROPERTY_REMARK_PARENTIDS = "";

    /**
     * This field corresponds to the database column `sys_resource`.parent_ids
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTIDS)
    private String parentIds;

    /**
     * This field corresponds to the database column `sys_resource`.icon
     */
    private static final String PROPERTY_ICON = "icon";

    /**
     * This field corresponds to the database column `sys_resource`.icon
     */
    private static final String PROPERTY_REMARK_ICON = "";

    /**
     * This field corresponds to the database column `sys_resource`.icon
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ICON)
    private String icon;

    /**
     * This field corresponds to the database column `sys_resource`.weight
     */
    private static final String PROPERTY_WEIGHT = "weight";

    /**
     * This field corresponds to the database column `sys_resource`.weight
     */
    private static final String PROPERTY_REMARK_WEIGHT = "";

    /**
     * This field corresponds to the database column `sys_resource`.weight
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEIGHT)
    private Integer weight;

    /**
     * This field corresponds to the database column `sys_resource`.is_show
     */
    private static final String PROPERTY_ISSHOW = "isShow";

    /**
     * This field corresponds to the database column `sys_resource`.is_show
     */
    private static final String PROPERTY_REMARK_ISSHOW = "";

    /**
     * This field corresponds to the database column `sys_resource`.is_show
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISSHOW)
    private Boolean isShow;

    /**
     * This method returns the value of the database column `sys_resource`.id
     *
     * @return the value of `sys_resource`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_resource`.id
     *
     * @param id the value for `sys_resource`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_resource`.name
     *
     * @return the value of `sys_resource`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `sys_resource`.name
     *
     * @param name the value for `sys_resource`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `sys_resource`.identity
     *
     * @return the value of `sys_resource`.identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * This method sets the value of the database column `sys_resource`.identity
     *
     * @param identity the value for `sys_resource`.identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * This method returns the value of the database column `sys_resource`.url
     *
     * @return the value of `sys_resource`.url
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method sets the value of the database column `sys_resource`.url
     *
     * @param url the value for `sys_resource`.url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method returns the value of the database column `sys_resource`.parent_id
     *
     * @return the value of `sys_resource`.parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method sets the value of the database column `sys_resource`.parent_id
     *
     * @param parentId the value for `sys_resource`.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method returns the value of the database column `sys_resource`.parent_ids
     *
     * @return the value of `sys_resource`.parent_ids
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method sets the value of the database column `sys_resource`.parent_ids
     *
     * @param parentIds the value for `sys_resource`.parent_ids
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * This method returns the value of the database column `sys_resource`.icon
     *
     * @return the value of `sys_resource`.icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method sets the value of the database column `sys_resource`.icon
     *
     * @param icon the value for `sys_resource`.icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method returns the value of the database column `sys_resource`.weight
     *
     * @return the value of `sys_resource`.weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method sets the value of the database column `sys_resource`.weight
     *
     * @param weight the value for `sys_resource`.weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method returns the value of the database column `sys_resource`.is_show
     *
     * @return the value of `sys_resource`.is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method sets the value of the database column `sys_resource`.is_show
     *
     * @param isShow the value for `sys_resource`.is_show
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }
}