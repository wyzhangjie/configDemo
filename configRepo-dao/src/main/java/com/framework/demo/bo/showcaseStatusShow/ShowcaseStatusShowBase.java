/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.showcaseStatusShow;

import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;
import com.github.fartherp.framework.tree.bo.Treeable;

/**
 * This class corresponds to the database table `showcase_status_show`
 */
public abstract class ShowcaseStatusShowBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `showcase_status_show`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `showcase_status_show`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `showcase_status_show`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `showcase_status_show`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `showcase_status_show`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `showcase_status_show`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `showcase_status_show`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `showcase_status_show`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "";

    /**
     * This field corresponds to the database column `showcase_status_show`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private String status;

    /**
     * This method returns the value of the database column `showcase_tree`.id
     *
     * @return the value of `showcase_tree`.id
     */
    public Long getId() {
        return id;
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
     * This method returns the value of the database column `showcase_tree`.name
     *
     * @return the value of `showcase_tree`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `showcase_status_show`.id
     *
     * @param id the value for `showcase_status_show`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `showcase_status_show`.status
     *
     * @return the value of `showcase_status_show`.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `showcase_status_show`.status
     *
     * @param status the value for `showcase_status_show`.status
     */
    public void setStatus(String status) {
        this.status = status;
    }


}