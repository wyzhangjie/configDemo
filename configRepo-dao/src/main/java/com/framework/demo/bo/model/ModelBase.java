/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.model;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `tb_model`
 */
public abstract class ModelBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `tb_model`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `tb_model`.id
     */
    private static final String PROPERTY_REMARK_ID = "自增主键";

    /**
     * This field corresponds to the database column `tb_model`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `tb_model`.model
     */
    private static final String PROPERTY_MODEL = "model";

    /**
     * This field corresponds to the database column `tb_model`.model
     */
    private static final String PROPERTY_REMARK_MODEL = "model id";

    /**
     * This field corresponds to the database column `tb_model`.model
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MODEL)
    private Integer model;

    /**
     * This field corresponds to the database column `tb_model`.model_name
     */
    private static final String PROPERTY_MODELNAME = "modelName";

    /**
     * This field corresponds to the database column `tb_model`.model_name
     */
    private static final String PROPERTY_REMARK_MODELNAME = "model name";

    /**
     * This field corresponds to the database column `tb_model`.model_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MODELNAME)
    private String modelName;

    /**
     * This method returns the value of the database column `tb_model`.id
     *
     * @return the value of `tb_model`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `tb_model`.id
     *
     * @param id the value for `tb_model`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `tb_model`.model
     *
     * @return the value of `tb_model`.model
     */
    public Integer getModel() {
        return model;
    }

    /**
     * This method sets the value of the database column `tb_model`.model
     *
     * @param model the value for `tb_model`.model
     */
    public void setModel(Integer model) {
        this.model = model;
    }

    /**
     * This method returns the value of the database column `tb_model`.model_name
     *
     * @return the value of `tb_model`.model_name
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method sets the value of the database column `tb_model`.model_name
     *
     * @param modelName the value for `tb_model`.model_name
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


}