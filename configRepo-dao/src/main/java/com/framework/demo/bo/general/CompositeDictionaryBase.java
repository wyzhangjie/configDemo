/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.general;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `td_composite_dictionary`
 */
public abstract class CompositeDictionaryBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `td_composite_dictionary`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.id
     */
    private static final String PROPERTY_REMARK_ID = "主键标识";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_id
     */
    private static final String PROPERTY_DICID = "dicId";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_id
     */
    private static final String PROPERTY_REMARK_DICID = "字典ID";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DICID)
    private Integer dicId;

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_name
     */
    private static final String PROPERTY_DICNAME = "dicName";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_name
     */
    private static final String PROPERTY_REMARK_DICNAME = "字典名称";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DICNAME)
    private String dicName;

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_type
     */
    private static final String PROPERTY_DICTYPE = "dicType";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_type
     */
    private static final String PROPERTY_REMARK_DICTYPE = "类型";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_type
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DICTYPE)
    private Integer dicType;

    /**
     * This field corresponds to the database column `td_composite_dictionary`.status
     */
    private static final String PROPERTY_STATUS = "status";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.status
     */
    private static final String PROPERTY_REMARK_STATUS = "字典状态:1:启用,0:禁用";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.status
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STATUS)
    private Byte status;

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_desc
     */
    private static final String PROPERTY_DICDESC = "dicDesc";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_desc
     */
    private static final String PROPERTY_REMARK_DICDESC = "字典描述";

    /**
     * This field corresponds to the database column `td_composite_dictionary`.dic_desc
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DICDESC)
    private String dicDesc;

    /**
     * This method returns the value of the database column `td_composite_dictionary`.id
     *
     * @return the value of `td_composite_dictionary`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `td_composite_dictionary`.id
     *
     * @param id the value for `td_composite_dictionary`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `td_composite_dictionary`.dic_id
     *
     * @return the value of `td_composite_dictionary`.dic_id
     */
    public Integer getDicId() {
        return dicId;
    }

    /**
     * This method sets the value of the database column `td_composite_dictionary`.dic_id
     *
     * @param dicId the value for `td_composite_dictionary`.dic_id
     */
    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    /**
     * This method returns the value of the database column `td_composite_dictionary`.dic_name
     *
     * @return the value of `td_composite_dictionary`.dic_name
     */
    public String getDicName() {
        return dicName;
    }

    /**
     * This method sets the value of the database column `td_composite_dictionary`.dic_name
     *
     * @param dicName the value for `td_composite_dictionary`.dic_name
     */
    public void setDicName(String dicName) {
        this.dicName = dicName;
    }

    /**
     * This method returns the value of the database column `td_composite_dictionary`.dic_type
     *
     * @return the value of `td_composite_dictionary`.dic_type
     */
    public Integer getDicType() {
        return dicType;
    }

    /**
     * This method sets the value of the database column `td_composite_dictionary`.dic_type
     *
     * @param dicType the value for `td_composite_dictionary`.dic_type
     */
    public void setDicType(Integer dicType) {
        this.dicType = dicType;
    }

    /**
     * This method returns the value of the database column `td_composite_dictionary`.status
     *
     * @return the value of `td_composite_dictionary`.status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column `td_composite_dictionary`.status
     *
     * @param status the value for `td_composite_dictionary`.status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column `td_composite_dictionary`.dic_desc
     *
     * @return the value of `td_composite_dictionary`.dic_desc
     */
    public String getDicDesc() {
        return dicDesc;
    }

    /**
     * This method sets the value of the database column `td_composite_dictionary`.dic_desc
     *
     * @param dicDesc the value for `td_composite_dictionary`.dic_desc
     */
    public void setDicDesc(String dicDesc) {
        this.dicDesc = dicDesc;
    }


}