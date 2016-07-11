/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.sysTemplColr;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_templ_colr`
 */
public abstract class SysTemplColrBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_templ_colr`.Id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_templ_colr`.Id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.Id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `sys_templ_colr`.templete_id
     */
    private static final String PROPERTY_TEMPLETEID = "templeteId";

    /**
     * This field corresponds to the database column `sys_templ_colr`.templete_id
     */
    private static final String PROPERTY_REMARK_TEMPLETEID = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.templete_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TEMPLETEID)
    private String templeteId;

    /**
     * This field corresponds to the database column `sys_templ_colr`.color1_id
     */
    private static final String PROPERTY_COLOR1ID = "color1Id";

    /**
     * This field corresponds to the database column `sys_templ_colr`.color1_id
     */
    private static final String PROPERTY_REMARK_COLOR1ID = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.color1_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COLOR1ID)
    private String color1Id;

    /**
     * This field corresponds to the database column `sys_templ_colr`.color2_id
     */
    private static final String PROPERTY_COLOR2ID = "color2Id";

    /**
     * This field corresponds to the database column `sys_templ_colr`.color2_id
     */
    private static final String PROPERTY_REMARK_COLOR2ID = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.color2_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COLOR2ID)
    private String color2Id;

    /**
     * This field corresponds to the database column `sys_templ_colr`.color3_id
     */
    private static final String PROPERTY_COLOR3ID = "color3Id";

    /**
     * This field corresponds to the database column `sys_templ_colr`.color3_id
     */
    private static final String PROPERTY_REMARK_COLOR3ID = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.color3_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COLOR3ID)
    private String color3Id;

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition1
     */
    private static final String PROPERTY_CONDITION1 = "condition1";

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition1
     */
    private static final String PROPERTY_REMARK_CONDITION1 = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition1
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CONDITION1)
    private String condition1;

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition2
     */
    private static final String PROPERTY_CONDITION2 = "condition2";

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition2
     */
    private static final String PROPERTY_REMARK_CONDITION2 = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition2
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CONDITION2)
    private String condition2;

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition3
     */
    private static final String PROPERTY_CONDITION3 = "condition3";

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition3
     */
    private static final String PROPERTY_REMARK_CONDITION3 = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.condition3
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CONDITION3)
    private String condition3;

    /**
     * This field corresponds to the database column `sys_templ_colr`.model
     */
    private static final String PROPERTY_MODEL = "model";

    /**
     * This field corresponds to the database column `sys_templ_colr`.model
     */
    private static final String PROPERTY_REMARK_MODEL = "";

    /**
     * This field corresponds to the database column `sys_templ_colr`.model
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MODEL)
    private String model;

    /**
     * This method returns the value of the database column `sys_templ_colr`.Id
     *
     * @return the value of `sys_templ_colr`.Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.Id
     *
     * @param id the value for `sys_templ_colr`.Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.templete_id
     *
     * @return the value of `sys_templ_colr`.templete_id
     */
    public String getTempleteId() {
        return templeteId;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.templete_id
     *
     * @param templeteId the value for `sys_templ_colr`.templete_id
     */
    public void setTempleteId(String templeteId) {
        this.templeteId = templeteId;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.color1_id
     *
     * @return the value of `sys_templ_colr`.color1_id
     */
    public String getColor1Id() {
        return color1Id;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.color1_id
     *
     * @param color1Id the value for `sys_templ_colr`.color1_id
     */
    public void setColor1Id(String color1Id) {
        this.color1Id = color1Id;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.color2_id
     *
     * @return the value of `sys_templ_colr`.color2_id
     */
    public String getColor2Id() {
        return color2Id;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.color2_id
     *
     * @param color2Id the value for `sys_templ_colr`.color2_id
     */
    public void setColor2Id(String color2Id) {
        this.color2Id = color2Id;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.color3_id
     *
     * @return the value of `sys_templ_colr`.color3_id
     */
    public String getColor3Id() {
        return color3Id;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.color3_id
     *
     * @param color3Id the value for `sys_templ_colr`.color3_id
     */
    public void setColor3Id(String color3Id) {
        this.color3Id = color3Id;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.condition1
     *
     * @return the value of `sys_templ_colr`.condition1
     */
    public String getCondition1() {
        return condition1;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.condition1
     *
     * @param condition1 the value for `sys_templ_colr`.condition1
     */
    public void setCondition1(String condition1) {
        this.condition1 = condition1;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.condition2
     *
     * @return the value of `sys_templ_colr`.condition2
     */
    public String getCondition2() {
        return condition2;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.condition2
     *
     * @param condition2 the value for `sys_templ_colr`.condition2
     */
    public void setCondition2(String condition2) {
        this.condition2 = condition2;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.condition3
     *
     * @return the value of `sys_templ_colr`.condition3
     */
    public String getCondition3() {
        return condition3;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.condition3
     *
     * @param condition3 the value for `sys_templ_colr`.condition3
     */
    public void setCondition3(String condition3) {
        this.condition3 = condition3;
    }

    /**
     * This method returns the value of the database column `sys_templ_colr`.model
     *
     * @return the value of `sys_templ_colr`.model
     */
    public String getModel() {
        return model;
    }

    /**
     * This method sets the value of the database column `sys_templ_colr`.model
     *
     * @param model the value for `sys_templ_colr`.model
     */
    public void setModel(String model) {
        this.model = model;
    }
}