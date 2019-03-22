/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.datagrid;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `easyui_datagrid`
 */
public class EasyuiDatagrid extends EasyuiDatagridBase {
    private String fitColumns="true";

    private String width;

    private String height;

    private String title;

    private String pmenuName;

    private String menuName;

    private int total;

    private List<List <EasyuiColumn>> columns = new ArrayList<List<EasyuiColumn>>(5);

    private List<List <EasyuiColumn>> frozenColumns  = new ArrayList<List<EasyuiColumn>>(5);

    private String kind;

    private  List<Map<String, Object>> data;

    private List<Map<String,Object>> rows;
    //周报月报，年报
    private String timetype;

    private String othernum;

    private String reportKind="日报";

    private String timer;
    private String multime="0";

    private String starttime;

    private String endtime;
    private String option1;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private String option2;

    private String option3;

    private String option4;

    private String option5;

    private String otherOption;

    private String daynum;

    private String realtime;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRealtime() {
        return realtime;
    }

    public void setRealtime(String realtime) {
        this.realtime = realtime;
    }


    public String getFitColumns() {
        return fitColumns;
    }


    public void setFitColumns(String fitColumns) {
        this.fitColumns = fitColumns;
    }

    public String getDaynum() {
        return daynum;
    }

    public List<Map<String, Object>> getRows() {
        return rows;
    }

    public void setRows(List<Map<String, Object>> rows) {
        this.rows = rows;
    }

    public void setDaynum(String daynum) {
        this.daynum = daynum;
    }

    public String getOtherOption() {
        return otherOption;
    }

    public void setOtherOption(String otherOption) {
        this.otherOption = otherOption;
    }


    public String getMultime() {
        return multime;
    }


    public void setMultime(String multime) {
        this.multime = multime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getOption5() {
        return option5;
    }

    public void setOption5(String option5) {
        this.option5 = option5;
    }

    public String getReportKind() {
        return reportKind;
    }

    public void setReportKind(String reportKind) {
        this.reportKind = reportKind;
    }

    public String getTimetype() {
        return timetype;
    }

    public void setTimetype(String timetype) {
        this.timetype = timetype;
    }

    public String getOthernum() {
        return othernum;
    }

    public void setOthernum(String othernum) {
        this.othernum = othernum;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPmenuName() {
        return pmenuName;
    }

    public void setPmenuName(String pmenuName) {
        this.pmenuName = pmenuName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public List<List<EasyuiColumn>> getColumns() {
        return columns;
    }

    public void setColumns(List<List<EasyuiColumn>> columns) {
        this.columns = columns;
    }

    public List<List<EasyuiColumn>> getFrozenColumns() {
        return frozenColumns;
    }

    public void setFrozenColumns(List<List<EasyuiColumn>> frozenColumns) {
        this.frozenColumns = frozenColumns;
    }
}