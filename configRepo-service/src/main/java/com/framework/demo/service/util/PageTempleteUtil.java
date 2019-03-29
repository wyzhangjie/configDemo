package com.framework.demo.service.util;

import com.framework.demo.bo.datagrid.EasyuiDatagrid;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.constant.Constant;
import com.framework.demo.dto.echarts.DataTN;
import com.framework.demo.dto.echarts.OutputParams;
import com.framework.demo.dto.jqgrid.ColModel;
import com.framework.demo.dto.jqgrid.JdData;
import com.framework.demo.dto.jqgrid.JqGridConfigInfo;
import com.framework.demo.dto.jqgrid.JqGridRow;
import com.framework.demo.dto.page.DataVelodity;
import com.framework.demo.dto.template.DataTemplate;
import com.framework.demo.dto.template.TemplateFactory;
import com.framework.demo.enm.PageEnum;
import com.framework.demo.enm.TemplateEnum;
import com.framework.demo.service.pageTemplate.PageTempleteService;
import com.framework.demo.service.sysColor.SysTemplColrService;
import com.framework.demo.vo.template.EasyUiDatagridPage;
import com.framework.demo.vo.template.SqlPage;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.github.fartherp.framework.database.mybatis.plugin.page.PageRequest;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;

import javax.servlet.http.HttpServletRequest;

import java.util.*;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/5/25 0025
 * To change this template use File | Settings | File Templates.
 */
@Component("pageTempleteUtil")
public class PageTempleteUtil {

    @Autowired
    private PageTempleteService pageTempleteService;
    @Autowired
    private TemplateFactory templateFactory;

    @Autowired
    private DataVelodity dataVelodity;

    private static String delim = "&";

    @Autowired
    SysTemplColrService sysTemplColrService;

    public String fillTime(PageTemplete pageTemplate) throws Exception {


        final String multime = pageTemplate.getMultime();
        String timer = null;
        String sql = null;
        String starttime = null;
        String endtime = null;
        if (StringUtils.isBlank(multime) || "null".equalsIgnoreCase(multime) || multime.equalsIgnoreCase("0")) {
            //根据报表类型配置时间 1、按天 按周都是2015-09-01  按月、按季度：2015-09 按年：2015　

            if (StringUtils.isBlank(pageTemplate.getTimetype()) || "null".equalsIgnoreCase(pageTemplate.getTimetype()) || pageTemplate.getTimetype().equalsIgnoreCase("0")) {
                timer = TimerUtil.processTimeForMenu(pageTemplate.getReportKind(), pageTemplate);
            } else if (pageTemplate.getTimetype().equalsIgnoreCase("1")) {
                timer = TimerUtil.processTimeForMenuForNow(pageTemplate.getReportKind(), pageTemplate);
            }
            //时间处理下放置到前台
            if (pageTemplate.getReportKind().equalsIgnoreCase("周报") || pageTemplate.getReportKind().equalsIgnoreCase("季报")) {
                String faceTimer = TimerUtil.FaceTimerFromMenu(timer, pageTemplate.getReportKind());
                pageTemplate.setTimer(faceTimer);
            } else {
                pageTemplate.setTimer(timer);
            }

            String timersql = pageTemplate.getTimersql();
            sql = StringUtils.replace(timersql, "{pt}", "\"" + timer + "\"");
        } else if (multime.equalsIgnoreCase("1")) {

            if (StringUtils.isBlank(pageTemplate.getTimetype()) || "null".equalsIgnoreCase(pageTemplate.getTimetype()) || pageTemplate.getTimetype().equalsIgnoreCase("0")) {
                   /* timer = TimerUtil.processTimeForMenu(pageTemplate.getReportKind(), pageTemplate);*/
                endtime = TimerUtil.processMulEndTimeForMenu(pageTemplate.getReportKind(), pageTemplate);
                starttime = TimerUtil.processMulStartTimeForMenu(pageTemplate.getDaynum(), endtime);
            } else if (pageTemplate.getTimetype().equalsIgnoreCase("1")) {
                    /*timer =TimerUtil.processTimeForMenuForNow(pageTemplate.getReportKind(), pageTemplate);*/
                endtime = TimerUtil.processMulEndTimeForMenuNow(pageTemplate.getReportKind(), pageTemplate);
                starttime = TimerUtil.processMulStartTimeForMenu(pageTemplate.getDaynum(), endtime);
            }
            pageTemplate.setStarttime(starttime);
            pageTemplate.setEndtime(endtime);
            pageTemplate.setTimer(endtime);
            String timersql = pageTemplate.getTimersql();
            sql = StringUtils.replace(timersql, "{start}", "\"" + starttime + "\"");
            sql = StringUtils.replace(sql, "{end}", "\"" + endtime + "\"");
        }

        if (!StringUtils.isEmpty(pageTemplate.getOtherOption()) && !pageTemplate.getOtherOption().equalsIgnoreCase("null")) {
            sql = getStringForMenu(sql, pageTemplate);
        }
        return sql;
    }
    public void fillDatagrid(EasyuiDatagrid easyuiDatagrid, String sql) throws Exception {

        List t = getPageList(easyuiDatagrid);
        SqlPage sqlPage = getSqlPage(easyuiDatagrid);
        fillEasyuiDatagrid(easyuiDatagrid, sql, t, sqlPage);
    }

