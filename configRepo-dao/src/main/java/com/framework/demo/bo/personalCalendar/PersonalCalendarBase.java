/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.personalCalendar;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;
import java.util.Date;

/**
 * This class corresponds to the database table `personal_calendar`
 */
public abstract class PersonalCalendarBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `personal_calendar`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `personal_calendar`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `personal_calendar`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `personal_calendar`.user_id
     */
    private static final String PROPERTY_USERID = "userId";

    /**
     * This field corresponds to the database column `personal_calendar`.user_id
     */
    private static final String PROPERTY_REMARK_USERID = "";

    /**
     * This field corresponds to the database column `personal_calendar`.user_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_USERID)
    private Long userId;

    /**
     * This field corresponds to the database column `personal_calendar`.title
     */
    private static final String PROPERTY_TITLE = "title";

    /**
     * This field corresponds to the database column `personal_calendar`.title
     */
    private static final String PROPERTY_REMARK_TITLE = "";

    /**
     * This field corresponds to the database column `personal_calendar`.title
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TITLE)
    private String title;

    /**
     * This field corresponds to the database column `personal_calendar`.details
     */
    private static final String PROPERTY_DETAILS = "details";

    /**
     * This field corresponds to the database column `personal_calendar`.details
     */
    private static final String PROPERTY_REMARK_DETAILS = "";

    /**
     * This field corresponds to the database column `personal_calendar`.details
     */
    @ColumnDescription(desc = PROPERTY_REMARK_DETAILS)
    private String details;

    /**
     * This field corresponds to the database column `personal_calendar`.start_date
     */
    private static final String PROPERTY_STARTDATE = "startDate";

    /**
     * This field corresponds to the database column `personal_calendar`.start_date
     */
    private static final String PROPERTY_REMARK_STARTDATE = "";

    /**
     * This field corresponds to the database column `personal_calendar`.start_date
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STARTDATE)
    private Date startDate;

    /**
     * This field corresponds to the database column `personal_calendar`.length
     */
    private static final String PROPERTY_LENGTH = "length";

    /**
     * This field corresponds to the database column `personal_calendar`.length
     */
    private static final String PROPERTY_REMARK_LENGTH = "";

    /**
     * This field corresponds to the database column `personal_calendar`.length
     */
    @ColumnDescription(desc = PROPERTY_REMARK_LENGTH)
    private Integer length;

    /**
     * This field corresponds to the database column `personal_calendar`.start_time
     */
    private static final String PROPERTY_STARTTIME = "startTime";

    /**
     * This field corresponds to the database column `personal_calendar`.start_time
     */
    private static final String PROPERTY_REMARK_STARTTIME = "";

    /**
     * This field corresponds to the database column `personal_calendar`.start_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_STARTTIME)
    private Date startTime;

    /**
     * This field corresponds to the database column `personal_calendar`.end_time
     */
    private static final String PROPERTY_ENDTIME = "endTime";

    /**
     * This field corresponds to the database column `personal_calendar`.end_time
     */
    private static final String PROPERTY_REMARK_ENDTIME = "";

    /**
     * This field corresponds to the database column `personal_calendar`.end_time
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ENDTIME)
    private Date endTime;

    /**
     * This field corresponds to the database column `personal_calendar`.background_color
     */
    private static final String PROPERTY_BACKGROUNDCOLOR = "backgroundColor";

    /**
     * This field corresponds to the database column `personal_calendar`.background_color
     */
    private static final String PROPERTY_REMARK_BACKGROUNDCOLOR = "";

    /**
     * This field corresponds to the database column `personal_calendar`.background_color
     */
    @ColumnDescription(desc = PROPERTY_REMARK_BACKGROUNDCOLOR)
    private String backgroundColor;

    /**
     * This field corresponds to the database column `personal_calendar`.text_color
     */
    private static final String PROPERTY_TEXTCOLOR = "textColor";

    /**
     * This field corresponds to the database column `personal_calendar`.text_color
     */
    private static final String PROPERTY_REMARK_TEXTCOLOR = "";

    /**
     * This field corresponds to the database column `personal_calendar`.text_color
     */
    @ColumnDescription(desc = PROPERTY_REMARK_TEXTCOLOR)
    private String textColor;

    /**
     * This method returns the value of the database column `personal_calendar`.id
     *
     * @return the value of `personal_calendar`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.id
     *
     * @param id the value for `personal_calendar`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.user_id
     *
     * @return the value of `personal_calendar`.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.user_id
     *
     * @param userId the value for `personal_calendar`.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.title
     *
     * @return the value of `personal_calendar`.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.title
     *
     * @param title the value for `personal_calendar`.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.details
     *
     * @return the value of `personal_calendar`.details
     */
    public String getDetails() {
        return details;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.details
     *
     * @param details the value for `personal_calendar`.details
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.start_date
     *
     * @return the value of `personal_calendar`.start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.start_date
     *
     * @param startDate the value for `personal_calendar`.start_date
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.length
     *
     * @return the value of `personal_calendar`.length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.length
     *
     * @param length the value for `personal_calendar`.length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.start_time
     *
     * @return the value of `personal_calendar`.start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.start_time
     *
     * @param startTime the value for `personal_calendar`.start_time
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.end_time
     *
     * @return the value of `personal_calendar`.end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.end_time
     *
     * @param endTime the value for `personal_calendar`.end_time
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.background_color
     *
     * @return the value of `personal_calendar`.background_color
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.background_color
     *
     * @param backgroundColor the value for `personal_calendar`.background_color
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * This method returns the value of the database column `personal_calendar`.text_color
     *
     * @return the value of `personal_calendar`.text_color
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * This method sets the value of the database column `personal_calendar`.text_color
     *
     * @param textColor the value for `personal_calendar`.text_color
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}