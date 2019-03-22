/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.datagrid;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
public abstract class EasyuiDatagridBase extends FieldAccessVo {
    /**
     * This field corresponds to the database column `easyui_datagrid`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `easyui_datagrid`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `easyui_datagrid`.model
     */
    private static final String PROPERTY_MODEL = "model";

    /**
     * This field corresponds to the database column `easyui_datagrid`.model
     */
    private static final String PROPERTY_REMARK_MODEL = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.model
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MODEL)
    private Integer model;

    /**
     * This field corresponds to the database column `easyui_datagrid`.fitColumns
     */
    private static final String PROPERTY_FITCOLUMNS = "fitColumns";

    /**
     * This field corresponds to the database column `easyui_datagrid`.fitColumns
     */
    private static final String PROPERTY_REMARK_FITCOLUMNS = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.fitColumns
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FITCOLUMNS)
    private String fitColumns;

    /**
     * This field corresponds to the database column `easyui_datagrid`.resizeHandle
     */
    private static final String PROPERTY_RESIZEHANDLE = "resizeHandle";

    /**
     * This field corresponds to the database column `easyui_datagrid`.resizeHandle
     */
    private static final String PROPERTY_REMARK_RESIZEHANDLE = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.resizeHandle
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RESIZEHANDLE)
    private String resizeHandle;

    /**
     * This field corresponds to the database column `easyui_datagrid`.autoRowHeight
     */
    private static final String PROPERTY_AUTOROWHEIGHT = "autoRowHeight";

    /**
     * This field corresponds to the database column `easyui_datagrid`.autoRowHeight
     */
    private static final String PROPERTY_REMARK_AUTOROWHEIGHT = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.autoRowHeight
     */
    @ColumnDescription(desc = PROPERTY_REMARK_AUTOROWHEIGHT)
    private String autoRowHeight;

    /**
     * This field corresponds to the database column `easyui_datagrid`.stripe
     */
    private static final String PROPERTY_STRIPE = "stripe";

    /**
     * This field corresponds to the database column `easyui_datagrid`.stripe
     */
    private static final String PROPERTY_REMARK_STRIPE = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.stripe
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STRIPE)
    private String stripe;

    /**
     * This field corresponds to the database column `easyui_datagrid`.method
     */
    private static final String PROPERTY_METHOD = "method";

    /**
     * This field corresponds to the database column `easyui_datagrid`.method
     */
    private static final String PROPERTY_REMARK_METHOD = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.method
     */
    @ColumnDescription(desc = PROPERTY_REMARK_METHOD)
    private String method;

    /**
     * This field corresponds to the database column `easyui_datagrid`.nowrap
     */
    private static final String PROPERTY_NOWRAP = "nowrap";

    /**
     * This field corresponds to the database column `easyui_datagrid`.nowrap
     */
    private static final String PROPERTY_REMARK_NOWRAP = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.nowrap
     */
    @ColumnDescription(desc = PROPERTY_REMARK_NOWRAP)
    private String nowrap;

    /**
     * This field corresponds to the database column `easyui_datagrid`.idField
     */
    private static final String PROPERTY_IDFIELD = "idField";

    /**
     * This field corresponds to the database column `easyui_datagrid`.idField
     */
    private static final String PROPERTY_REMARK_IDFIELD = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.idField
     */
    @ColumnDescription(desc = PROPERTY_REMARK_IDFIELD)
    private String idField;

    /**
     * This field corresponds to the database column `easyui_datagrid`.url
     */
    private static final String PROPERTY_URL = "url";

    /**
     * This field corresponds to the database column `easyui_datagrid`.url
     */
    private static final String PROPERTY_REMARK_URL = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.url
     */
    @ColumnDescription(desc = PROPERTY_REMARK_URL)
    private String url;

    /**
     * This field corresponds to the database column `easyui_datagrid`.loadMsg
     */
    private static final String PROPERTY_LOADMSG = "loadMsg";

    /**
     * This field corresponds to the database column `easyui_datagrid`.loadMsg
     */
    private static final String PROPERTY_REMARK_LOADMSG = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.loadMsg
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LOADMSG)
    private String loadMsg;

    /**
     * This field corresponds to the database column `easyui_datagrid`.pagination
     */
    private static final String PROPERTY_PAGINATION = "pagination";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pagination
     */
    private static final String PROPERTY_REMARK_PAGINATION = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pagination
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PAGINATION)
    private String pagination;

    /**
     * This field corresponds to the database column `easyui_datagrid`.rownumbers
     */
    private static final String PROPERTY_ROWNUMBERS = "rownumbers";

    /**
     * This field corresponds to the database column `easyui_datagrid`.rownumbers
     */
    private static final String PROPERTY_REMARK_ROWNUMBERS = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.rownumbers
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ROWNUMBERS)
    private String rownumbers;

    /**
     * This field corresponds to the database column `easyui_datagrid`.singleSelect
     */
    private static final String PROPERTY_SINGLESELECT = "singleSelect";

    /**
     * This field corresponds to the database column `easyui_datagrid`.singleSelect
     */
    private static final String PROPERTY_REMARK_SINGLESELECT = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.singleSelect
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SINGLESELECT)
    private String singleSelect;

    /**
     * This field corresponds to the database column `easyui_datagrid`.ctrlSelect
     */
    private static final String PROPERTY_CTRLSELECT = "ctrlSelect";

    /**
     * This field corresponds to the database column `easyui_datagrid`.ctrlSelect
     */
    private static final String PROPERTY_REMARK_CTRLSELECT = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.ctrlSelect
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CTRLSELECT)
    private String ctrlSelect;

    /**
     * This field corresponds to the database column `easyui_datagrid`.checkOnSelect
     */
    private static final String PROPERTY_CHECKONSELECT = "checkOnSelect";

    /**
     * This field corresponds to the database column `easyui_datagrid`.checkOnSelect
     */
    private static final String PROPERTY_REMARK_CHECKONSELECT = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.checkOnSelect
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CHECKONSELECT)
    private String checkOnSelect;

    /**
     * This field corresponds to the database column `easyui_datagrid`.selectOnCheck
     */
    private static final String PROPERTY_SELECTONCHECK = "selectOnCheck";

    /**
     * This field corresponds to the database column `easyui_datagrid`.selectOnCheck
     */
    private static final String PROPERTY_REMARK_SELECTONCHECK = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.selectOnCheck
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SELECTONCHECK)
    private byte[] selectOnCheck;

    /**
     * This field corresponds to the database column `easyui_datagrid`.pagePosition
     */
    private static final String PROPERTY_PAGEPOSITION = "pagePosition";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pagePosition
     */
    private static final String PROPERTY_REMARK_PAGEPOSITION = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pagePosition
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PAGEPOSITION)
    private String pagePosition;

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageNumber
     */
    private static final String PROPERTY_PAGENUMBER = "pageNumber";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageNumber
     */
    private static final String PROPERTY_REMARK_PAGENUMBER = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageNumber
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PAGENUMBER)
    private String pageNumber;

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageSize
     */
    private static final String PROPERTY_PAGESIZE = "pageSize";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageSize
     */
    private static final String PROPERTY_REMARK_PAGESIZE = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageSize
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PAGESIZE)
    private String pageSize;

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageList
     */
    private static final String PROPERTY_PAGELIST = "pageList";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageList
     */
    private static final String PROPERTY_REMARK_PAGELIST = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.pageList
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PAGELIST)
    private String pageList;

    /**
     * This field corresponds to the database column `easyui_datagrid`.sortName
     */
    private static final String PROPERTY_SORTNAME = "sortName";

    /**
     * This field corresponds to the database column `easyui_datagrid`.sortName
     */
    private static final String PROPERTY_REMARK_SORTNAME = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.sortName
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SORTNAME)
    private String sortName;

    /**
     * This field corresponds to the database column `easyui_datagrid`.sortOrder
     */
    private static final String PROPERTY_SORTORDER = "sortOrder";

    /**
     * This field corresponds to the database column `easyui_datagrid`.sortOrder
     */
    private static final String PROPERTY_REMARK_SORTORDER = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.sortOrder
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SORTORDER)
    private String sortOrder;

    /**
     * This field corresponds to the database column `easyui_datagrid`.multiSort
     */
    private static final String PROPERTY_MULTISORT = "multiSort";

    /**
     * This field corresponds to the database column `easyui_datagrid`.multiSort
     */
    private static final String PROPERTY_REMARK_MULTISORT = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.multiSort
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MULTISORT)
    private String multiSort;

    /**
     * This field corresponds to the database column `easyui_datagrid`.remoteSort
     */
    private static final String PROPERTY_REMOTESORT = "remoteSort";

    /**
     * This field corresponds to the database column `easyui_datagrid`.remoteSort
     */
    private static final String PROPERTY_REMARK_REMOTESORT = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.remoteSort
     */
    @ColumnDescription(desc = PROPERTY_REMARK_REMOTESORT)
    private String remoteSort;

    /**
     * This field corresponds to the database column `easyui_datagrid`.scrollbarSize
     */
    private static final String PROPERTY_SCROLLBARSIZE = "scrollbarSize";

    /**
     * This field corresponds to the database column `easyui_datagrid`.scrollbarSize
     */
    private static final String PROPERTY_REMARK_SCROLLBARSIZE = "";

    /**
     * This field corresponds to the database column `easyui_datagrid`.scrollbarSize
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SCROLLBARSIZE)
    private String scrollbarSize;

    /**
     * This field corresponds to the database column `easyui_datagrid`.param
     */
    private static final String PROPERTY_PARAM = "param";

    /**
     * This field corresponds to the database column `easyui_datagrid`.param
     */
    private static final String PROPERTY_REMARK_PARAM = "字段名称";

    /**
     * This field corresponds to the database column `easyui_datagrid`.param
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PARAM)
    private String param;

    /**
     * This field corresponds to the database column `easyui_datagrid`.sql
     */
    private static final String PROPERTY_SQL = "sql";

    /**
     * This field corresponds to the database column `easyui_datagrid`.sql
     */
    private static final String PROPERTY_REMARK_SQL = "查数据需要的sql";

    /**
     * This field corresponds to the database column `easyui_datagrid`.sql
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SQL)
    private String sql;

    /**
     * This field corresponds to the database column `easyui_datagrid`.multime
     */
    private static final String PROPERTY_MULTIME = "multime";

    /**
     * This field corresponds to the database column `easyui_datagrid`.multime
     */
    private static final String PROPERTY_REMARK_MULTIME = "0 单个时间控件  1 两个时间控件";

    /**
     * This field corresponds to the database column `easyui_datagrid`.multime
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MULTIME)
    private String multime;

    /**
     * This method returns the value of the database column `easyui_datagrid`.id
     *
     * @return the value of `easyui_datagrid`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.id
     *
     * @param id the value for `easyui_datagrid`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.model
     *
     * @return the value of `easyui_datagrid`.model
     */
    public Integer getModel() {
        return model;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.model
     *
     * @param model the value for `easyui_datagrid`.model
     */
    public void setModel(Integer model) {
        this.model = model;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.fitColumns
     *
     * @return the value of `easyui_datagrid`.fitColumns
     */
    public String getFitColumns() {
        return fitColumns;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.fitColumns
     *
     * @param fitColumns the value for `easyui_datagrid`.fitColumns
     */
    public void setFitColumns(String fitColumns) {
        this.fitColumns = fitColumns;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.resizeHandle
     *
     * @return the value of `easyui_datagrid`.resizeHandle
     */
    public String getResizeHandle() {
        return resizeHandle;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.resizeHandle
     *
     * @param resizeHandle the value for `easyui_datagrid`.resizeHandle
     */
    public void setResizeHandle(String resizeHandle) {
        this.resizeHandle = resizeHandle;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.autoRowHeight
     *
     * @return the value of `easyui_datagrid`.autoRowHeight
     */
    public String getAutoRowHeight() {
        return autoRowHeight;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.autoRowHeight
     *
     * @param autoRowHeight the value for `easyui_datagrid`.autoRowHeight
     */
    public void setAutoRowHeight(String autoRowHeight) {
        this.autoRowHeight = autoRowHeight;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.stripe
     *
     * @return the value of `easyui_datagrid`.stripe
     */
    public String getStripe() {
        return stripe;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.stripe
     *
     * @param stripe the value for `easyui_datagrid`.stripe
     */
    public void setStripe(String stripe) {
        this.stripe = stripe;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.method
     *
     * @return the value of `easyui_datagrid`.method
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.method
     *
     * @param method the value for `easyui_datagrid`.method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.nowrap
     *
     * @return the value of `easyui_datagrid`.nowrap
     */
    public String getNowrap() {
        return nowrap;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.nowrap
     *
     * @param nowrap the value for `easyui_datagrid`.nowrap
     */
    public void setNowrap(String nowrap) {
        this.nowrap = nowrap;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.idField
     *
     * @return the value of `easyui_datagrid`.idField
     */
    public String getIdField() {
        return idField;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.idField
     *
     * @param idField the value for `easyui_datagrid`.idField
     */
    public void setIdField(String idField) {
        this.idField = idField;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.url
     *
     * @return the value of `easyui_datagrid`.url
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.url
     *
     * @param url the value for `easyui_datagrid`.url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.loadMsg
     *
     * @return the value of `easyui_datagrid`.loadMsg
     */
    public String getLoadMsg() {
        return loadMsg;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.loadMsg
     *
     * @param loadMsg the value for `easyui_datagrid`.loadMsg
     */
    public void setLoadMsg(String loadMsg) {
        this.loadMsg = loadMsg;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.pagination
     *
     * @return the value of `easyui_datagrid`.pagination
     */
    public String getPagination() {
        return pagination;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.pagination
     *
     * @param pagination the value for `easyui_datagrid`.pagination
     */
    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.rownumbers
     *
     * @return the value of `easyui_datagrid`.rownumbers
     */
    public String getRownumbers() {
        return rownumbers;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.rownumbers
     *
     * @param rownumbers the value for `easyui_datagrid`.rownumbers
     */
    public void setRownumbers(String rownumbers) {
        this.rownumbers = rownumbers;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.singleSelect
     *
     * @return the value of `easyui_datagrid`.singleSelect
     */
    public String getSingleSelect() {
        return singleSelect;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.singleSelect
     *
     * @param singleSelect the value for `easyui_datagrid`.singleSelect
     */
    public void setSingleSelect(String singleSelect) {
        this.singleSelect = singleSelect;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.ctrlSelect
     *
     * @return the value of `easyui_datagrid`.ctrlSelect
     */
    public String getCtrlSelect() {
        return ctrlSelect;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.ctrlSelect
     *
     * @param ctrlSelect the value for `easyui_datagrid`.ctrlSelect
     */
    public void setCtrlSelect(String ctrlSelect) {
        this.ctrlSelect = ctrlSelect;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.checkOnSelect
     *
     * @return the value of `easyui_datagrid`.checkOnSelect
     */
    public String getCheckOnSelect() {
        return checkOnSelect;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.checkOnSelect
     *
     * @param checkOnSelect the value for `easyui_datagrid`.checkOnSelect
     */
    public void setCheckOnSelect(String checkOnSelect) {
        this.checkOnSelect = checkOnSelect;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.selectOnCheck
     *
     * @return the value of `easyui_datagrid`.selectOnCheck
     */
    public byte[] getSelectOnCheck() {
        return selectOnCheck;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.selectOnCheck
     *
     * @param selectOnCheck the value for `easyui_datagrid`.selectOnCheck
     */
    public void setSelectOnCheck(byte[] selectOnCheck) {
        this.selectOnCheck = selectOnCheck;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.pagePosition
     *
     * @return the value of `easyui_datagrid`.pagePosition
     */
    public String getPagePosition() {
        return pagePosition;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.pagePosition
     *
     * @param pagePosition the value for `easyui_datagrid`.pagePosition
     */
    public void setPagePosition(String pagePosition) {
        this.pagePosition = pagePosition;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.pageNumber
     *
     * @return the value of `easyui_datagrid`.pageNumber
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.pageNumber
     *
     * @param pageNumber the value for `easyui_datagrid`.pageNumber
     */
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.pageSize
     *
     * @return the value of `easyui_datagrid`.pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.pageSize
     *
     * @param pageSize the value for `easyui_datagrid`.pageSize
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.pageList
     *
     * @return the value of `easyui_datagrid`.pageList
     */
    public String getPageList() {
        return pageList;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.pageList
     *
     * @param pageList the value for `easyui_datagrid`.pageList
     */
    public void setPageList(String pageList) {
        this.pageList = pageList;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.sortName
     *
     * @return the value of `easyui_datagrid`.sortName
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.sortName
     *
     * @param sortName the value for `easyui_datagrid`.sortName
     */
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.sortOrder
     *
     * @return the value of `easyui_datagrid`.sortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.sortOrder
     *
     * @param sortOrder the value for `easyui_datagrid`.sortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.multiSort
     *
     * @return the value of `easyui_datagrid`.multiSort
     */
    public String getMultiSort() {
        return multiSort;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.multiSort
     *
     * @param multiSort the value for `easyui_datagrid`.multiSort
     */
    public void setMultiSort(String multiSort) {
        this.multiSort = multiSort;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.remoteSort
     *
     * @return the value of `easyui_datagrid`.remoteSort
     */
    public String getRemoteSort() {
        return remoteSort;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.remoteSort
     *
     * @param remoteSort the value for `easyui_datagrid`.remoteSort
     */
    public void setRemoteSort(String remoteSort) {
        this.remoteSort = remoteSort;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.scrollbarSize
     *
     * @return the value of `easyui_datagrid`.scrollbarSize
     */
    public String getScrollbarSize() {
        return scrollbarSize;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.scrollbarSize
     *
     * @param scrollbarSize the value for `easyui_datagrid`.scrollbarSize
     */
    public void setScrollbarSize(String scrollbarSize) {
        this.scrollbarSize = scrollbarSize;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.param
     *
     * @return the value of `easyui_datagrid`.param
     */
    public String getParam() {
        return param;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.param
     *
     * @param param the value for `easyui_datagrid`.param
     */
    public void setParam(String param) {
        this.param = param;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.sql
     *
     * @return the value of `easyui_datagrid`.sql
     */
    public String getSql() {
        return sql;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.sql
     *
     * @param sql the value for `easyui_datagrid`.sql
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * This method returns the value of the database column `easyui_datagrid`.multime
     *
     * @return the value of `easyui_datagrid`.multime
     */
    public String getMultime() {
        return multime;
    }

    /**
     * This method sets the value of the database column `easyui_datagrid`.multime
     *
     * @param multime the value for `easyui_datagrid`.multime
     */
    public void setMultime(String multime) {
        this.multime = multime;
    }
}