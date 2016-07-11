/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.pageTemplate;

import com.framework.demo.dto.page.DataVelodity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `page_templete`
 */

@Component("pageTemplete")
public class PageTemplete extends PageTempleteBase {


    private String pmenuName;

    private String menuName;

    private DataVelodity dataVelodity;

    private String option1;

    private String option2;

    private String option3;

    private String option4;

    private String option5;

    private String iscollect;


    private String multime;

    private String starttime;

    private String endtime;

    private String yaxisNames;

    //获取时间控件的时间。
    private String timer;

    private String sqlyaxis;
    //条件维度
    private String othernum;

    //第一个是否上颜色
    private String iscolor1;

    //第二个table是否上颜色
    private String iscolor2;
    //第三个table是否配置颜色
    private String iscolor3;
    //第一个 -1颜色
    private String col1_cols_1;
    //第一个 -2颜色
    private String col1_cols_2;
    //第一个 -3颜色
    private String col1_cols_3;
    //第二个 -1颜色
    private String col2_cols_1;
    //第二个 -2颜色
    private String col2_cols_2;
    //第二个 -3颜色
    private String col2_cols_3;
    //第三个 -1颜色
    private String col3_cols_1;
    //第三个 -2颜色
    private String col3_cols_2;
    //第三个 -3颜色
    private String col3_cols_3;

    private String col1_data_1_from;

    private String col1_data_1_to;

    private String col1_data_2_from;

    private String col1_data_2_to;

    private String col1_data_3_from;

    private String col1_data_3_to;

    private String col2_data_1_from;

    private String col2_data_1_to;

    private String col2_data_2_to;

    private String col2_data_2_from;

    private String col2_data_3_to;

    private String col2_data_3_from;

    private String col3_data_1_from;

    private String col3_data_1_to;

    private String col3_data_2_from;

    private String col3_data_2_to;

    private String col3_data_3_from;

    private String col3_data_3_to;

    private String seriesMarkLine0;

    private String seriesMarkLine1;

    private String seriesMarkPoint0;

    private String seriesMarkPoint1;

    private String seriesListName0;

    private String seriesListName1;

    private List<Object> seriesList0 = new ArrayList<Object>();