    private void fillEasyuiDatagrid(EasyuiDatagrid easyuiDatagrid, String sql, List t, SqlPage sqlPage) throws Exception {
        PageTemplete pageTemplete= new PageTemplete();
        BeanUtils.copyProperties(easyuiDatagrid, pageTemplete);
        //获取数据
        List<Map<String, Object>> mapDatas = getEasyUidataMap(pageTemplete, sql, sqlPage);
        /*关键代码，将数据传送到前台*/
        easyuiDatagrid.setData(mapDatas);
        easyuiDatagrid.setRows(mapDatas);
        easyuiDatagrid.setTotal(sqlPage.getTotal());
        /*end*/
        Pagination pagination = getPagination(t, sqlPage);
        easyuiDatagrid.setPagination(JSON.toJSONString(pagination));
    }

    private SqlPage getSqlPage(EasyuiDatagrid easyuiDatagrid) {
        SqlPage sqlPage = new SqlPage();
        sqlPage.setCurrentPage(1);
        sqlPage.setRow(Integer.parseInt(easyuiDatagrid.getPageSize()));
        return sqlPage;
    }

    private List getPageList(EasyuiDatagrid easyuiDatagrid) {
        String[] pages =easyuiDatagrid.getPageList().split(",");
        List t= Arrays.asList(pages);
        easyuiDatagrid.setPageList(JSON.toJSONString(t));
        return t;
    }

    private Pagination getPagination(List t, SqlPage sqlPage) {
        Pagination pagination = new PageRequest(sqlPage.getPage(),sqlPage.getLimit());
        pagination.setRows(t);
        pagination.setTotal(sqlPage.getLimit());
        pagination.setCurrentPage(sqlPage.getCurrentPage());
        pagination.setLimit(sqlPage.getRow());
        return pagination;
    }

