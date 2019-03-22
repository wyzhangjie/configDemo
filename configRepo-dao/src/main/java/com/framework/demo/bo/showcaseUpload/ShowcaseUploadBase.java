/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.showcaseUpload;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `showcase_upload`
 */
public abstract class ShowcaseUploadBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `showcase_upload`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `showcase_upload`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `showcase_upload`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `showcase_upload`.name
     */
    private static final String PROPERTY_NAME = "name";

    /**
     * This field corresponds to the database column `showcase_upload`.name
     */
    private static final String PROPERTY_REMARK_NAME = "";

    /**
     * This field corresponds to the database column `showcase_upload`.name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NAME)
    private String name;

    /**
     * This field corresponds to the database column `showcase_upload`.src
     */
    private static final String PROPERTY_SRC = "src";

    /**
     * This field corresponds to the database column `showcase_upload`.src
     */
    private static final String PROPERTY_REMARK_SRC = "";

    /**
     * This field corresponds to the database column `showcase_upload`.src
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SRC)
    private String src;

    /**
     * This method returns the value of the database column `showcase_upload`.id
     *
     * @return the value of `showcase_upload`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `showcase_upload`.id
     *
     * @param id the value for `showcase_upload`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `showcase_upload`.name
     *
     * @return the value of `showcase_upload`.name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the value of the database column `showcase_upload`.name
     *
     * @param name the value for `showcase_upload`.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column `showcase_upload`.src
     *
     * @return the value of `showcase_upload`.src
     */
    public String getSrc() {
        return src;
    }

    /**
     * This method sets the value of the database column `showcase_upload`.src
     *
     * @param src the value for `showcase_upload`.src
     */
    public void setSrc(String src) {
        this.src = src;
    }
}