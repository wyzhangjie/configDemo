/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.data.bo.dimTime;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class corresponds to the database table `dim_time`
 */
public abstract class DimTimeBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `dim_time`.DT
     */
    private static final String PROPERTY_DT = "DT";

    /**
     * This field corresponds to the database column `dim_time`.DT
     */
    private static final String PROPERTY_REMARK_DT = "日期";

    /**
     * This field corresponds to the database column `dim_time`.DT
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DT)
    @Id
    private Date DT;

    /**
     * This field corresponds to the database column `dim_time`.WEEK
     */
    private static final String PROPERTY_WEEK = "WEEK";

    /**
     * This field corresponds to the database column `dim_time`.WEEK
     */
    private static final String PROPERTY_REMARK_WEEK = "周几";

    /**
     * This field corresponds to the database column `dim_time`.WEEK
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEEK)
    private Integer WEEK;

    /**
     * This field corresponds to the database column `dim_time`.WEEK_CNT
     */
    private static final String PROPERTY_WEEKCNT = "WEEKCNT";

    /**
     * This field corresponds to the database column `dim_time`.WEEK_CNT
     */
    private static final String PROPERTY_REMARK_WEEKCNT = "当年第几周";

    /**
     * This field corresponds to the database column `dim_time`.WEEK_CNT
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEEKCNT)
    private Integer WEEKCNT;

    /**
     * This field corresponds to the database column `dim_time`.DTM
     */
    private static final String PROPERTY_DTM = "DTM";

    /**
     * This field corresponds to the database column `dim_time`.DTM
     */
    private static final String PROPERTY_REMARK_DTM = "当月第一天";

    /**
     * This field corresponds to the database column `dim_time`.DTM
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DTM)
    private Date DTM;

    /**
     * This field corresponds to the database column `dim_time`.QUARTER
     */
    private static final String PROPERTY_QUARTER = "QUARTER";

    /**
     * This field corresponds to the database column `dim_time`.QUARTER
     */
    private static final String PROPERTY_REMARK_QUARTER = "当年第几季度";

    /**
     * This field corresponds to the database column `dim_time`.QUARTER
     */
    @ColumnDescription(desc = PROPERTY_REMARK_QUARTER)
    private Integer QUARTER;

    /**
     * This field corresponds to the database column `dim_time`.WEEK_DAY
     */
    private static final String PROPERTY_WEEKDAY = "WEEKDAY";

    /**
     * This field corresponds to the database column `dim_time`.WEEK_DAY
     */
    private static final String PROPERTY_REMARK_WEEKDAY = "当周第一天";

    /**
     * This field corresponds to the database column `dim_time`.WEEK_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEEKDAY)
    private Date WEEKDAY;

    /**
     * This field corresponds to the database column `dim_time`.WEEK_END
     */
    private static final String PROPERTY_WEEKEND = "WEEKEND";

    /**
     * This field corresponds to the database column `dim_time`.WEEK_END
     */
    private static final String PROPERTY_REMARK_WEEKEND = "当周最后一天";

    /**
     * This field corresponds to the database column `dim_time`.WEEK_END
     */
    @ColumnDescription(desc = PROPERTY_REMARK_WEEKEND)
    private Date WEEKEND;

    /**
     * This field corresponds to the database column `dim_time`.LAST_WEEK_DAY
     */
    private static final String PROPERTY_LASTWEEKDAY = "LASTWEEKDAY";

    /**
     * This field corresponds to the database column `dim_time`.LAST_WEEK_DAY
     */
    private static final String PROPERTY_REMARK_LASTWEEKDAY = "上周第一天";

    /**
     * This field corresponds to the database column `dim_time`.LAST_WEEK_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTWEEKDAY)
    private Date LASTWEEKDAY;

    /**
     * This field corresponds to the database column `dim_time`.LAST_WEEK_END
     */
    private static final String PROPERTY_LASTWEEKEND = "LASTWEEKEND";

    /**
     * This field corresponds to the database column `dim_time`.LAST_WEEK_END
     */
    private static final String PROPERTY_REMARK_LASTWEEKEND = "上周最后一天";

    /**
     * This field corresponds to the database column `dim_time`.LAST_WEEK_END
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTWEEKEND)
    private Date LASTWEEKEND;

    /**
     * This field corresponds to the database column `dim_time`.MONTH_DAY
     */
    private static final String PROPERTY_MONTHDAY = "MONTHDAY";

    /**
     * This field corresponds to the database column `dim_time`.MONTH_DAY
     */
    private static final String PROPERTY_REMARK_MONTHDAY = "当月第一天";

    /**
     * This field corresponds to the database column `dim_time`.MONTH_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MONTHDAY)
    private Date MONTHDAY;

    /**
     * This field corresponds to the database column `dim_time`.MONTH_LASTDAY
     */
    private static final String PROPERTY_MONTHLASTDAY = "MONTHLASTDAY";

    /**
     * This field corresponds to the database column `dim_time`.MONTH_LASTDAY
     */
    private static final String PROPERTY_REMARK_MONTHLASTDAY = "当月最后一天";

    /**
     * This field corresponds to the database column `dim_time`.MONTH_LASTDAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MONTHLASTDAY)
    private Date MONTHLASTDAY;

    /**
     * This field corresponds to the database column `dim_time`.LAST_MONTH_DAY
     */
    private static final String PROPERTY_LASTMONTHDAY = "LASTMONTHDAY";

    /**
     * This field corresponds to the database column `dim_time`.LAST_MONTH_DAY
     */
    private static final String PROPERTY_REMARK_LASTMONTHDAY = "上月第一天";

    /**
     * This field corresponds to the database column `dim_time`.LAST_MONTH_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTMONTHDAY)
    private Date LASTMONTHDAY;

    /**
     * This field corresponds to the database column `dim_time`.LAST_MONTH_LAST_DAY
     */
    private static final String PROPERTY_LASTMONTHLASTDAY = "LASTMONTHLASTDAY";

    /**
     * This field corresponds to the database column `dim_time`.LAST_MONTH_LAST_DAY
     */
    private static final String PROPERTY_REMARK_LASTMONTHLASTDAY = "上月最后一天";

    /**
     * This field corresponds to the database column `dim_time`.LAST_MONTH_LAST_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTMONTHLASTDAY)
    private Date LASTMONTHLASTDAY;

    /**
     * This field corresponds to the database column `dim_time`.LAST_DAY
     */
    private static final String PROPERTY_LASTDAY = "LASTDAY";

    /**
     * This field corresponds to the database column `dim_time`.LAST_DAY
     */
    private static final String PROPERTY_REMARK_LASTDAY = "";

    /**
     * This field corresponds to the database column `dim_time`.LAST_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LASTDAY)
    private Date LASTDAY;

    /**
     * This field corresponds to the database column `dim_time`.tomorrow
     */
    private static final String PROPERTY_TOMORROW = "tomorrow";

    /**
     * This field corresponds to the database column `dim_time`.tomorrow
     */
    private static final String PROPERTY_REMARK_TOMORROW = "";

    /**
     * This field corresponds to the database column `dim_time`.tomorrow
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TOMORROW)
    private Date tomorrow;

    /**
     * This field corresponds to the database column `dim_time`.YEAR_FIRST_DAY
     */
    private static final String PROPERTY_YEARFIRSTDAY = "YEARFIRSTDAY";

    /**
     * This field corresponds to the database column `dim_time`.YEAR_FIRST_DAY
     */
    private static final String PROPERTY_REMARK_YEARFIRSTDAY = "";

    /**
     * This field corresponds to the database column `dim_time`.YEAR_FIRST_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_YEARFIRSTDAY)
    private Date YEARFIRSTDAY;

    /**
     * This field corresponds to the database column `dim_time`.YEAR_END_DAY
     */
    private static final String PROPERTY_YEARENDDAY = "YEARENDDAY";

    /**
     * This field corresponds to the database column `dim_time`.YEAR_END_DAY
     */
    private static final String PROPERTY_REMARK_YEARENDDAY = "";

    /**
     * This field corresponds to the database column `dim_time`.YEAR_END_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_YEARENDDAY)
    private Date YEARENDDAY;

    /**
     * This field corresponds to the database column `dim_time`.QUARTER_FIRST_DAY
     */
    private static final String PROPERTY_QUARTERFIRSTDAY = "QUARTERFIRSTDAY";

    /**
     * This field corresponds to the database column `dim_time`.QUARTER_FIRST_DAY
     */
    private static final String PROPERTY_REMARK_QUARTERFIRSTDAY = "";

    /**
     * This field corresponds to the database column `dim_time`.QUARTER_FIRST_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_QUARTERFIRSTDAY)
    private Date QUARTERFIRSTDAY;

    /**
     * This field corresponds to the database column `dim_time`.QUARTER_END_DAY
     */
    private static final String PROPERTY_QUARTERENDDAY = "QUARTERENDDAY";

    /**
     * This field corresponds to the database column `dim_time`.QUARTER_END_DAY
     */
    private static final String PROPERTY_REMARK_QUARTERENDDAY = "";

    /**
     * This field corresponds to the database column `dim_time`.QUARTER_END_DAY
     */
    @ColumnDescription(desc = PROPERTY_REMARK_QUARTERENDDAY)
    private Date QUARTERENDDAY;

    /**
     * This method returns the value of the database column `dim_time`.DT
     *
     * @return the value of `dim_time`.DT
     */
    public Date getDT() {
        return DT;
    }

    /**
     * This method sets the value of the database column `dim_time`.DT
     *
     * @param DT the value for `dim_time`.DT
     */
    public void setDT(Date DT) {
        this.DT = DT;
    }

    /**
     * This method returns the value of the database column `dim_time`.WEEK
     *
     * @return the value of `dim_time`.WEEK
     */
    public Integer getWEEK() {
        return WEEK;
    }

    /**
     * This method sets the value of the database column `dim_time`.WEEK
     *
     * @param WEEK the value for `dim_time`.WEEK
     */
    public void setWEEK(Integer WEEK) {
        this.WEEK = WEEK;
    }

    /**
     * This method returns the value of the database column `dim_time`.WEEK_CNT
     *
     * @return the value of `dim_time`.WEEK_CNT
     */
    public Integer getWEEKCNT() {
        return WEEKCNT;
    }

    /**
     * This method sets the value of the database column `dim_time`.WEEK_CNT
     *
     * @param WEEKCNT the value for `dim_time`.WEEK_CNT
     */
    public void setWEEKCNT(Integer WEEKCNT) {
        this.WEEKCNT = WEEKCNT;
    }

    /**
     * This method returns the value of the database column `dim_time`.DTM
     *
     * @return the value of `dim_time`.DTM
     */
    public Date getDTM() {
        return DTM;
    }

    /**
     * This method sets the value of the database column `dim_time`.DTM
     *
     * @param DTM the value for `dim_time`.DTM
     */
    public void setDTM(Date DTM) {
        this.DTM = DTM;
    }

    /**
     * This method returns the value of the database column `dim_time`.QUARTER
     *
     * @return the value of `dim_time`.QUARTER
     */
    public Integer getQUARTER() {
        return QUARTER;
    }

    /**
     * This method sets the value of the database column `dim_time`.QUARTER
     *
     * @param QUARTER the value for `dim_time`.QUARTER
     */
    public void setQUARTER(Integer QUARTER) {
        this.QUARTER = QUARTER;
    }

    /**
     * This method returns the value of the database column `dim_time`.WEEK_DAY
     *
     * @return the value of `dim_time`.WEEK_DAY
     */
    public Date getWEEKDAY() {
        return WEEKDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.WEEK_DAY
     *
     * @param WEEKDAY the value for `dim_time`.WEEK_DAY
     */
    public void setWEEKDAY(Date WEEKDAY) {
        this.WEEKDAY = WEEKDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.WEEK_END
     *
     * @return the value of `dim_time`.WEEK_END
     */
    public Date getWEEKEND() {
        return WEEKEND;
    }

    /**
     * This method sets the value of the database column `dim_time`.WEEK_END
     *
     * @param WEEKEND the value for `dim_time`.WEEK_END
     */
    public void setWEEKEND(Date WEEKEND) {
        this.WEEKEND = WEEKEND;
    }

    /**
     * This method returns the value of the database column `dim_time`.LAST_WEEK_DAY
     *
     * @return the value of `dim_time`.LAST_WEEK_DAY
     */
    public Date getLASTWEEKDAY() {
        return LASTWEEKDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.LAST_WEEK_DAY
     *
     * @param LASTWEEKDAY the value for `dim_time`.LAST_WEEK_DAY
     */
    public void setLASTWEEKDAY(Date LASTWEEKDAY) {
        this.LASTWEEKDAY = LASTWEEKDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.LAST_WEEK_END
     *
     * @return the value of `dim_time`.LAST_WEEK_END
     */
    public Date getLASTWEEKEND() {
        return LASTWEEKEND;
    }

    /**
     * This method sets the value of the database column `dim_time`.LAST_WEEK_END
     *
     * @param LASTWEEKEND the value for `dim_time`.LAST_WEEK_END
     */
    public void setLASTWEEKEND(Date LASTWEEKEND) {
        this.LASTWEEKEND = LASTWEEKEND;
    }

    /**
     * This method returns the value of the database column `dim_time`.MONTH_DAY
     *
     * @return the value of `dim_time`.MONTH_DAY
     */
    public Date getMONTHDAY() {
        return MONTHDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.MONTH_DAY
     *
     * @param MONTHDAY the value for `dim_time`.MONTH_DAY
     */
    public void setMONTHDAY(Date MONTHDAY) {
        this.MONTHDAY = MONTHDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.MONTH_LASTDAY
     *
     * @return the value of `dim_time`.MONTH_LASTDAY
     */
    public Date getMONTHLASTDAY() {
        return MONTHLASTDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.MONTH_LASTDAY
     *
     * @param MONTHLASTDAY the value for `dim_time`.MONTH_LASTDAY
     */
    public void setMONTHLASTDAY(Date MONTHLASTDAY) {
        this.MONTHLASTDAY = MONTHLASTDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.LAST_MONTH_DAY
     *
     * @return the value of `dim_time`.LAST_MONTH_DAY
     */
    public Date getLASTMONTHDAY() {
        return LASTMONTHDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.LAST_MONTH_DAY
     *
     * @param LASTMONTHDAY the value for `dim_time`.LAST_MONTH_DAY
     */
    public void setLASTMONTHDAY(Date LASTMONTHDAY) {
        this.LASTMONTHDAY = LASTMONTHDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.LAST_MONTH_LAST_DAY
     *
     * @return the value of `dim_time`.LAST_MONTH_LAST_DAY
     */
    public Date getLASTMONTHLASTDAY() {
        return LASTMONTHLASTDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.LAST_MONTH_LAST_DAY
     *
     * @param LASTMONTHLASTDAY the value for `dim_time`.LAST_MONTH_LAST_DAY
     */
    public void setLASTMONTHLASTDAY(Date LASTMONTHLASTDAY) {
        this.LASTMONTHLASTDAY = LASTMONTHLASTDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.LAST_DAY
     *
     * @return the value of `dim_time`.LAST_DAY
     */
    public Date getLASTDAY() {
        return LASTDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.LAST_DAY
     *
     * @param LASTDAY the value for `dim_time`.LAST_DAY
     */
    public void setLASTDAY(Date LASTDAY) {
        this.LASTDAY = LASTDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.tomorrow
     *
     * @return the value of `dim_time`.tomorrow
     */
    public Date getTomorrow() {
        return tomorrow;
    }

    /**
     * This method sets the value of the database column `dim_time`.tomorrow
     *
     * @param tomorrow the value for `dim_time`.tomorrow
     */
    public void setTomorrow(Date tomorrow) {
        this.tomorrow = tomorrow;
    }

    /**
     * This method returns the value of the database column `dim_time`.YEAR_FIRST_DAY
     *
     * @return the value of `dim_time`.YEAR_FIRST_DAY
     */
    public Date getYEARFIRSTDAY() {
        return YEARFIRSTDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.YEAR_FIRST_DAY
     *
     * @param YEARFIRSTDAY the value for `dim_time`.YEAR_FIRST_DAY
     */
    public void setYEARFIRSTDAY(Date YEARFIRSTDAY) {
        this.YEARFIRSTDAY = YEARFIRSTDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.YEAR_END_DAY
     *
     * @return the value of `dim_time`.YEAR_END_DAY
     */
    public Date getYEARENDDAY() {
        return YEARENDDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.YEAR_END_DAY
     *
     * @param YEARENDDAY the value for `dim_time`.YEAR_END_DAY
     */
    public void setYEARENDDAY(Date YEARENDDAY) {
        this.YEARENDDAY = YEARENDDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.QUARTER_FIRST_DAY
     *
     * @return the value of `dim_time`.QUARTER_FIRST_DAY
     */
    public Date getQUARTERFIRSTDAY() {
        return QUARTERFIRSTDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.QUARTER_FIRST_DAY
     *
     * @param QUARTERFIRSTDAY the value for `dim_time`.QUARTER_FIRST_DAY
     */
    public void setQUARTERFIRSTDAY(Date QUARTERFIRSTDAY) {
        this.QUARTERFIRSTDAY = QUARTERFIRSTDAY;
    }

    /**
     * This method returns the value of the database column `dim_time`.QUARTER_END_DAY
     *
     * @return the value of `dim_time`.QUARTER_END_DAY
     */
    public Date getQUARTERENDDAY() {
        return QUARTERENDDAY;
    }

    /**
     * This method sets the value of the database column `dim_time`.QUARTER_END_DAY
     *
     * @param QUARTERENDDAY the value for `dim_time`.QUARTER_END_DAY
     */
    public void setQUARTERENDDAY(Date QUARTERENDDAY) {
        this.QUARTERENDDAY = QUARTERENDDAY;
    }
}