    public String fillTimeForEasyUi(EasyuiDatagrid easyuiDatagrid,EasyUiDatagridPage easyUiDatagridPage) throws Exception {
        if(easyUiDatagridPage.getTimer()!=null||easyUiDatagridPage.getStarttime()!=null||easyUiDatagridPage.getEndtime()!=null){
            PageTemplete pageTemplate = new PageTemplete();
            BeanUtils.copyProperties(easyUiDatagridPage, pageTemplate);
            pageTemplate.setTimersql(easyuiDatagrid.getSql());
            replaceTimer(pageTemplate);
            String sql = pageTemplate.getTimersql();
            return sql;
        }
        PageTemplete pageTemplate = new PageTemplete();
        BeanUtils.copyProperties(easyuiDatagrid,pageTemplate);
        final String multime = easyuiDatagrid.getMultime();
        String timer = null;
        String sql = null;
        String starttime = null;
        String endtime = null;
        if (StringUtils.isBlank(multime) || "null".equalsIgnoreCase(multime) || multime.equalsIgnoreCase("0")) {
            //根据报表类型配置时间 1、按天 按周都是2015-09-01  按月、按季度：2015-09 按年：2015　

            if (StringUtils.isBlank(easyuiDatagrid.getTimetype()) || "null".equalsIgnoreCase(easyuiDatagrid.getTimetype()) || easyuiDatagrid.getTimetype().equalsIgnoreCase("0")) {
                timer = TimerUtil.processTimeForMenu(easyuiDatagrid.getReportKind(), pageTemplate);
            } else if (easyuiDatagrid.getTimetype().equalsIgnoreCase("1")) {
                timer = TimerUtil.processTimeForMenuForNow(easyuiDatagrid.getReportKind(), pageTemplate);
            }
            //时间处理下放置到前台
            if (easyuiDatagrid.getReportKind().equalsIgnoreCase("周报") || easyuiDatagrid.getReportKind().equalsIgnoreCase("季报")) {
                String faceTimer = TimerUtil.FaceTimerFromMenu(timer, easyuiDatagrid.getReportKind());
                easyuiDatagrid.setTimer(faceTimer);
            } else {
                easyuiDatagrid.setTimer(timer);
            }

            String timersql = easyuiDatagrid.getSql();
            sql = StringUtils.replace(timersql, "{pt}", "\"" + timer + "\"");
        } else if (multime.equalsIgnoreCase("1")) {

            if (StringUtils.isBlank(easyuiDatagrid.getTimetype()) || "null".equalsIgnoreCase(easyuiDatagrid.getTimetype()) || easyuiDatagrid.getTimetype().equalsIgnoreCase("0")) {
                   /* timer = TimerUtil.processTimeForMenu(easyuiDatagrid.getReportKind(), easyuiDatagrid);*/

                endtime = TimerUtil.processMulEndTimeForMenu(easyuiDatagrid.getReportKind(), pageTemplate);
                starttime = TimerUtil.processMulStartTimeForMenu(easyuiDatagrid.getDaynum(), endtime);
            } else if (easyuiDatagrid.getTimetype().equalsIgnoreCase("1")) {
                    /*timer =TimerUtil.processTimeForMenuForNow(easyuiDatagrid.getReportKind(), easyuiDatagrid);*/
                endtime = TimerUtil.processMulEndTimeForMenuNow(easyuiDatagrid.getReportKind(), pageTemplate);
                starttime = TimerUtil.processMulStartTimeForMenu(easyuiDatagrid.getDaynum(), endtime);
            }
            easyuiDatagrid.setStarttime(starttime);
            easyuiDatagrid.setEndtime(endtime);
            easyuiDatagrid.setTimer(endtime);
            String timersql = easyuiDatagrid.getSql();
            sql = StringUtils.replace(timersql, "{start}", "\"" + starttime + "\"");
            sql = StringUtils.replace(sql, "{end}", "\"" + endtime + "\"");
        }

        if (!StringUtils.isEmpty(easyuiDatagrid.getOtherOption()) && !easyuiDatagrid.getOtherOption().equalsIgnoreCase("null")) {
            sql = getStringForMenu(sql, pageTemplate);
        }
        return sql;
    }

    public String getStringForMenu(String sql, PageTemplete pageTemplate) {
        String[] subOption = pageTemplate.getOtherOption().split(Constant.delim);
        if (subOption.length != 0) {
            for (int i = 0; i < subOption.length; i++) {
                String subtmp = subOption[i].replaceAll(", name", "");
                sql = StringUtils.replace(sql, "{" + (i + 1) + "}", "(" + subtmp + ")");
            }
        }
        return sql;
    }

    public List<Map<String, Object>> getMapDatas(PageTemplete pageTemplate, String sql, SqlPage sqlPage) throws Exception {
        List<Map<String, Object>> mapDatas = new ArrayList<Map<String, Object>>();
        //todo 在缓存查还是在数据库中查
        String real_time = pageTemplate.getRealtime();

        if (sql.indexOf("|") != -1) {
            String[] sqls = sql.toString().split("\\|");

            for (int i = 0; i < sqls.length; i++) {
                sqlPage.setSql(sqls[i]);
                mapDatas.addAll(pageTempleteService.findPageSql(sqlPage));
            }
        } else {
            sqlPage.setSql(sql);
            mapDatas = pageTempleteService.findPageSql(sqlPage);
        }
        return mapDatas;
    }

    public List<Map<String, Object>> getEchartsDataMap(PageTemplete pageTemplate, String sql) throws Exception {
        List<Map<String, Object>> mapDatas = new ArrayList<Map<String, Object>>();
        //todo 在缓存查还是在数据库中查
        String real_time = pageTemplate.getRealtime();

        if (sql.indexOf("|") != -1) {
            String[] sqls = sql.toString().split("\\|");

            for (int i = 0; i < sqls.length; i++) {
                mapDatas.addAll(pageTempleteService.getData(sql));
            }
        } else {
            mapDatas = pageTempleteService.getData(sql);
        }
        return mapDatas;
    }
    public List<Map<String, Object>> getEasyUidataMap(PageTemplete pageTemplate, String sql,SqlPage sqlPage) throws Exception {
        List<Map<String, Object>> mapDatas = new ArrayList<Map<String, Object>>();
        //todo 在缓存查还是在数据库中查
        String real_time = pageTemplate.getRealtime();
        sqlPage.setSql(sql);
        if (sql.indexOf("|") != -1) {
            String[] sqls = sql.toString().split("\\|");

            for (int i = 0; i < sqls.length; i++) {
                mapDatas.addAll(pageTempleteService.findPageSql(sqlPage));
            }
        } else {
            mapDatas = pageTempleteService.findPageSql(sqlPage);
        }
        return mapDatas;
    }

