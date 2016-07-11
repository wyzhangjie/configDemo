/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysDepartment.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_department`
 */
public abstract class SysDepartmentBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_department`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_department`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_department`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `sys_department`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `sys_department`.name
     */
    private static final String PROPERTY_REMARK_NAME = "部门/11111";

    /**
     * This field corresponds to the database column `sys_department`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `sys_department`.sort
     */
    private static final String PROPERTY_SORT = "sort";

    /**
     * This field corresponds to the database column `sys_department`.sort
     */
    private static final String PROPERTY_REMARK_SORT = "序号";

    /**
     * This field corresponds to the database column `sys_department`.sort
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SORT)
    private Integer sort;

    /**
     * This field corresponds to the database column `sys_department`.linkman
     */
    private static final String PROPERTY_LINKMAN = "linkman";

    /**
     * This field corresponds to the database column `sys_department`.linkman
     */
    private static final String PROPERTY_REMARK_LINKMAN = "联系人";

    /**
     * This field corresponds to the database column `sys_department`.linkman
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LINKMAN)
    private String linkman;

    /**
     * This field corresponds to the database column `sys_department`.linkman_no
     */
    private static final String PROPERTY_LINKMANNO = "linkmanNo";

    /**
     * This field corresponds to the database column `sys_department`.linkman_no
     */
    private static final String PROPERTY_REMARK_LINKMANNO = "联系人电话";

    /**
     * This field corresponds to the database column `sys_department`.linkman_no
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LINKMANNO)
    private String linkmanNo;

    /**
     * This field corresponds to the database column `sys_department`.create_time
     */
    private static final String PROPERTY_CREATETIME = "createTime";

    /**
     * This field corresponds to the database column `sys_department`.create_time
     */
    private static final String PROPERTY_REMARK_CREATETIME = "创建时间";

    /**
     * This field corresponds to the database column `sys_department`.create_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATETIME)
    private String createTime;

    /**
     * This field corresponds to the database column `sys_department`.create_id
     */
    private static final String PROPERTY_CREATEID = "createId";

    /**
     * This field corresponds to the database column `sys_department`.create_id
     */
    private static final String PROPERTY_REMARK_CREATEID = "创建者";

    /**
     * This field corresponds to the database column `sys_department`.create_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CREATEID)
    private Integer createId;

    /**
     * This method returns the value of the database column `sys_department`.id
     *
     * @return the value of `sys_department`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_department`.id
     *
     * @param id the value for `sys_department`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_department`.name
     *
     * @return the value of `sys_department`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `sys_department`.name
     *
     * @param name the value for `sys_department`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `sys_department`.sort
     *
     * @return the value of `sys_department`.sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method sets the value of the database column `sys_department`.sort
     *
     * @param sort the value for `sys_department`.sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method returns the value of the database column `sys_department`.linkman
     *
     * @return the value of `sys_department`.linkman
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method sets the value of the database column `sys_department`.linkman
     *
     * @param linkman the value for `sys_department`.linkman
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * This method returns the value of the database column `sys_department`.linkman_no
     *
     * @return the value of `sys_department`.linkman_no
     */
    public String getLinkmanNo() {
        return linkmanNo;
    }

    /**
     * This method sets the value of the database column `sys_department`.linkman_no
     *
     * @param linkmanNo the value for `sys_department`.linkman_no
     */
    public void setLinkmanNo(String linkmanNo) {
        this.linkmanNo = linkmanNo;
    }

    /**
     * This method returns the value of the database column `sys_department`.create_time
     *
     * @return the value of `sys_department`.create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column `sys_department`.create_time
     *
     * @param createTime the value for `sys_department`.create_time
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column `sys_department`.create_id
     *
     * @return the value of `sys_department`.create_id
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method sets the value of the database column `sys_department`.create_id
     *
     * @param createId the value for `sys_department`.create_id
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }
}