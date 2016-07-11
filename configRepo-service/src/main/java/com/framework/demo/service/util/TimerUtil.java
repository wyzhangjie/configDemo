package com.framework.demo.service.util;

import com.framework.demo.bo.pageTemplate.PageTemplete;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2015/9/10.
 */
public class TimerUtil implements Serializable {
    public static String processTime(String time,String report_kind) {
        if(time==null|| StringUtils.isEmpty(time)|| StringUtils.isBlank(time)){
            return null;
        }else{
            if("年报".equalsIgnoreCase(report_kind)){
                time = time +"-01-01";
            }
            if("月报".equalsIgnoreCase(report_kind)){
                time= time+"-01";
            }
            if("周报".equalsIgnoreCase(report_kind)){
                time= time.replaceAll("年，第","-");
                time= time.replaceAll("周","");
                Integer year = Integer.parseInt(time.split("-")[0]);
                Integer weeks = Integer.parseInt(time.split("-")[1]) -1;
                Date date = DateUtil.getFirstDayOfWeek(year, weeks);
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                time = sdf.format(date);
            }
            if("季报".equalsIgnoreCase(report_kind)){
                time = time.replaceAll("年","-");
                time = time.replaceAll("季度","");
                String year =time.split("-")[0];
                String season = time.split("-")[1];
                if("1".equalsIgnoreCase(season)){
                    time = year+"-01-01";
                }
                if("2".equalsIgnoreCase(season)){
                    time = year+"-04-01";
                }
                if("3".equalsIgnoreCase(season)){
                    time = year+"-07-01";
                }
                if("4".equalsIgnoreCase(season)){
                    time = year+"-10-01";
                }
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date d= sdf.parse(time);
                    d = DateUtil.getFirstDateOfSeason(d);
                    time = sdf.format(d);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return  time;
    }
    private String processTime(String time,String report_kind,PageTemplete pageTemplate) {
        if(time==null|| StringUtils.isEmpty(time)|| StringUtils.isBlank(time)){
            pageTemplate.setReportKind("日报");
            return null;
        }else{
            if("年报".equalsIgnoreCase(report_kind)){
                time = time +"-01-01";
            }
            if("月报".equalsIgnoreCase(report_kind)){
                time= time+"-01";
            }
            if("周报".equalsIgnoreCase(report_kind)){


                time= time.replaceAll("年，第","-");
                time= time.replaceAll("周","");
                Integer year = Integer.parseInt(time.split("-")[0]);
                Integer weeks = Integer.parseInt(time.split("-")[1]) -1;
                //   Integer weeks = Integer.parseInt(time.split("-")[1])-1 ;
                if(weeks==0){
                    weeks =1;
                }
                Date date = DateUtil.getFirstDayOfWeek(year, weeks);
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                time = sdf.format(date);
            }
            if("季报".equalsIgnoreCase(report_kind)){
                time = time.replaceAll("年","-");
                time = time.replaceAll("季度","");
                String year =time.split("-")[0];
                String season = time.split("-")[1];
                if("1".equalsIgnoreCase(season)){
                    time = year+"-01-01";
                }
                if("2".equalsIgnoreCase(season)){
                    time = year+"-04-01";
                }
                if("3".equalsIgnoreCase(season)){
                    time = year+"-07-01";
                }
                if("4".equalsIgnoreCase(season)){
                    time = year+"-10-01";
                }
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date d= sdf.parse(time);
                    d = DateUtil.getFirstDateOfSeason(d);
                    time = sdf.format(d);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        pageTemplate.setReportKind(report_kind);
        return  time;
    }
    //获得当前时段的时间信息
    public static String processTimeForMenuForNow(String report_kind,PageTemplete pageTemplate){
        String time =null;
        Calendar calendar = Calendar.getInstance();
        if(report_kind==null){
            pageTemplate.setReportKind("日报");
            return null;
        }else {
            if("日报".equalsIgnoreCase(report_kind)){
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE,   0);
                Date date = new Date();
                time = new SimpleDateFormat( "yyyy-MM-dd ").format(date);
            }

            if("年报".equalsIgnoreCase(report_kind)){
                //获得当年
                int year =calendar.get(Calendar.YEAR) ;
                time = year +"-01-01";
            }
            if("月报".equalsIgnoreCase(report_kind)){
                int year =calendar.get(Calendar.YEAR) ;
                int month = calendar.get(Calendar.MONTH)+1;
                if(month<10){
                    time = year +"-"+"0"+month+"-01";
                }else{
                    time = year+"-"+month+"-01";
                }

            }
            if("周报".equalsIgnoreCase(report_kind)){
                //本周
             /*  Date date = new Date();
               Calendar calendar1 = Calendar.getInstance();
               date = DateUtil.getFirstDayOfWeek(date);
               calendar1.setTime(date);
               SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
              // time = sdf.format(date);
               int week = DateUtil.getWeekOfYear(date);
               //2016年，第2周
               time = String.valueOf(calendar1.get(Calendar.YEAR))+"年，第"+week+"周";*/
                Date date = new Date();
                Calendar calendar1 = Calendar.getInstance();
                calendar1.setTime(new Date());
                //   calendar1.add(Calendar.DATE, -1);
                date= calendar1.getTime();
                date = DateUtil.getFirstDayOfWeek(date);
                calendar1.setTime(date);
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                time = sdf.format(date);
                return time;

            }
            if("季报".equalsIgnoreCase(report_kind)){
                Date date = new Date();
                int season = DateUtil.getSeason(date);
                int year = DateUtil.getYear();
                if(season <=0){
                    season=season+4;
                    year=year-1;
                }

                if("1".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-01-01";
                }
                if("2".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-04-01";
                }
                if("3".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-07-01";
                }
                if("4".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-10-01";
                }
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date d= sdf.parse(time);
                    d = DateUtil.getFirstDateOfSeason(d);
                    time = sdf.format(d);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        pageTemplate.setReportKind(report_kind);
        return  time;
    }

    public static String processTimeForPt(String report_kind,String timer){
        if("日报".equalsIgnoreCase(report_kind)){
            return timer;
        }
        if("月报".equalsIgnoreCase(report_kind)){
            return timer+"-01";
        }
        if("周报".equalsIgnoreCase(report_kind)){
            if(timer.indexOf("年")==-1){
                return timer;
            }

            String year =timer.substring(0,timer.indexOf("年"));
            String week =timer.substring(timer.indexOf("第") + 1, timer.indexOf("周"));
            // Integer year =Integer.parseInt(time.split("-")[0]);
            Integer weeks = Integer.parseInt(week)-1 ;
            if(weeks==0){
                weeks =1;
            }
            if(year.equalsIgnoreCase("2016")){
                weeks++;
            }
            Date date = DateUtil.getFirstDayOfWeek(Integer.parseInt(year), weeks);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            return  sdf.format(date);

        }
        if("季报".equalsIgnoreCase(report_kind)){
            String year = timer.substring(0,timer.indexOf("年"));
            String season = timer.substring(timer.indexOf("年")+1,timer.indexOf("季度"));

            if("1".equalsIgnoreCase(String.valueOf(season))){
                timer = year+"-01-01";
            }
            if("2".equalsIgnoreCase(String.valueOf(season))){
                timer = year+"-04-01";
            }
            if("3".equalsIgnoreCase(String.valueOf(season))){
                timer = year+"-07-01";
            }
            if("4".equalsIgnoreCase(String.valueOf(season))){
                timer = year+"-10-01";
            }
        }
        if("年报".equalsIgnoreCase(report_kind)){
            //  String year =timer.substring(0,timer.indexOf("年"));
            timer = timer +"-01-01";
        }
        return timer;

    }

    public static String processTimeForMenu(String report_kind,PageTemplete pageTemplate) {
        String time =null;
        Calendar calendar = Calendar.getInstance();
        if(report_kind==null){
            pageTemplate.setReportKind("日报");
            return null;
        }else {
            if("日报".equalsIgnoreCase(report_kind)){
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE,   -1);
                time = new SimpleDateFormat( "yyyy-MM-dd ").format(cal.getTime());
            }

            if("年报".equalsIgnoreCase(report_kind)){
                //获得上一年
                int year =calendar.get(Calendar.YEAR) -1;
                time = year +"-01-01";
            }
            if("月报".equalsIgnoreCase(report_kind)){
                int year =calendar.get(Calendar.YEAR) ;
                calendar.add(Calendar.MONTH, -1);    //得到前一个月
                int month = calendar.get(Calendar.MONTH)+1;
                if(month==12){
                    year = year -1;

                }
                if(month<10){
                    time = year +"-"+"0"+month+"-01";
                }else{
                    time = year+"-"+month+"-01";
                }
              /*  time = year+"-"+month+"-01";*/
            }
            if("周报".equalsIgnoreCase(report_kind)){
                //上一周
                Date date = new Date();
                Calendar calendar1 = Calendar.getInstance();
                calendar1.setTime(new Date());
                calendar1.add(Calendar.DATE, -7);
                date= calendar1.getTime();
                date = DateUtil.getFirstDayOfWeek(date);
                calendar1.setTime(date);
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                time = sdf.format(date);
                return time;

            }
            if("季报".equalsIgnoreCase(report_kind)){
                Date date = new Date();
                int season = DateUtil.getSeason(date);
                season = season -1;
                int year = DateUtil.getYear();
                if(season <=0){
                    season=season+4;
                    year=year-1;
                }

                if("1".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-01-01";
                }
                if("2".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-04-01";
                }
                if("3".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-07-01";
                }
                if("4".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-10-01";
                }
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date d= sdf.parse(time);
                    d = DateUtil.getFirstDateOfSeason(d);
                    time = sdf.format(d);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        pageTemplate.setReportKind(report_kind);
        return  time;
    }

    public static String processTimeForModifyAndCreate(String report_kind,PageTemplete pageTemplate) {
        String time =null;
        Calendar calendar = Calendar.getInstance();
        if(report_kind==null){
            pageTemplate.setReportKind("日报");
            return null;
        }else {
            if("日报".equalsIgnoreCase(report_kind)){
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE,   -1);
                time = new SimpleDateFormat( "yyyy-MM-dd ").format(cal.getTime());
            }

            if("年报".equalsIgnoreCase(report_kind)){
                //获得上一年
                int year =calendar.get(Calendar.YEAR) -1;
                time = year +"-01-01";
            }
            if("月报".equalsIgnoreCase(report_kind)){
                int year =calendar.get(Calendar.YEAR) ;
                calendar.add(Calendar.MONTH, -1);    //得到前一个月
                int month = calendar.get(Calendar.MONTH)+1;
                if(month==12){
                    year = year -1;

                }
                if(month<10){
                    time = year +"-"+"0"+month+"-01";
                }else{
                    time = year+"-"+month+"-01";
                }

            }
            if("周报".equalsIgnoreCase(report_kind)){
                //上一周
                Date date = new Date();
                Calendar calendar1 = Calendar.getInstance();
                calendar1.setTime(new Date());
                calendar1.add(Calendar.DATE, -7);
                date= calendar1.getTime();
                date = DateUtil.getFirstDayOfWeek(date);

                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                time = sdf.format(date);
            }
            if("季报".equalsIgnoreCase(report_kind)){
                Date date = new Date();
                int season = DateUtil.getSeason(date);
                season = season -1;
                int year = DateUtil.getYear();
                if(season <=0){
                    season=season+4;
                    year=year-1;
                }

                if("1".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-01-01";
                }
                if("2".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-04-01";
                }
                if("3".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-07-01";
                }
                if("4".equalsIgnoreCase(String.valueOf(season))){
                    time = year+"-10-01";
                }
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date d= sdf.parse(time);
                    d = DateUtil.getFirstDateOfSeason(d);
                    time = sdf.format(d);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        pageTemplate.setReportKind(report_kind);
        return  time;
    }

    public static String processMulTimeForModiifyAndCreate(String report_kind,PageTemplete pageTemplate){
        String time =null;
        Calendar calendar = Calendar.getInstance();
        if(report_kind==null){
            pageTemplate.setReportKind("日报");
            return null;
        }else {
            if ("日报".equalsIgnoreCase(report_kind)) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -1);
                time = new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
            }
            return time;
        }

    }

    public static String FaceTimerFromMenu(String timer,String reportKind) throws Exception {
        //处理周
        if(reportKind.equalsIgnoreCase("周报")){
            Date date = new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.parse(timer);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(date);
            calendar1.setMinimalDaysInFirstWeek(4);
            calendar1.setFirstDayOfWeek(Calendar.MONDAY);
            date = DateUtil.getFirstDayOfWeek(date);

            //  int year =DateUtil.getYear();
            int week = DateUtil.getWeekOfYear(date);
            week =calendar1.get(Calendar.WEEK_OF_YEAR);
            //      week =  calendar1.getActualMaximum(Calendar.WEEK_OF_YEAR);
            int year = calendar1.get(Calendar.YEAR);

            //2016年，第2周
            timer = String.valueOf(year)+"年，第"+week+"周";
            return timer;
        }
        //处理季报
        return timer;
    }

    public static String processMulEndTimeForMenu(String report_kind,PageTemplete pageTemplate){
        String time =null;
        Calendar calendar = Calendar.getInstance();
        if(report_kind==null){
            pageTemplate.setReportKind("日报");
            return null;
        }else {
            if ("日报".equalsIgnoreCase(report_kind)) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -1);
                time = new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime());
            }
            return time;
        }
    }

    public static String processMulEndTimeForMenuNow(String report_kind,PageTemplete pageTemplate){
        String time=null;
        Calendar calendar = Calendar.getInstance();
        if(report_kind==null){
            pageTemplate.setReportKind("日报");
            return null;
        }else {
            if ("日报".equalsIgnoreCase(report_kind)) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, 0);
                Date date = new Date();
                time = new SimpleDateFormat("yyyy-MM-dd ").format(date);
            }
        }
        return time;
    }

    public static String processMulStartTimeForMenu(String daynum,String endtime){
        String time =null;
        int dayNum= Integer.parseInt(daynum)*(-1);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d= sdf.parse(endtime);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(d);
            calendar1.add(Calendar.DATE, dayNum);
            d=calendar1.getTime();
            time = sdf.format(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }


}