    public DataVelodity findTemplate(String kind, OutputParams outputParams) throws Exception {

        TemplateEnum[] templateEnums = TemplateEnum.values();
        for (TemplateEnum templateEnum : templateEnums) {
            if (kind.equalsIgnoreCase(templateEnum.getCode())) {
                DataTemplate dataTemplate = templateFactory.createTemplate(templateEnum.gettClass());
                dataVelodity = dataTemplate.fillTemplate(outputParams);
            }
        }
        return dataVelodity;

    }

    public OutputParams fullFillOutputParams(PageTemplete pageTemplate, List<Map<String, Object>> mapDatas) throws Exception {
        OutputParams outputParams = new OutputParams();
        String[] legend = pageTemplate.getLegend().toString().split(",");
        if (pageTemplate.getKind().contains("ylines")) {
            String[] sqlyaxis = fillsqlyaxis(pageTemplate.getSqlyaxis());
            outputParams.setSqlYaxis(sqlyaxis);
        }
        //储备数据
        String[] toCategory = {pageTemplate.getCatalog()};
        Map<String, String> toParams = new HashMap<String, String>();
        if (mapDatas.isEmpty()) {
            for (int i = 0; i < legend.length; i++) {
                toParams.put(legend[i], legend[i]);
            }
        } else {
            for (String key : mapDatas.get(0).keySet()) {
                toParams.put(key, key);
            }
        }
        outputParams.setCategory(toCategory);
        outputParams.setParams(toParams);
        outputParams.setData(mapDatas);
        outputParams.setKind(pageTemplate.getKind());
        outputParams.setLegend(legend);
        outputParams.setLvalue(toCategory);
        outputParams.setStack(pageTemplate.getStack());
        //百分号
        outputParams.setIspercent(pageTemplate.getIspercent());
        //最大值和最小值
        outputParams.setMaxandmin(pageTemplate.getMaxandmin());
        //平均值
        outputParams.setAverage(pageTemplate.getAverage());
        //左侧图例数量
        outputParams.setLeftLegendNum(pageTemplate.getLeftLegendNum());
        return outputParams;
    }

    public String[] fillsqlyaxis(String sqlyaxis) {
        String[] s = new String[20];
        if (sqlyaxis == null) {
            return null;
        } else {
            String[] tmp = sqlyaxis.split(",");

            for (int i = 0; i < tmp.length; i++) {
                s[i] = tmp[i].split("-")[1];
            }

        }
        return s;
    }

    public void findForThermometer(PageTemplete pageTemplete) {
        String isMaxAndMin = pageTemplete.getMaxandmin();
        if (isMaxAndMin.equalsIgnoreCase("11")) {
            List<Object> data = new ArrayList<Object>();
            DataTN maxDataTN = new DataTN();
            maxDataTN.setType("max");
            maxDataTN.setName("最大值");
            DataTN minDataTN = new DataTN();
            minDataTN.setType("min");
            minDataTN.setName("最小值");
            data.add(maxDataTN);
            data.add(minDataTN);
            pageTemplete.setSeriesMarkPoint0(data.toString());
        }
        if (isMaxAndMin.equalsIgnoreCase("11")) {
            List<Object> data = new ArrayList<Object>();
            DataTN maxDataTN = new DataTN();
            maxDataTN.setType("max");
            maxDataTN.setName("最大值");
            DataTN minDataTN = new DataTN();
            minDataTN.setType("min");
            minDataTN.setName("最小值");
            data.add(maxDataTN);
            data.add(minDataTN);
            pageTemplete.setSeriesMarkPoint1(data.toString());
        }
        String isAverage = pageTemplete.getAverage();
        if (isAverage.equalsIgnoreCase("11")) {
            DataTN dataTN = new DataTN();
            dataTN.setType("average");
            dataTN.setName("平均值");
            List<Object> data = new ArrayList<Object>();
            data.add(dataTN);
            pageTemplete.setSeriesMarkLine0(data.toString());
        }
        if (isAverage.equalsIgnoreCase("11")) {
            DataTN dataTN = new DataTN();
            dataTN.setType("average");
            dataTN.setName("平均值");
            List<Object> data = new ArrayList<Object>();
            data.add(dataTN);
            pageTemplete.setSeriesMarkLine1(data.toString());
        }
    }

