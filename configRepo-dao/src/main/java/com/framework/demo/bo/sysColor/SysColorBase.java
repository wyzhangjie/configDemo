/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.sysColor;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.TableField;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `sys_color`
 */
public abstract class SysColorBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_color`.Id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_color`.Id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_color`.Id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `sys_color`.color
     */
    private static final String PROPERTY_COLOR = "color";

    /**
     * This field corresponds to the database column `sys_color`.color
     */
    private static final String PROPERTY_REMARK_COLOR = "";

    /**
     * This field corresponds to the database column `sys_color`.color
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COLOR)
    private String color;

    /**
     * This method returns the value of the database column `sys_color`.Id
     *
     * @return the value of `sys_color`.Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_color`.Id
     *
     * @param id the value for `sys_color`.Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_color`.color
     *
     * @return the value of `sys_color`.color
     */
    public String getColor() {
        return color;
    }

    /**
     * This method sets the value of the database column `sys_color`.color
     *
     * @param color the value for `sys_color`.color
     */
    public void setColor(String color) {
        this.color = color;
    }


}