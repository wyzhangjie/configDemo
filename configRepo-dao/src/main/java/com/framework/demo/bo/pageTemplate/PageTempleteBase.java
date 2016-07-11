/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.pageTemplate;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.TableField;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `page_templete`
 */
public abstract class PageTempleteBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `page_templete`.Id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `page_templete`.Id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `page_templete`.Id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `page_templete`.model
     */
    private static final String PROPERTY_MODEL = "model";

    /**
     * This field corresponds to the database column `page_templete`.model
     */
    private static final String PROPERTY_REMARK_MODEL = "模板对应的model";

    /**
     * This field corresponds to the database column `page_templete`.model
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MODEL)
    private Integer model;

    /**
     * This field corresponds to the database column `page_templete`.timersql
     */
    private static final String PROPERTY_TIMERSQL = "timersql";

    /**
     * This field corresponds to the database column `page_templete`.timersql
     */
    private static final String PROPERTY_REMARK_TIMERSQL = "页面要查询的sql 包含时间参数";

    /**
     * This field corresponds to the database column `page_templete`.timersql
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TIMERSQL)
    private String timersql;

    /**
     * This field corresponds to the database column `page_templete`.legend
     */
    private static final String PROPERTY_LEGEND = "legend";

    /**
     * This field corresponds to the database column `page_templete`.legend
     */
    private static final String PROPERTY_REMARK_LEGEND = "图例";

    /**
     * This field corresponds to the database column `page_templete`.legend
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LEGEND)
    private String legend;

    /**
     * This field corresponds to the database column `page_templete`.stack
     */
    private static final String PROPERTY_STACK = "stack";

    /**
     * This field corresponds to the database column `page_templete`.stack
     */
    private static final String PROPERTY_REMARK_STACK = "是否合并";

    /**
     * This field corresponds to the database column `page_templete`.stack
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STACK)
    private String stack;

    /**
     * This field corresponds to the database column `page_templete`.kind
     */
    private static final String PROPERTY_KIND = "kind";

    /**
     * This field corresponds to the database column `page_templete`.kind
     */
    private static final String PROPERTY_REMARK_KIND = "图形种类";

    /**
     * This field corresponds to the database column `page_templete`.kind
     */
    @ColumnDescription(desc = PROPERTY_REMARK_KIND)
    private String kind;

    /**
     * This field corresponds to the database column `page_templete`.catalog
     */
    private static final String PROPERTY_CATALOG = "catalog";

    /**
     * This field corresponds to the database column `page_templete`.catalog
     */
    private static final String PROPERTY_REMARK_CATALOG = "横坐标字段名称";

    /**
     * This field corresponds to the database column `page_templete`.catalog
     */
    @ColumnDescription(desc = PROPERTY_REMARK_CATALOG)
    private String catalog;

    /**
     * This field corresponds to the database column `page_templete`.file_name
     */
    private static final String PROPERTY_FILENAME = "fileName";

    /**
     * This field corresponds to the database column `page_templete`.file_name
     */
    private static final String PROPERTY_REMARK_FILENAME = "文件的名称";

    /**
     * This field corresponds to the database column `page_templete`.file_name
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FILENAME)
    private String fileName;

    /**
     * This field corresponds to the database column `page_templete`.filePath
     */
    private static final String PROPERTY_FILEPATH = "filePath";

    /**
     * This field corresponds to the database column `page_templete`.filePath
     */
    private static final String PROPERTY_REMARK_FILEPATH = "jsp文件存储的文件夹";

    /**
     * This field corresponds to the database column `page_templete`.filePath
     */
    @ColumnDescription(desc = PROPERTY_REMARK_FILEPATH)
    private String filePath;

    /**
     * This field corresponds to the database column `page_templete`.title
     */
    private static final String PROPERTY_TITLE = "title";

    /**
     * This field corresponds to the database column `page_templete`.title
     */
    private static final String PROPERTY_REMARK_TITLE = "页面主标题和图形主标题";

    /**
     * This field corresponds to the database column `page_templete`.title
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TITLE)
    private String title;

    /**
     * This field corresponds to the database column `page_templete`.subtitle
     */
    private static final String PROPERTY_SUBTITLE = "subtitle";

    /**
     * This field corresponds to the database column `page_templete`.subtitle
     */
    private static final String PROPERTY_REMARK_SUBTITLE = "图形的副标题";

    /**
     * This field corresponds to the database column `page_templete`.subtitle
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SUBTITLE)
    private String subtitle;

    /**
     * This field corresponds to the database column `page_templete`.pmenuName
     */
    private static final String PROPERTY_PMENUNAME = "pmenuName";

    /**
     * This field corresponds to the database column `page_templete`.pmenuName
     */
    private static final String PROPERTY_REMARK_PMENUNAME = "母菜单的中文名字";

    /**
     * This field corresponds to the database column `page_templete`.pmenuName
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PMENUNAME)
    private String pmenuName;

    /**
     * This field corresponds to the database column `page_templete`.menuName
     */
    private static final String PROPERTY_MENUNAME = "menuName";

    /**
     * This field corresponds to the database column `page_templete`.menuName
     */
    private static final String PROPERTY_REMARK_MENUNAME = "插入的新菜单中文名字";

    /**
     * This field corresponds to the database column `page_templete`.menuName
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MENUNAME)
    private String menuName;

    /**
     * This field corresponds to the database column `page_templete`.comitment
     */
    private static final String PROPERTY_COMITMENT = "comitment";

    /**
     * This field corresponds to the database column `page_templete`.comitment
     */
    private static final String PROPERTY_REMARK_COMITMENT = "";

    /**
     * This field corresponds to the database column `page_templete`.comitment
     */
    @ColumnDescription(desc = PROPERTY_REMARK_COMITMENT)
    private String comitment;

    /**
     * This field corresponds to the database column `page_templete`.report_kind
     */
    private static final String PROPERTY_REPORTKIND = "reportKind";

    /**
     * This field corresponds to the database column `page_templete`.report_kind
     */
    private static final String PROPERTY_REMARK_REPORTKIND = "报表类型";

    /**
     * This field corresponds to the database column `page_templete`.report_kind
     */
    @ColumnDescription(desc = PROPERTY_REMARK_REPORTKIND)
    private String reportKind;

    /**
     * This field corresponds to the database column `page_templete`.sql_yaxis
     */
    private static final String PROPERTY_SQLYAXIS = "sqlYaxis";

    /**
     * This field corresponds to the database column `page_templete`.sql_yaxis
     */
    private static final String PROPERTY_REMARK_SQLYAXIS = "sql语句和yaxis对应关系0-1标示第一个sql对应第右坐标轴";

    /**
     * This field corresponds to the database column `page_templete`.sql_yaxis
     */
    @ColumnDescription(desc = PROPERTY_REMARK_SQLYAXIS)
    private String sqlYaxis;

    /**
     * This field corresponds to the database column `page_templete`.yaxisNames
     */
    private static final String PROPERTY_YAXISNAMES = "yaxisNames";

    /**
     * This field corresponds to the database column `page_templete`.yaxisNames
     */
    private static final String PROPERTY_REMARK_YAXISNAMES = "";

    /**
     * This field corresponds to the database column `page_templete`.yaxisNames
     */
    @ColumnDescription(desc = PROPERTY_REMARK_YAXISNAMES)
    private String yaxisNames;

    /**
     * This field corresponds to the database column `page_templete`.other_option
     */
    private static final String PROPERTY_OTHEROPTION = "otherOption";

    /**
     * This field corresponds to the database column `page_templete`.other_option
     */
    private static final String PROPERTY_REMARK_OTHEROPTION = "";

    /**
     * This field corresponds to the database column `page_templete`.other_option
     */
    @ColumnDescription(desc = PROPERTY_REMARK_OTHEROPTION)
    private String otherOption;

    /**
     * This field corresponds to the database column `page_templete`.realtime
     */
    private static final String PROPERTY_REALTIME = "realtime";

    /**
     * This field corresponds to the database column `page_templete`.realtime
     */
    private static final String PROPERTY_REMARK_REALTIME = "01：在数据库查数据，00：在缓存查数据";

    /**
     * This field corresponds to the database column `page_templete`.realtime
     */
    @ColumnDescription(desc = PROPERTY_REMARK_REALTIME)
    private String realtime;

    /**
     * This field corresponds to the database column `page_templete`.timetype
     */
    private static final String PROPERTY_TIMETYPE = "timetype";

    /**
     * This field corresponds to the database column `page_templete`.timetype
     */
    private static final String PROPERTY_REMARK_TIMETYPE = "0：显示前一个时间段时间 1：显示当前时间段时间";

    /**
     * This field corresponds to the database column `page_templete`.timetype
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TIMETYPE)
    private String timetype;

    /**
     * This field corresponds to the database column `page_templete`.isColor
     */
    private static final String PROPERTY_ISCOLOR = "isColor";

    /**
     * This field corresponds to the database column `page_templete`.isColor
     */
    private static final String PROPERTY_REMARK_ISCOLOR = "";

    /**
     * This field corresponds to the database column `page_templete`.isColor
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISCOLOR)
    private String isColor;

    /**
     * This field corresponds to the database column `page_templete`.multime
     */
    private static final String PROPERTY_MULTIME = "multime";

    /**
     * This field corresponds to the database column `page_templete`.multime
     */
    private static final String PROPERTY_REMARK_MULTIME = "多维度时间配置：0:单个时间显示,1:开始结束时间段";

    /**
     * This field corresponds to the database column `page_templete`.multime
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MULTIME)
    private String multime;

    /**
     * This field corresponds to the database column `page_templete`.daynum
     */
    private static final String PROPERTY_DAYNUM = "daynum";

    /**
     * This field corresponds to the database column `page_templete`.daynum
     */
    private static final String PROPERTY_REMARK_DAYNUM = "点击menu时显示报表的天数";

    /**
     * This field corresponds to the database column `page_templete`.daynum
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DAYNUM)
    private String daynum;

    /**
     * This field corresponds to the database column `page_templete`.ispercent
     */
    private static final String PROPERTY_ISPERCENT = "ispercent";

    /**
     * This field corresponds to the database column `page_templete`.ispercent
     */
    private static final String PROPERTY_REMARK_ISPERCENT = "00:数据不包含百分号,11:数据包含百分号，01：双轴报表左侧不包含百分号，右侧包含百分号，10：双轴报表左侧包含百分号，右侧包含百分号";

    /**
     * This field corresponds to the database column `page_templete`.ispercent
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ISPERCENT)
    private String ispercent;

    /**
     * This field corresponds to the database column `page_templete`.leftLegendNum
     */
    private static final String PROPERTY_LEFTLEGENDNUM = "leftLegendNum";

    /**
     * This field corresponds to the database column `page_templete`.leftLegendNum
     */
    private static final String PROPERTY_REMARK_LEFTLEGENDNUM = "双轴报表左侧图例数量";

    /**
     * This field corresponds to the database column `page_templete`.leftLegendNum
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LEFTLEGENDNUM)
    private String leftLegendNum;

    /**
     * This field corresponds to the database column `page_templete`.average
     */
    private static final String PROPERTY_AVERAGE = "average";

    /**
     * This field corresponds to the database column `page_templete`.average
     */
    private static final String PROPERTY_REMARK_AVERAGE = "00：不配置平均值，11：配置平均值,01:双轴左侧无平均值右侧有平均值，10：双轴左侧有平均值右侧无平均值";

    /**
     * This field corresponds to the database column `page_templete`.average
     */
    @ColumnDescription(desc = PROPERTY_REMARK_AVERAGE)
    private String average;

    /**
     * This field corresponds to the database column `page_templete`.maxandmin
     */
    private static final String PROPERTY_MAXANDMIN = "maxandmin";

    /**
     * This field corresponds to the database column `page_templete`.maxandmin
     */
    private static final String PROPERTY_REMARK_MAXANDMIN = "00：不配置最大值和最小值，11：配置最大值和最小值，01：双轴左侧无最值右侧有最值，10：双轴左侧有最值右侧无最值";

    /**
     * This field corresponds to the database column `page_templete`.maxandmin
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MAXANDMIN)
    private String maxandmin;

    /**
     * This method returns the value of the database column `page_templete`.Id
     *
     * @return the value of `page_templete`.Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `page_templete`.Id
     *
     * @param id the value for `page_templete`.Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `page_templete`.model
     *
     * @return the value of `page_templete`.model
     */
    public Integer getModel() {
        return model;
    }

    /**
     * This method sets the value of the database column `page_templete`.model
     *
     * @param model the value for `page_templete`.model
     */
    public void setModel(Integer model) {
        this.model = model;
    }

    /**
     * This method returns the value of the database column `page_templete`.timersql
     *
     * @return the value of `page_templete`.timersql
     */
    public String getTimersql() {
        return timersql;
    }

    /**
     * This method sets the value of the database column `page_templete`.timersql
     *
     * @param timersql the value for `page_templete`.timersql
     */
    public void setTimersql(String timersql) {
        this.timersql = timersql;
    }

    /**
     * This method returns the value of the database column `page_templete`.legend
     *
     * @return the value of `page_templete`.legend
     */
    public String getLegend() {
        return legend;
    }

    /**
     * This method sets the value of the database column `page_templete`.legend
     *
     * @param legend the value for `page_templete`.legend
     */
    public void setLegend(String legend) {
        this.legend = legend;
    }

    /**
     * This method returns the value of the database column `page_templete`.stack
     *
     * @return the value of `page_templete`.stack
     */
    public String getStack() {
        return stack;
    }

    /**
     * This method sets the value of the database column `page_templete`.stack
     *
     * @param stack the value for `page_templete`.stack
     */
    public void setStack(String stack) {
        this.stack = stack;
    }

    /**
     * This method returns the value of the database column `page_templete`.kind
     *
     * @return the value of `page_templete`.kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * This method sets the value of the database column `page_templete`.kind
     *
     * @param kind the value for `page_templete`.kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * This method returns the value of the database column `page_templete`.catalog
     *
     * @return the value of `page_templete`.catalog
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * This method sets the value of the database column `page_templete`.catalog
     *
     * @param catalog the value for `page_templete`.catalog
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * This method returns the value of the database column `page_templete`.file_name
     *
     * @return the value of `page_templete`.file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method sets the value of the database column `page_templete`.file_name
     *
     * @param fileName the value for `page_templete`.file_name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method returns the value of the database column `page_templete`.filePath
     *
     * @return the value of `page_templete`.filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method sets the value of the database column `page_templete`.filePath
     *
     * @param filePath the value for `page_templete`.filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * This method returns the value of the database column `page_templete`.title
     *
     * @return the value of `page_templete`.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method sets the value of the database column `page_templete`.title
     *
     * @param title the value for `page_templete`.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column `page_templete`.subtitle
     *
     * @return the value of `page_templete`.subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method sets the value of the database column `page_templete`.subtitle
     *
     * @param subtitle the value for `page_templete`.subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * This method returns the value of the database column `page_templete`.pmenuName
     *
     * @return the value of `page_templete`.pmenuName
     */
    public String getPmenuName() {
        return pmenuName;
    }

    /**
     * This method sets the value of the database column `page_templete`.pmenuName
     *
     * @param pmenuName the value for `page_templete`.pmenuName
     */
    public void setPmenuName(String pmenuName) {
        this.pmenuName = pmenuName;
    }

    /**
     * This method returns the value of the database column `page_templete`.menuName
     *
     * @return the value of `page_templete`.menuName
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method sets the value of the database column `page_templete`.menuName
     *
     * @param menuName the value for `page_templete`.menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * This method returns the value of the database column `page_templete`.comitment
     *
     * @return the value of `page_templete`.comitment
     */
    public String getComitment() {
        return comitment;
    }

    /**
     * This method sets the value of the database column `page_templete`.comitment
     *
     * @param comitment the value for `page_templete`.comitment
     */
    public void setComitment(String comitment) {
        this.comitment = comitment;
    }

    /**
     * This method returns the value of the database column `page_templete`.report_kind
     *
     * @return the value of `page_templete`.report_kind
     */
    public String getReportKind() {
        return reportKind;
    }

    /**
     * This method sets the value of the database column `page_templete`.report_kind
     *
     * @param reportKind the value for `page_templete`.report_kind
     */
    public void setReportKind(String reportKind) {
        this.reportKind = reportKind;
    }

    /**
     * This method returns the value of the database column `page_templete`.sql_yaxis
     *
     * @return the value of `page_templete`.sql_yaxis
     */
    public String getSqlYaxis() {
        return sqlYaxis;
    }

    /**
     * This method sets the value of the database column `page_templete`.sql_yaxis
     *
     * @param sqlYaxis the value for `page_templete`.sql_yaxis
     */
    public void setSqlYaxis(String sqlYaxis) {
        this.sqlYaxis = sqlYaxis;
    }

    /**
     * This method returns the value of the database column `page_templete`.yaxisNames
     *
     * @return the value of `page_templete`.yaxisNames
     */
    public String getYaxisNames() {
        return yaxisNames;
    }

    /**
     * This method sets the value of the database column `page_templete`.yaxisNames
     *
     * @param yaxisNames the value for `page_templete`.yaxisNames
     */
    public void setYaxisNames(String yaxisNames) {
        this.yaxisNames = yaxisNames;
    }

    /**
     * This method returns the value of the database column `page_templete`.other_option
     *
     * @return the value of `page_templete`.other_option
     */
    public String getOtherOption() {
        return otherOption;
    }

    /**
     * This method sets the value of the database column `page_templete`.other_option
     *
     * @param otherOption the value for `page_templete`.other_option
     */
    public void setOtherOption(String otherOption) {
        this.otherOption = otherOption;
    }

    /**
     * This method returns the value of the database column `page_templete`.realtime
     *
     * @return the value of `page_templete`.realtime
     */
    public String getRealtime() {
        return realtime;
    }

    /**
     * This method sets the value of the database column `page_templete`.realtime
     *
     * @param realtime the value for `page_templete`.realtime
     */
    public void setRealtime(String realtime) {
        this.realtime = realtime;
    }

    /**
     * This method returns the value of the database column `page_templete`.timetype
     *
     * @return the value of `page_templete`.timetype
     */
    public String getTimetype() {
        return timetype;
    }

    /**
     * This method sets the value of the database column `page_templete`.timetype
     *
     * @param timetype the value for `page_templete`.timetype
     */
    public void setTimetype(String timetype) {
        this.timetype = timetype;
    }

    /**
     * This method returns the value of the database column `page_templete`.isColor
     *
     * @return the value of `page_templete`.isColor
     */
    public String getIsColor() {
        return isColor;
    }

    /**
     * This method sets the value of the database column `page_templete`.isColor
     *
     * @param isColor the value for `page_templete`.isColor
     */
    public void setIsColor(String isColor) {
        this.isColor = isColor;
    }

    /**
     * This method returns the value of the database column `page_templete`.multime
     *
     * @return the value of `page_templete`.multime
     */
    public String getMultime() {
        return multime;
    }

    /**
     * This method sets the value of the database column `page_templete`.multime
     *
     * @param multime the value for `page_templete`.multime
     */
    public void setMultime(String multime) {
        this.multime = multime;
    }

    /**
     * This method returns the value of the database column `page_templete`.daynum
     *
     * @return the value of `page_templete`.daynum
     */
    public String getDaynum() {
        return daynum;
    }

    /**
     * This method sets the value of the database column `page_templete`.daynum
     *
     * @param daynum the value for `page_templete`.daynum
     */
    public void setDaynum(String daynum) {
        this.daynum = daynum;
    }

    /**
     * This method returns the value of the database column `page_templete`.ispercent
     *
     * @return the value of `page_templete`.ispercent
     */
    public String getIspercent() {
        return ispercent;
    }

    /**
     * This method sets the value of the database column `page_templete`.ispercent
     *
     * @param ispercent the value for `page_templete`.ispercent
     */
    public void setIspercent(String ispercent) {
        this.ispercent = ispercent;
    }

    /**
     * This method returns the value of the database column `page_templete`.leftLegendNum
     *
     * @return the value of `page_templete`.leftLegendNum
     */
    public String getLeftLegendNum() {
        return leftLegendNum;
    }

    /**
     * This method sets the value of the database column `page_templete`.leftLegendNum
     *
     * @param leftLegendNum the value for `page_templete`.leftLegendNum
     */
    public void setLeftLegendNum(String leftLegendNum) {
        this.leftLegendNum = leftLegendNum;
    }

    /**
     * This method returns the value of the database column `page_templete`.average
     *
     * @return the value of `page_templete`.average
     */
    public String getAverage() {
        return average;
    }

    /**
     * This method sets the value of the database column `page_templete`.average
     *
     * @param average the value for `page_templete`.average
     */
    public void setAverage(String average) {
        this.average = average;
    }

    /**
     * This method returns the value of the database column `page_templete`.maxandmin
     *
     * @return the value of `page_templete`.maxandmin
     */
    public String getMaxandmin() {
        return maxandmin;
    }

    /**
     * This method sets the value of the database column `page_templete`.maxandmin
     *
     * @param maxandmin the value for `page_templete`.maxandmin
     */
    public void setMaxandmin(String maxandmin) {
        this.maxandmin = maxandmin;
    }

    /**
     * This method corresponds to the database table `page_templete`
     */

}