    public void toOption(PageTemplete pageTemplete, HttpServletRequest request) {
        Integer optionNum = Integer.parseInt(pageTemplete.getOthernum());
        StringBuilder sb = new StringBuilder();
        if (optionNum == 0) {
            return;
        } else {
            for (int j = 1; j <= optionNum; j++) {
                sb.append(request.getParameter("sql" + j)).append(delim);
            }
            String options = StringUtils.replace(sb.toString(), "'", "\"");
            pageTemplete.setOtherOption(options.substring(0, options.length() - 1));
        }
    }


    public String findPath(String kind, String multi, String id) {
        //如果kind为
        PageEnum[] pageEnums = PageEnum.values();
        for (PageEnum pageEnum : pageEnums) {
            if (pageEnum.getCode().equalsIgnoreCase(kind) && pageEnum.getMultime().equalsIgnoreCase(multi)) {
                return pageEnum.getPath() + "?modl=" + id;
            }
        }
        return PageEnum.ERROR.getPath();
    }

    public void replaceTimer(PageTemplete pageTemplete) {
        String sql = pageTemplete.getTimersql();
        if (sql.indexOf("{pt}") != -1) {
            sql = org.apache.commons.lang3.StringUtils.replace(sql, "{pt}", "\"" + pageTemplete.getTimer() + "\"");
        }
        if (sql.indexOf("{option1}") != -1) {
            sql = org.apache.commons.lang3.StringUtils.replace(sql, "{option1}", "\"" + pageTemplete.getOption1() + "\"");

        }
        if (sql.indexOf("{option2}") != -1) {
            sql = org.apache.commons.lang3.StringUtils.replace(sql, "{option2}", "\"" + pageTemplete.getOption2() + "\"");

        }
        if (sql.indexOf("{option3}") != -1) {
            sql = org.apache.commons.lang3.StringUtils.replace(sql, "{option3}", "\"" + pageTemplete.getOption3() + "\"");
        }
        if (sql.indexOf("{option4}") != -1) {
            sql = org.apache.commons.lang3.StringUtils.replace(sql, "{option4}", "\"" + pageTemplete.getOption4() + "\"");

        }
        if (sql.indexOf("{option5}") != -1) {
            sql = org.apache.commons.lang3.StringUtils.replace(sql, "{option5}", "\"" + pageTemplete.getOption5() + "\"");
        }

        pageTemplete.setTimersql(sql);

    }


    public void jqGridHandler(JqGridConfigInfo jqGridConfigInfo, PageTemplete pageTemplete) {
        pageTemplete.setTimersql(jqGridConfigInfo.getDatasql1() + "|" + jqGridConfigInfo.getDatasql2() + "|" + jqGridConfigInfo.getDatasql3());
        pageTemplete.setTitle(jqGridConfigInfo.getTitle1() + ", " + jqGridConfigInfo.getTitle2() + ", " + jqGridConfigInfo.getTitle3());
        pageTemplete.setComitment(jqGridConfigInfo.getComitmentareaDs1() + "|" + jqGridConfigInfo.getComitmentareaDs2() + "|" + jqGridConfigInfo.getComitmentareaDs3());
        pageTemplete.setIsColor(jqGridConfigInfo.getIscolor1() + " |" + jqGridConfigInfo.getIscolor2() + " | " + jqGridConfigInfo.getIscolor3());
        pageTemplete.setParams(jqGridConfigInfo.getParam1() + " | " + jqGridConfigInfo.getParam2() + " | " + jqGridConfigInfo.getParam3());
        pageTemplete.setOtherOption(jqGridConfigInfo.getSql1() + " & " + jqGridConfigInfo.getSql2() + " & " + jqGridConfigInfo.getSql3() + "&" + jqGridConfigInfo.getSql4() + "&" + jqGridConfigInfo.getSql5());
        //有些字段特殊处理下
        if ("null".equalsIgnoreCase(jqGridConfigInfo.getDaynum()) || jqGridConfigInfo.getDaynum() == null) {
            pageTemplete.setDaynum("0");
        }
        if (jqGridConfigInfo.getMultime() == null) {
            pageTemplete.setMultime("0");
        }


    }

