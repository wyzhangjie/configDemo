/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.datagrid;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `easyui_column`
 */
public abstract class EasyuiColumnBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `easyui_column`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `easyui_column`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `easyui_column`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `easyui_column`.title
     */
    private static final String PROPERTY_TITLE = "title";

    /**
     * This field corresponds to the database column `easyui_column`.title
     */
    private static final String PROPERTY_REMARK_TITLE = "";

    /**
     * This field corresponds to the database column `easyui_column`.title
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TITLE)
    private String title;

    /**
     * This field corresponds to the database column `easyui_column`.rowspan
     */
    private static final String PROPERTY_ROWSPAN = "rowspan";

    /**
     * This field corresponds to the database column `easyui_column`.rowspan
     */
    private static final String PROPERTY_REMARK_ROWSPAN = "";

    /**
     * This field corresponds to the database column `easyui_column`.rowspan
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ROWSPAN)
    private Integer rowspan;

    /**
     * This field corresponds to the database column `easyui_column`.width
     */
    private static final String PROPERTY_WIDTH = "width";

    /**
     * This field corresponds to the database column `easyui_column`.width
     */
    private static final String PROPERTY_REMARK_WIDTH = "";

    /**
     * This field corresponds to the database column `easyui_column`.width
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WIDTH)
    private Integer width;

    /**
     * This field corresponds to the database column `easyui_column`.sortable
     */
    private static final String PROPERTY_SORTABLE = "sortable";

    /**
     * This field corresponds to the database column `easyui_column`.sortable
     */
    private static final String PROPERTY_REMARK_SORTABLE = "";

    /**
     * This field corresponds to the database column `easyui_column`.sortable
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SORTABLE)
    private String sortable;

    /**
     * This field corresponds to the database column `easyui_column`.colspan
     */
    private static final String PROPERTY_COLSPAN = "colspan";

    /**
     * This field corresponds to the database column `easyui_column`.colspan
     */
    private static final String PROPERTY_REMARK_COLSPAN = "";

    /**
     * This field corresponds to the database column `easyui_column`.colspan
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COLSPAN)
    private String colspan;

    /**
     * This field corresponds to the database column `easyui_column`.align
     */
    private static final String PROPERTY_ALIGN = "align";

    /**
     * This field corresponds to the database column `easyui_column`.align
     */
    private static final String PROPERTY_REMARK_ALIGN = "";

    /**
     * This field corresponds to the database column `easyui_column`.align
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ALIGN)
    private String align;

    /**
     * This field corresponds to the database column `easyui_column`.halign
     */
    private static final String PROPERTY_HALIGN = "halign";

    /**
     * This field corresponds to the database column `easyui_column`.halign
     */
    private static final String PROPERTY_REMARK_HALIGN = "";

    /**
     * This field corresponds to the database column `easyui_column`.halign
     */
    @ColumnDescription(desc = PROPERTY_REMARK_HALIGN)
    private String halign;

    /**
     * This field corresponds to the database column `easyui_column`.order
     */
    private static final String PROPERTY_ORDER = "order";

    /**
     * This field corresponds to the database column `easyui_column`.order
     */
    private static final String PROPERTY_REMARK_ORDER = "";

    /**
     * This field corresponds to the database column `easyui_column`.order
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ORDER)
    private String order;

    /**
     * This field corresponds to the database column `easyui_column`.resizable
     */
    private static final String PROPERTY_RESIZABLE = "resizable";

    /**
     * This field corresponds to the database column `easyui_column`.resizable
     */
    private static final String PROPERTY_REMARK_RESIZABLE = "";

    /**
     * This field corresponds to the database column `easyui_column`.resizable
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RESIZABLE)
    private String resizable;

    /**
     * This field corresponds to the database column `easyui_column`.fixed
     */
    private static final String PROPERTY_FIXED = "fixed";

    /**
     * This field corresponds to the database column `easyui_column`.fixed
     */
    private static final String PROPERTY_REMARK_FIXED = "";

    /**
     * This field corresponds to the database column `easyui_column`.fixed
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FIXED)
    private String fixed;

    /**
     * This field corresponds to the database column `easyui_column`.hidden
     */
    private static final String PROPERTY_HIDDEN = "hidden";

    /**
     * This field corresponds to the database column `easyui_column`.hidden
     */
    private static final String PROPERTY_REMARK_HIDDEN = "";

    /**
     * This field corresponds to the database column `easyui_column`.hidden
     */
    @ColumnDescription(desc = PROPERTY_REMARK_HIDDEN)
    private String hidden;

    /**
     * This field corresponds to the database column `easyui_column`.checkbox
     */
    private static final String PROPERTY_CHECKBOX = "checkbox";

    /**
     * This field corresponds to the database column `easyui_column`.checkbox
     */
    private static final String PROPERTY_REMARK_CHECKBOX = "";

    /**
     * This field corresponds to the database column `easyui_column`.checkbox
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CHECKBOX)
    private String checkbox;

    /**
     * This field corresponds to the database column `easyui_column`.model
     */
    private static final String PROPERTY_MODEL = "model";

    /**
     * This field corresponds to the database column `easyui_column`.model
     */
    private static final String PROPERTY_REMARK_MODEL = "";

    /**
     * This field corresponds to the database column `easyui_column`.model
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MODEL)
    private String model;

    /**
     * This field corresponds to the database column `easyui_column`.field
     */
    private static final String PROPERTY_FIELD = "field";

    /**
     * This field corresponds to the database column `easyui_column`.field
     */
    private static final String PROPERTY_REMARK_FIELD = "";

    /**
     * This field corresponds to the database column `easyui_column`.field
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FIELD)
    private String field;

    /**
     * This method returns the value of the database column `easyui_column`.id
     *
     * @return the value of `easyui_column`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `easyui_column`.id
     *
     * @param id the value for `easyui_column`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `easyui_column`.title
     *
     * @return the value of `easyui_column`.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method sets the value of the database column `easyui_column`.title
     *
     * @param title the value for `easyui_column`.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column `easyui_column`.rowspan
     *
     * @return the value of `easyui_column`.rowspan
     */
    public Integer getRowspan() {
        return rowspan;
    }

    /**
     * This method sets the value of the database column `easyui_column`.rowspan
     *
     * @param rowspan the value for `easyui_column`.rowspan
     */
    public void setRowspan(Integer rowspan) {
        this.rowspan = rowspan;
    }

    /**
     * This method returns the value of the database column `easyui_column`.width
     *
     * @return the value of `easyui_column`.width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method sets the value of the database column `easyui_column`.width
     *
     * @param width the value for `easyui_column`.width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method returns the value of the database column `easyui_column`.sortable
     *
     * @return the value of `easyui_column`.sortable
     */
    public String getSortable() {
        return sortable;
    }

    /**
     * This method sets the value of the database column `easyui_column`.sortable
     *
     * @param sortable the value for `easyui_column`.sortable
     */
    public void setSortable(String sortable) {
        this.sortable = sortable;
    }

    /**
     * This method returns the value of the database column `easyui_column`.colspan
     *
     * @return the value of `easyui_column`.colspan
     */
    public String getColspan() {
        return colspan;
    }

    /**
     * This method sets the value of the database column `easyui_column`.colspan
     *
     * @param colspan the value for `easyui_column`.colspan
     */
    public void setColspan(String colspan) {
        this.colspan = colspan;
    }

    /**
     * This method returns the value of the database column `easyui_column`.align
     *
     * @return the value of `easyui_column`.align
     */
    public String getAlign() {
        return align;
    }

    /**
     * This method sets the value of the database column `easyui_column`.align
     *
     * @param align the value for `easyui_column`.align
     */
    public void setAlign(String align) {
        this.align = align;
    }

    /**
     * This method returns the value of the database column `easyui_column`.halign
     *
     * @return the value of `easyui_column`.halign
     */
    public String getHalign() {
        return halign;
    }

    /**
     * This method sets the value of the database column `easyui_column`.halign
     *
     * @param halign the value for `easyui_column`.halign
     */
    public void setHalign(String halign) {
        this.halign = halign;
    }

    /**
     * This method returns the value of the database column `easyui_column`.order
     *
     * @return the value of `easyui_column`.order
     */
    public String getOrder() {
        return order;
    }

    /**
     * This method sets the value of the database column `easyui_column`.order
     *
     * @param order the value for `easyui_column`.order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * This method returns the value of the database column `easyui_column`.resizable
     *
     * @return the value of `easyui_column`.resizable
     */
    public String getResizable() {
        return resizable;
    }

    /**
     * This method sets the value of the database column `easyui_column`.resizable
     *
     * @param resizable the value for `easyui_column`.resizable
     */
    public void setResizable(String resizable) {
        this.resizable = resizable;
    }

    /**
     * This method returns the value of the database column `easyui_column`.fixed
     *
     * @return the value of `easyui_column`.fixed
     */
    public String getFixed() {
        return fixed;
    }

    /**
     * This method sets the value of the database column `easyui_column`.fixed
     *
     * @param fixed the value for `easyui_column`.fixed
     */
    public void setFixed(String fixed) {
        this.fixed = fixed;
    }

    /**
     * This method returns the value of the database column `easyui_column`.hidden
     *
     * @return the value of `easyui_column`.hidden
     */
    public String getHidden() {
        return hidden;
    }

    /**
     * This method sets the value of the database column `easyui_column`.hidden
     *
     * @param hidden the value for `easyui_column`.hidden
     */
    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    /**
     * This method returns the value of the database column `easyui_column`.checkbox
     *
     * @return the value of `easyui_column`.checkbox
     */
    public String getCheckbox() {
        return checkbox;
    }

    /**
     * This method sets the value of the database column `easyui_column`.checkbox
     *
     * @param checkbox the value for `easyui_column`.checkbox
     */
    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }

    /**
     * This method returns the value of the database column `easyui_column`.model
     *
     * @return the value of `easyui_column`.model
     */
    public String getModel() {
        return model;
    }

    /**
     * This method sets the value of the database column `easyui_column`.model
     *
     * @param model the value for `easyui_column`.model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * This method returns the value of the database column `easyui_column`.field
     *
     * @return the value of `easyui_column`.field
     */
    public String getField() {
        return field;
    }

    /**
     * This method sets the value of the database column `easyui_column`.field
     *
     * @param field the value for `easyui_column`.field
     */
    public void setField(String field) {
        this.field = field;
    }
}