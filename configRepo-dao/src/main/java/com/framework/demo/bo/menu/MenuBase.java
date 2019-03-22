/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.menu;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `menu`
 */
public abstract class MenuBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `menu`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `menu`.id
     */
    private static final String PROPERTY_REMARK_ID = "目录id";

    /**
     * This field corresponds to the database column `menu`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `menu`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `menu`.name
     */
    private static final String PROPERTY_REMARK_NAME = "中文名";

    /**
     * This field corresponds to the database column `menu`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `menu`.path
     */
    private static final String PROPERTY_PATH = "path";

    /**
     * This field corresponds to the database column `menu`.path
     */
    private static final String PROPERTY_REMARK_PATH = "路径";

    /**
     * This field corresponds to the database column `menu`.path
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PATH)
    private String path;

    /**
     * This field corresponds to the database column `menu`.sort
     */
    private static final String PROPERTY_SORT = "sort";

    /**
     * This field corresponds to the database column `menu`.sort
     */
    private static final String PROPERTY_REMARK_SORT = "排序";

    /**
     * This field corresponds to the database column `menu`.sort
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SORT)
    private Integer sort;

    /**
     * This field corresponds to the database column `menu`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `menu`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "状态：2 隐藏 1 显示";

    /**
     * This field corresponds to the database column `menu`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private String status;

    /**
     * This field corresponds to the database column `menu`.update_time
     */
    private static final String PROPERTY_UPDATETIME = "updateTime";

    /**
     * This field corresponds to the database column `menu`.update_time
     */
    private static final String PROPERTY_REMARK_UPDATETIME = "更新时间";

    /**
     * This field corresponds to the database column `menu`.update_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_UPDATETIME)
    private String updateTime;

    /**
     * This field corresponds to the database column `menu`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `menu`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "创建时间";

    /**
     * This field corresponds to the database column `menu`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private String createTime;

    /**
     * This field corresponds to the database column `menu`.create_id
     */
    private static final String PROPERTY_CREATEID = "createId";

    /**
     * This field corresponds to the database column `menu`.create_id
     */
    private static final String PROPERTY_REMARK_CREATEID = "创建者";

    /**
     * This field corresponds to the database column `menu`.create_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATEID)
    private Integer createId;

    /**
     * This field corresponds to the database column `menu`.linkId
     */
    private static final String PROPERTY_LINKID = "linkId";

    /**
     * This field corresponds to the database column `menu`.linkId
     */
    private static final String PROPERTY_REMARK_LINKID = "";

    /**
     * This field corresponds to the database column `menu`.linkId
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LINKID)
    private String linkId;

    /**
     * This field corresponds to the database column `menu`.parentId
     */
    private static final String PROPERTY_PARENTID = "parentId";

    /**
     * This field corresponds to the database column `menu`.parentId
     */
    private static final String PROPERTY_REMARK_PARENTID = "";

    /**
     * This field corresponds to the database column `menu`.parentId
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARENTID)
    private Long parentId;


    private static final String PROPERTY_PARENTIDS = "parentIds";

    private static final String PROPERTY_REMARK_PARENTIDS = "";

    @ColumnDescription(desc = PROPERTY_REMARK_PARENTIDS)
    private String parentIds;

    /**
     * This field corresponds to the database column `menu`.templeteId
     */
    private static final String PROPERTY_TEMPLETEID = "templeteId";

    /**
     * This field corresponds to the database column `menu`.templeteId
     */
    private static final String PROPERTY_REMARK_TEMPLETEID = "";

    /**
     * This field corresponds to the database column `menu`.templeteId
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TEMPLETEID)
    private Integer templeteId;


    private String identity;

    private Integer weight;

    private String icon;
    /**
     * This method returns the value of the database column `menu`.id
     *
     * @return the value of `menu`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `menu`.id
     *
     * @param id the value for `menu`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `menu`.name
     *
     * @return the value of `menu`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `menu`.name
     *
     * @param name the value for `menu`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `menu`.path
     *
     * @return the value of `menu`.path
     */
    public String getPath() {
        return path;
    }

    /**
     * This method sets the value of the database column `menu`.path
     *
     * @param path the value for `menu`.path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method returns the value of the database column `menu`.sort
     *
     * @return the value of `menu`.sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method sets the value of the database column `menu`.sort
     *
     * @param sort the value for `menu`.sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method returns the value of the database column `menu`.status
     *
     * @return the value of `menu`.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `menu`.status
     *
     * @param status the value for `menu`.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `menu`.update_time
     *
     * @return the value of `menu`.update_time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method sets the value of the database column `menu`.update_time
     *
     * @param updateTime the value for `menu`.update_time
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method returns the value of the database column `menu`.create_time
     *
     * @return the value of `menu`.create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `menu`.create_time
     *
     * @param createTime the value for `menu`.create_time
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `menu`.create_id
     *
     * @return the value of `menu`.create_id
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method sets the value of the database column `menu`.create_id
     *
     * @param createId the value for `menu`.create_id
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method returns the value of the database column `menu`.linkId
     *
     * @return the value of `menu`.linkId
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * This method sets the value of the database column `menu`.linkId
     *
     * @param linkId the value for `menu`.linkId
     */
    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * This method returns the value of the database column `menu`.parentId
     *
     * @return the value of `menu`.parentId
     *//*
    public Integer getParentId() {
        return parentId;
    }

    *//**
     * This method sets the value of the database column `menu`.parentId
     *
     * @param parentId the value for `menu`.parentId
     */


    /**
     * This method returns the value of the database column `menu`.templeteId
     *
     * @return the value of `menu`.templeteId
     */


    public Integer getTempleteId() {
        return templeteId;
    }

    /**
     * This method sets the value of the database column `menu`.templeteId
     *
     * @param templeteId the value for `menu`.templeteId
     */
    public void setTempleteId(Integer templeteId) {
        this.templeteId = templeteId;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * This method corresponds to the database table `menu`
     */

}