    public void jqGridColorHandler(SysTemplColr sysTemplColr, PageTemplete pageTemplete) {
        String color1 = pageTemplete.getCol1_cols_1() + " | " + pageTemplete.getCol2_cols_1() + " | " + pageTemplete.getCol3_cols_1();
        String color2 = pageTemplete.getCol1_cols_2() + " | " + pageTemplete.getCol2_cols_2() + " | " + pageTemplete.getCol3_cols_2();
        String color3 = pageTemplete.getCol1_cols_3() + " | " + pageTemplete.getCol2_cols_3() + " | " + pageTemplete.getCol3_cols_3();
        String data1_1 = pageTemplete.getCol1_data_1_from() + " | " + pageTemplete.getCol1_data_1_to();
        String data1_2 = pageTemplete.getCol1_data_2_from() + " | " + pageTemplete.getCol1_data_2_to();
        String data1_3 = pageTemplete.getCol1_data_3_from() + " | " + pageTemplete.getCol1_data_3_to();
        String data2_2 = pageTemplete.getCol2_data_2_from() + " | " + pageTemplete.getCol2_data_2_to();
        String data2_1 = pageTemplete.getCol2_data_1_from() + " | " + pageTemplete.getCol2_data_2_to();
        String data2_3 = pageTemplete.getCol2_data_3_from() + " | " + pageTemplete.getCol2_data_3_to();
        String data3_1 = pageTemplete.getCol3_data_1_from() + " | " + pageTemplete.getCol3_data_1_to();
        String data3_2 = pageTemplete.getCol3_data_2_from() + " | " + pageTemplete.getCol3_data_2_to();
        String data3_3 = pageTemplete.getCol3_data_3_from() + " | " + pageTemplete.getCol3_data_3_to();
        String condition1 = data1_1 + " ^ " + data2_1 + " ^ " + data3_1;
        String condition2 = data1_2 + " ^ " + data2_2 + " ^ " + data3_2;
        String condition3 = data1_3 + " ^ " + data2_3 + " ^ " + data3_3;
        sysTemplColr.setColor1Id(color1);
        sysTemplColr.setColor2Id(color2);
        sysTemplColr.setColor3Id(color3);
        sysTemplColr.setCondition1(condition1);
        sysTemplColr.setCondition2(condition2);
        sysTemplColr.setCondition3(condition3);
    }

    public void jqGridResolver(JqGridConfigInfo jqGridConfigInfo, PageTemplete pageTemplete) {
        SysTemplColr sysTemplColr = sysTemplColrService.findByModl(pageTemplete.getModel());
        //params |
        //
        String[] params = pageTemplete.getParams().split("\\|");
        jqGridConfigInfo.setParam1(params[0]);
        jqGridConfigInfo.setParam2(params[1]);
        jqGridConfigInfo.setParam3(params[2]);
        String[] comits = pageTemplete.getComitment().split("\\|");
        jqGridConfigInfo.setComitmentareaDs1(comits[0]);
        jqGridConfigInfo.setComitmentareaDs2(comits[1]);
        jqGridConfigInfo.setComitmentareaDs3(comits[2]);
        String[] iscolors = pageTemplete.getIsColor().split("\\|");
        jqGridConfigInfo.setIscolor1(iscolors[0]);
        jqGridConfigInfo.setIscolor2(iscolors[1]);
        jqGridConfigInfo.setIscolor3(iscolors[2]);
        String[] titles = pageTemplete.getTitle().split(",");
        jqGridConfigInfo.setTitle1(titles[0]);
        jqGridConfigInfo.setTitle2(titles[1]);
        jqGridConfigInfo.setTitle3(titles[2]);
        String[] color1 = sysTemplColr.getColor1Id().split("\\|");
        String[] color2 = sysTemplColr.getColor2Id().split("\\|");
        String[] color3 = sysTemplColr.getColor3Id().split("\\|");

        jqGridConfigInfo.setCol1_cols_1(color1[0]);
        jqGridConfigInfo.setCol2_cols_1(color1[1]);
        jqGridConfigInfo.setCol3_cols_1(color1[2]);

        jqGridConfigInfo.setCol1_cols_2(color2[0]);
        jqGridConfigInfo.setCol2_cols_2(color2[1]);
        jqGridConfigInfo.setCol3_cols_2(color2[2]);

        jqGridConfigInfo.setCol1_cols_3(color3[0]);
        jqGridConfigInfo.setCol2_cols_3(color3[1]);
        jqGridConfigInfo.setCol3_cols_3(color3[2]);

        String[] data1 = sysTemplColr.getCondition1().split("\\^");
        String[] data2 = sysTemplColr.getCondition2().split("\\^");
        String[] data3 = sysTemplColr.getCondition3().split("\\^");

        String data1_1from = data1[0].split("\\|")[0];
        String data1_1to = data1[0].split("\\|")[1];
        String data1_2from = data2[0].split("\\|")[0];
        String data1_2to = data2[0].split("\\|")[1];
        String data1_3from = data3[0].split("\\|")[0];
        String data1_3to = data3[0].split("\\|")[1];
        jqGridConfigInfo.setCol1_data_1_from(data1_1from);
        jqGridConfigInfo.setCol1_data_1_to(data1_1to);
        jqGridConfigInfo.setCol1_data_2_from(data1_2from);
        jqGridConfigInfo.setCol1_data_2_to(data1_2to);
        jqGridConfigInfo.setCol1_data_3_from(data1_3from);
        jqGridConfigInfo.setCol1_data_3_to(data1_3to);


        String data2_1from = data1[1].split("\\|")[0];
        String data2_1to = data1[1].split("\\|")[1];
        String data2_2from = data2[1].split("\\|")[0];
        String data2_2to = data2[1].split("\\|")[1];
        String data2_3from = data3[1].split("\\|")[0];
        String data2_3to = data3[1].split("\\|")[1];

        jqGridConfigInfo.setCol2_data_1_from(data2_1from);
        jqGridConfigInfo.setCol2_data_1_to(data2_1to);
        jqGridConfigInfo.setCol2_data_2_from(data2_2from);
        jqGridConfigInfo.setCol2_data_2_to(data2_2to);
        jqGridConfigInfo.setCol2_data_3_from(data2_3from);
        jqGridConfigInfo.setCol2_data_3_to(data2_3to);

        String data3_1from = data1[2].split("\\|")[0];
        String data3_1to = data1[2].split("\\|")[1];
        String data3_2from = data2[2].split("\\|")[0];
        String data3_2to = data2[2].split("\\|")[1];
        String data3_3from = data3[2].split("\\|")[0];
        String data3_3to = data3[2].split("\\|")[1];

        jqGridConfigInfo.setCol3_data_1_from(data3_1from);
        jqGridConfigInfo.setCol3_data_1_to(data3_1to);
        jqGridConfigInfo.setCol3_data_2_from(data3_2from);
        jqGridConfigInfo.setCol3_data_2_to(data3_2to);
        jqGridConfigInfo.setCol3_data_3_from(data3_3from);
        jqGridConfigInfo.setCol3_data_3_to(data3_3to);

    }

