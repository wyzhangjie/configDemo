/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.collection;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.TableField;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `tb_collection`
 */
public abstract class CollectionBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `tb_collection`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_collection`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `tb_collection`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `tb_collection`.username
     */
    private static final String PROPERTY_USERNAME = "username";

    /**
     * This field corresponds to the database column `tb_collection`.username
     */
    private static final String PROPERTY_REMARK_USERNAME = "用户登录名称";

    /**
     * This field corresponds to the database column `tb_collection`.username
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERNAME)
    private String username;

    /**
     * This field corresponds to the database column `tb_collection`.model
     */
    private static final String PROPERTY_MODEL = "model";

    /**
     * This field corresponds to the database column `tb_collection`.model
     */
    private static final String PROPERTY_REMARK_MODEL = "对应的model信息";

    /**
     * This field corresponds to the database column `tb_collection`.model
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MODEL)
    private Integer model;

    /**
     * This method returns the value of the database column `tb_collection`.id
     *
     * @return the value of `tb_collection`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_collection`.id
     *
     * @param id the value for `tb_collection`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_collection`.username
     *
     * @return the value of `tb_collection`.username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method sets the value of the database column `tb_collection`.username
     *
     * @param username the value for `tb_collection`.username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column `tb_collection`.model
     *
     * @return the value of `tb_collection`.model
     */
    public Integer getModel() {
        return model;
    }

    /**
     * This method sets the value of the database column `tb_collection`.model
     *
     * @param model the value for `tb_collection`.model
     */
    public void setModel(Integer model) {
        this.model = model;
    }

    /**
     * This method corresponds to the database table `tb_collection`
     */

}