    private List<Object> seriesList1 = new ArrayList<Object>();
    /**
     * jqgrid能显示到页面的字段信息
     */
    private String params ;

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }



    public String getSeriesListName0() {
        return seriesListName0;
    }
    public void setSeriesListName0(String seriesListName0) {
        this.seriesListName0 = seriesListName0;
    }

    public String getSeriesListName1() {
        return seriesListName1;
    }

    public void setSeriesListName1(String seriesListName1) {
        this.seriesListName1 = seriesListName1;
    }

    @Override
    public String getPmenuName() {
        return pmenuName;
    }

    @Override
    public void setPmenuName(String pmenuName) {
        this.pmenuName = pmenuName;
    }

    @Override
    public String getMenuName() {
        return menuName;
    }

    @Override
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


    public String getIscolor1() {
        return iscolor1;
    }

    public void setIscolor1(String iscolor1) {
        this.iscolor1 = iscolor1;
    }

    public String getIscolor2() {
        return iscolor2;
    }

    public void setIscolor2(String iscolor2) {
        this.iscolor2 = iscolor2;
    }

    public String getIscolor3() {
        return iscolor3;
    }

    public void setIscolor3(String iscolor3) {
        this.iscolor3 = iscolor3;
    }

    public String getCol1_cols_1() {
        return col1_cols_1;
    }

    public void setCol1_cols_1(String col1_cols_1) {
        this.col1_cols_1 = col1_cols_1;
    }

    public String getCol1_cols_2() {
        return col1_cols_2;
    }

    public void setCol1_cols_2(String col1_cols_2) {
        this.col1_cols_2 = col1_cols_2;
    }

    public String getCol1_cols_3() {
        return col1_cols_3;
    }

    public void setCol1_cols_3(String col1_cols_3) {
        this.col1_cols_3 = col1_cols_3;
    }

    public String getCol2_cols_1() {
        return col2_cols_1;
    }

    public void setCol2_cols_1(String col2_cols_1) {
        this.col2_cols_1 = col2_cols_1;
    }

    public String getCol2_cols_2() {
        return col2_cols_2;
    }

    public void setCol2_cols_2(String col2_cols_2) {
        this.col2_cols_2 = col2_cols_2;
    }

    public String getCol2_cols_3() {
        return col2_cols_3;
    }

    public void setCol2_cols_3(String col2_cols_3) {
        this.col2_cols_3 = col2_cols_3;
    }

    public String getCol3_cols_1() {
        return col3_cols_1;
    }

    public void setCol3_cols_1(String col3_cols_1) {
        this.col3_cols_1 = col3_cols_1;
    }

    public String getCol3_cols_2() {
        return col3_cols_2;
    }

    public void setCol3_cols_2(String col3_cols_2) {
        this.col3_cols_2 = col3_cols_2;
    }

    public String getCol3_cols_3() {
        return col3_cols_3;
    }

    public void setCol3_cols_3(String col3_cols_3) {
        this.col3_cols_3 = col3_cols_3;
    }

    public String getCol1_data_1_from() {
        return col1_data_1_from;
    }

    public void setCol1_data_1_from(String col1_data_1_from) {
        this.col1_data_1_from = col1_data_1_from;
    }

    public String getCol1_data_1_to() {
        return col1_data_1_to;
    }

    public void setCol1_data_1_to(String col1_data_1_to) {
        this.col1_data_1_to = col1_data_1_to;
    }

    public String getCol1_data_2_from() {
        return col1_data_2_from;
    }

    public void setCol1_data_2_from(String col1_data_2_from) {
        this.col1_data_2_from = col1_data_2_from;
    }

    public String getCol1_data_2_to() {
        return col1_data_2_to;
    }

    public void setCol1_data_2_to(String col1_data_2_to) {
        this.col1_data_2_to = col1_data_2_to;
    }

    public String getCol1_data_3_from() {
        return col1_data_3_from;
    }

    public void setCol1_data_3_from(String col1_data_3_from) {
        this.col1_data_3_from = col1_data_3_from;
    }

    public String getCol1_data_3_to() {
        return col1_data_3_to;
    }

    public void setCol1_data_3_to(String col1_data_3_to) {
        this.col1_data_3_to = col1_data_3_to;
    }

    public String getCol2_data_1_from() {
        return col2_data_1_from;
    }

    public void setCol2_data_1_from(String col2_data_1_from) {
        this.col2_data_1_from = col2_data_1_from;
    }

    public String getCol2_data_1_to() {
        return col2_data_1_to;
    }

    public void setCol2_data_1_to(String col2_data_1_to) {
        this.col2_data_1_to = col2_data_1_to;
    }

    public String getCol2_data_2_to() {
        return col2_data_2_to;
    }

    public void setCol2_data_2_to(String col2_data_2_to) {
        this.col2_data_2_to = col2_data_2_to;
    }

    public String getCol2_data_2_from() {
        return col2_data_2_from;
    }

    public void setCol2_data_2_from(String col2_data_2_from) {
        this.col2_data_2_from = col2_data_2_from;
    }

    public String getCol2_data_3_to() {
        return col2_data_3_to;
    }

    public void setCol2_data_3_to(String col2_data_3_to) {
        this.col2_data_3_to = col2_data_3_to;
    }

    public String getCol2_data_3_from() {
        return col2_data_3_from;
    }

    public void setCol2_data_3_from(String col2_data_3_from) {
        this.col2_data_3_from = col2_data_3_from;
    }

    public String getCol3_data_1_from() {
        return col3_data_1_from;
    }

    public void setCol3_data_1_from(String col3_data_1_from) {
        this.col3_data_1_from = col3_data_1_from;
    }

    public String getCol3_data_1_to() {
        return col3_data_1_to;
    }

    public void setCol3_data_1_to(String col3_data_1_to) {
        this.col3_data_1_to = col3_data_1_to;
    }

    public String getCol3_data_2_from() {
        return col3_data_2_from;
    }

    public void setCol3_data_2_from(String col3_data_2_from) {
        this.col3_data_2_from = col3_data_2_from;
    }

    public String getCol3_data_2_to() {
        return col3_data_2_to;
    }

    public void setCol3_data_2_to(String col3_data_2_to) {
        this.col3_data_2_to = col3_data_2_to;
    }

    public String getCol3_data_3_from() {
        return col3_data_3_from;
    }

    public void setCol3_data_3_from(String col3_data_3_from) {
        this.col3_data_3_from = col3_data_3_from;
    }

    public String getCol3_data_3_to() {
        return col3_data_3_to;
    }

    public void setCol3_data_3_to(String col3_data_3_to) {
        this.col3_data_3_to = col3_data_3_to;
    }


    public String getOthernum() {
        return othernum;
    }

    public void setOthernum(String othernum) {
        this.othernum = othernum;
    }

    public String getSeriesMarkLine0() {
        return seriesMarkLine0;
    }

    public void setSeriesMarkLine0(String seriesMarkLine0) {
        this.seriesMarkLine0 = seriesMarkLine0;
    }

    public String getSeriesMarkLine1() {
        return seriesMarkLine1;
    }

    public void setSeriesMarkLine1(String seriesMarkLine1) {
        this.seriesMarkLine1 = seriesMarkLine1;
    }

    public List<Object> getSeriesList1() {
        return seriesList1;
    }

    public void setSeriesList1(List<Object> seriesList1) {
        this.seriesList1 = seriesList1;
    }


    public List<Object> getSeriesList0() {
        return seriesList0;
    }

    public void setSeriesList0(List<Object> seriesList0) {
        this.seriesList0 = seriesList0;
    }


    public DataVelodity getDataVelodity() {
        return dataVelodity;
    }

    public void setDataVelodity(DataVelodity dataVelodity) {
        this.dataVelodity = dataVelodity;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
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

    public String getIscollect() {
        return iscollect;
    }

    public void setIscollect(String iscollect) {
        this.iscollect = iscollect;
    }

    @Override
    public String getMultime() {
        return multime;
    }

    @Override
    public void setMultime(String multime) {
        this.multime = multime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }


    public String getSqlyaxis() {
        return sqlyaxis;
    }

    public void setSqlyaxis(String sqlyaxis) {
        this.sqlyaxis = sqlyaxis;
    }


    public List<Map<String, Object>> getMapDatas() {
        return mapDatas;
    }

    public void setMapDatas(List<Map<String, Object>> mapDatas) {
        this.mapDatas = mapDatas;
    }

    private List<Map<String, Object>> mapDatas;

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }


    @Override
    public String getYaxisNames() {
        return yaxisNames;
    }

    @Override
    public void setYaxisNames(String yaxisNames) {
        this.yaxisNames = yaxisNames;
    }

    public String getSeriesMarkPoint0() {
        return seriesMarkPoint0;
    }

    public void setSeriesMarkPoint0(String seriesMarkPoint0) {
        this.seriesMarkPoint0 = seriesMarkPoint0;
    }

    public String getSeriesMarkPoint1() {
        return seriesMarkPoint1;
    }

    public void setSeriesMarkPoint1(String seriesMarkPoint1) {
        this.seriesMarkPoint1 = seriesMarkPoint1;
    }

    public static void main(String[] args) {
        String sql = "selllfdaskfjsaljfkdasf{pt}";
        if (sql.indexOf("{pt}") != -1) {
            sql = StringUtils.replace(sql, "{pt}", "111");

        }
        System.out.print(sql);
    }
}