    public void fillOptions(String sql, PageTemplete pageTemplete) {
        String option = pageTemplete.getOtherOption();
        String[] options = option.split("&");
        int len = options.length;
        for (int i = 1; i < len + 1; i++) {
            sql = StringUtils.replace(sql, "{" + i + "}", options[i - 1]);
        }

    }

    public void findPageOption(PageTemplete pageTemplete) {
        String[] options = pageTemplete.getOtherOption().split("&");
        pageTemplete.setOption1(options[0]);
        pageTemplete.setOption2(options[1]);
        pageTemplete.setOption3(options[2]);
        pageTemplete.setOption4(options[3]);
        pageTemplete.setOption5(options[4]);
    }

    public String getSql(PageTemplete pageTemplete) throws Exception {
        //获取配置数据
        String sql = fillTime(pageTemplete);
        //sql中的条件替换~
        fillOptions(sql, pageTemplete);
        return sql;
    }

    public JqGridConfigInfo getJqGridConfigInfo(PageTemplete pageTemplete) {
        //jqgrid表格信息处理
        JqGridConfigInfo jqGridConfigInfo = new JqGridConfigInfo();
        BeanUtils.copyProperties(pageTemplete, jqGridConfigInfo);

        //jqgrid数据反解析（配色）
        jqGridResolver(jqGridConfigInfo, pageTemplete);
        return jqGridConfigInfo;
    }

    public void getJqGrid(SqlPage sqlPage, PageTemplete pageTemplete, JqGridConfigInfo jqGridConfigInfo) throws Exception {
        if (sqlPage.getPage() == null) {
            sqlPage.setPage(1);
        }
        List<ColModel> colModels = new ArrayList<ColModel>();
        String[] parms = pageTemplete.getParams().split("\\|");
        int len = parms.length;
        JdData[] jqcols = new JdData[3];
        for (int i = len - 1; i >= 0; i--) {
            if (StringUtils.isBlank(parms[i])) {
                len = len - 1;
            }
        }
        for (int i = 0; i < len; i++) {
            //定义jqgrid数据结构+sql查询
            JdData cols = new JdData();
            List<Map<String, Object>> result = getMapDatas(pageTemplete, sqlPage.getSql().split("\\|")[i], sqlPage);

            //获得table的tr（表头）
            getColumns(colModels, parms[i], result);
            cols.setColModels(colModels);
            //获得table的td（表数据）
            List<Map<String, Object>> s = getOrderedData(colModels, cols, result);
            getRowData(cols, result, s);
            jqcols[i] = cols;
            //获得table的外围数据（当前页数、总页数、多少数据等待）
            //当前页数
            cols.setPage(sqlPage.getCurrentPage());
            //数据总数
            cols.setTotal(sqlPage.getTotal()%sqlPage.getRow()==0? sqlPage.getTotal()/sqlPage.getRow():sqlPage.getTotal()/sqlPage.getRow()+1);
            //当前页的总数据数量
            cols.setRecords(result.size());
        }

        jqGridConfigInfo.setJdData(jqcols);
    }

    private void getRowData(JdData cols, List<Map<String, Object>> result, List<Map<String, Object>> s) {
        JqGridRow[] jrs = new JqGridRow[result.size()];
        for (int k = 0; k < s.size(); k++) {
            int j = 0;
            Map<String, Object> rs = s.get(k);
            Object[] cells = new Object[rs.size()];
            for (String key : rs.keySet()) {
                cells[j++] = rs.get(key);
            }
            JqGridRow jr = new JqGridRow(String.valueOf(k), cells);
            jrs[k] = jr;
        }
        cols.setRows(Arrays.asList(jrs));
    }

    private List<Map<String, Object>> getOrderedData(List<ColModel> colModels, JdData cols, List<Map<String, Object>> result) {
        List<Map<String, Object>> orderedResult = new ArrayList<Map<String, Object>>();
        int len = result.size();
        for (int i = 0; i < len; i++) {
            Map<String, Object> temp = new LinkedHashMap<String, Object>();
            for (int j = 0; j < colModels.size(); j++) {
                temp.put(colModels.get(j).getName().trim(), result.get(i).get(colModels.get(j).getName().trim()));

            }
            orderedResult.add(temp);
        }
        cols.setData(JSON.toJSONString(orderedResult));
        return orderedResult;
    }

    private void getColumns(List<ColModel> colModels, String parm, List<Map<String, Object>> result) {
        String[] coloms = parm.split(",");
        int colomslen = coloms.length;
        for (int r = 0; r < colomslen; r++) {
            ColModel col = new ColModel();
            if (!result.isEmpty() || !(result.size() == 0)) {
                Map<String, Object> message = result.get(0);
                Set<String> set = new HashSet<String>();
                set.add(coloms[r].split(":")[0].toString());
            }
            col.setLabel(coloms[r].split(":")[1].toString());
            col.setResizable(true);
            col.setName(coloms[r].split(":")[0].toString());

            col.setIndex(coloms[r].split(":")[0].toString());

            colModels.add(col);
        }
    }


    public String getSqlForPt(PageTemplete pageTemplete) throws Exception {
        //获取配置数据
        String sql = fillTimeForPt(pageTemplete);
        //sql中的条件替换~
        return fillOptionsForPt(sql, pageTemplete);

    }

    private String fillOptionsForPt(String sql, PageTemplete pageTemplete) {
        String otion = pageTemplete.getOption1() + "&" + pageTemplete.getOption2() + "&" + pageTemplete.getOption3() + "&" + pageTemplete.getOption4() + "&" + pageTemplete.getOption5();
        String otherOption = pageTemplete.getOtherOption();
        String[] options = otion.split("&");
        int len = options.length;
        String[] otheroptions = otherOption.split("&");
        int actrallen = otheroptions.length;
        for (int i = 1; i < len + 1; i++) {
            sql = StringUtils.replace(sql, "SELECT  tt.id FROM ( {" + i + "}      ) tt", options[i - 1]);
        }
        for (int i = len + 1; i < actrallen + 1; i++) {
            sql = StringUtils.replace(sql, " {" + i + "}", otheroptions[i - 1]);
        }
        return sql;
    }

    private String fillTimeForPt(PageTemplete pageTemplete) {
        String timersql = pageTemplete.getTimersql();
        String sql = StringUtils.replace(timersql, "{pt}", "\"" + pageTemplete.getTimer() + "\"");
        sql = StringUtils.replace(sql, "{start}", "\"" + pageTemplete.getStarttime() + "\"");
        sql = StringUtils.replace(sql, "{end}", "\"" + pageTemplete.getEndtime() + "\"");
        return sql;
    }
}
