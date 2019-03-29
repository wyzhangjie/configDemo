/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.util;

import com.framework.demo.enm.DateEnum;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 * <code>DatUtil</code>
 *
 * @author CK
 */
@Component
public class DateUtil {
    public static final String yyyyMMdd = "yyyyMMdd";
    public static final String yyyy_MM_dd = "yyyy-MM-dd";
    public static final String ddMMyy = "ddMMyy";
    public static final String yyyyMM = "yyyyMM";
    public static final String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    public static final String yyMMddHHmmss = "yyMMddHHmmss";
    public static final String yyyyMMddHH = "yyyyMMddHH";
    public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";
    public static final String HH_mm_ss = "HH:mm:ss";
    public static final String HHmmss = "HHmmss";

    public static final SimpleDateFormat dateFormat = new SimpleDateFormat(yyyyMMdd);
    public static final SimpleDateFormat dateFormat2 = new SimpleDateFormat(yyyy_MM_dd);
    public static final SimpleDateFormat dateFormat3 = new SimpleDateFormat(ddMMyy);
    public static final SimpleDateFormat dateFormat4 = new SimpleDateFormat(yyyyMM);
    public static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat(yyyy_MM_dd_HH_mm_ss);
    public static final SimpleDateFormat dateTimeFormat2 = new SimpleDateFormat(yyMMddHHmmss);
    public static final SimpleDateFormat dateTimeFormat3 = new SimpleDateFormat(yyyyMMddHH);
    public static final SimpleDateFormat dateTimeFormat4 = new SimpleDateFormat(yyyyMMddHHmmss);
    public static final SimpleDateFormat timeFormat = new SimpleDateFormat(HH_mm_ss);
    public static final SimpleDateFormat timeFormat2 = new SimpleDateFormat(HHmmss);

    public static final long HOUR_TIME = 60 * 60 * 1000;

    /**
     * 指定日期转换成字符串
     * @param format 格式
     * @param date 日期
     * @return 日期字符串
     */
    public static String formatDateToStr(String format, Date date) {
        String dateStr = null;
        if (yyyyMMdd.equals(format)) {
            dateStr = dateFormat.format(date);
        } else if (yyyy_MM_dd.equals(format)) {
            dateStr = dateFormat2.format(date);
        } else if (ddMMyy.equals(format)) {
            dateStr = dateFormat3.format(date);
        } else if (yyyyMM.equals(format)) {
            dateStr = dateFormat4.format(date);
        } else if (yyyy_MM_dd_HH_mm_ss.equals(format)) {
            dateStr = dateTimeFormat.format(date);
        } else if (yyMMddHHmmss.equals(format)) {
            dateStr = dateTimeFormat2.format(date);
        } else if (yyyyMMddHH.equals(format)) {
            dateStr = dateTimeFormat3.format(date);
        } else if (yyyyMMddHHmmss.equals(format)) {
            dateStr = dateTimeFormat4.format(date);
        } else if (HH_mm_ss.equals(format)) {
            dateStr = timeFormat.format(date);
        } else if (HHmmss.equals(format)) {
            dateStr = timeFormat2.format(date);
        }

        return dateStr;
    }

    /**
     * 指定字符串转换成日期
     * @param format 格式
     * @param dateStr 日期字符串
     * @return 日期
     */
    public static Date strToDate(String format, String dateStr) {
        Date date = null;
        try {
            if (yyyyMMdd.equals(format)) {
                date = dateFormat.parse(dateStr);
            } else if (yyyy_MM_dd.equals(format)) {
                date = dateFormat2.parse(dateStr);
            } else if (ddMMyy.equals(format)) {
                date = dateFormat3.parse(dateStr);
            } else if (yyyyMM.equals(format)) {
                date = dateFormat4.parse(dateStr);
            } else if (yyyy_MM_dd_HH_mm_ss.equals(format)) {
                date = dateTimeFormat.parse(dateStr);
            } else if (yyMMddHHmmss.equals(format)) {
                date = dateTimeFormat2.parse(dateStr);
            } else if (yyyyMMddHH.equals(format)) {
                date = dateTimeFormat3.parse(dateStr);
            } else if (yyyyMMddHHmmss.equals(format)) {
                date = dateTimeFormat4.parse(dateStr);
            } else if (HH_mm_ss.equals(format)) {
                date = timeFormat.parse(dateStr);
            } else if (HHmmss.equals(format)) {
                date = timeFormat2.parse(dateStr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return date;
    }

    /**
     * 获取字符串日期
     * <p><b>格式：</b>YYYY-MM-DD</p>
     *
     * @return String
     */
    public static String getDateStr() {
        return dateFormat.format(new Date());
    }

    /**
     * 获取字符串日期
     * <p><b>格式：</b>YYYYMMDD</p>
     *
     * @return String
     */
    public static String getDateStr2() {
        return dateFormat2.format(new Date());
    }

    /**
     * 获取字符串日期
     * <p><b>格式：</b>YYMMDD</p>
     * {@link #getDateStr2()}
     *
     * @return String
     */
    public static String getDateStrSimply() {
        return getDateStr2().substring(2);
    }

    /**
     * 获取字符串日期
     * <p><b>格式：</b>DDMMYY</p>
     *
     * @return String
     */
    public static String getDateStr3() {
        return dateFormat3.format(new Date());
    }

    /**
     * 获取字符串日期
     * <p><b>格式：</b>YYYYMM</p>
     *
     * @return String
     */
    public static String getDateStr4() {
        return dateFormat4.format(new Date());
    }

    /**
     * 获取字符串日期时间
     * <p><b>格式：</b>YYYY-MM-DD HH:mm:ss</p>
     *
     * @return String
     */
    public static String getDateTimeStr() {
        return dateTimeFormat.format(new Date());
    }

    /**
     * 获取字符串日期时间
     * <p><b>格式：</b>YYMMDDHHmmss</p>
     *
     * @return String
     */
    public static String getDateTimeStr2() {
        return dateTimeFormat2.format(new Date());
    }

    /**
     * 获取字符串日期时间
     * <p><b>格式：</b>YYYYMMDDHH</p>
     *
     * @return String
     */
    public static String getDateTimeStr3() {
        return dateTimeFormat3.format(new Date());
    }

    /**
     * 获取字符串日期时间
     * <p><b>格式：</b>yyyyMMddHHmmss</p>
     *
     * @return String
     */
    public static String getDateTimeStr4() {
        return dateTimeFormat4.format(new Date());
    }

    /**
     * 获取字符串时间
     * <p><b>格式：</b>HH:mm:ss</p>
     *
     * @return String
     */
    public static String getTimeStr() {
        return timeFormat.format(new Date());
    }

    /**
     * 获取字符串时间
     * <p><b>格式：</b>HHmmss</p>
     *
     * @return String
     */
    public static String getTimeStr2() {
        return timeFormat2.format(new Date());
    }

    /**
     * 当前日期加减 获取字符串日期时间
     * <p><b>格式：</b>yyyy-MM-dd HH:mm:ss</p>
     *
     * @param i &nbsp;<b>年：</b>1 <b>月：</b>2 <b>周：</b>3 <b>天：</b>5 <b>小时：</b>10 <b>分钟：</b>12 <b>秒：</b>13
     * @param j 加减数量
     * @return 字符串日期时间
     */
    public static String getDateStr(int i, int j) {
        Date date = getTime(null, null, i, j);
        return dateTimeFormat.format(date);
    }

    /**
     * 指定日期加减 获取字符串日期时间
     *
     * @param dataDate  需要格式化的日期字符串<code>String</code>
     * @param formatStr user-defined date format like "yyyy-MM-dd HH:mm:ss"
     * @param i         &nbsp;<b>年：</b>1 <b>月：</b>2 <b>周：</b>3 <b>天：</b>5 <b>小时：</b>10 <b>分钟：</b>12 <b>秒：</b>13
     * @param j         加减数量
     * @return 字符串日期时间
     */
    public static String getDateStr(String dataDate, String formatStr, int i, int j) {
        SimpleDateFormat df = (SimpleDateFormat)DateEnum.getFormatByString(formatStr);
        Date date = getTime(df, dataDate, i, j);
        return df.format(date);
    }

    /**
     * 是否为闰年
     *
     * @param year 年份
     * @return <code>boolean</code>
     * <p>是：<code>true</code> 否：<code>false</code></p>
     */
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    /**
     * 某月最大天数
     *
     * @param year  年份
     * @param month 月份
     * @return 某月最大天数
     */
    public static int maxDayOfMonth(int year, int month) {
        if (month <= 0 || month > 12) {
            return -1;
        }
        int day = 0;
        switch (month) {
            case 2:
                day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                day = 31;
        }
        if (month == 2 && isLeapYear(year)) {
            day++;
        }
        return day;
    }

    /**
     * 获取指定的年月日字符串
     *
     * @param formatStr 日期字符串
     * @param year      年
     * @param month     月
     * @param day       日
     * @return 指定的年月日字符串
     */
    public static String getDateStr(String formatStr, int year, int month, int day) {
        SimpleDateFormat df = (SimpleDateFormat)DateEnum.getFormatByString(formatStr);
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        return df.format(c.getTime());
    }

    /**
     * 获取当前年份
     *
     * @param formatStr 日期格式
     * @param dateStr   需要计算的日期字符串<code>String</code>
     * @return 当前年份
     */
    public static int year(String formatStr, String dateStr) {
        SimpleDateFormat df = (SimpleDateFormat)DateEnum.getFormatByString(formatStr);
        return getYear(df, dateStr);
    }

    /**
     * 获取当前年份
     *
     * @return 当前年份
     */
    public static int getYear() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        return c.get(Calendar.YEAR);
    }

    /**
     * 获取当前月份
     *
     * @param formatStr 日期格式
     * @param dateStr   需要计算的日期字符串<code>String</code>
     * @return 当前月份
     */
    public static int month(String formatStr, String dateStr) {
        SimpleDateFormat df = (SimpleDateFormat)DateEnum.getFormatByString(formatStr);
        return getMonth(df, dateStr);
    }

    /**
     * 获取当前天数
     *
     * @param formatStr 日期格式
     * @param dateStr   需要计算的日期字符串<code>String</code>
     * @return 当前天数
     */
    public static int day(String formatStr, String dateStr) {
        SimpleDateFormat df = (SimpleDateFormat)DateEnum.getFormatByString(formatStr);
        return getDay(df, dateStr);
    }

    /**
     * 获取本周第几天
     *
     * @param formatStr 日期格式字符串
     * @param dateStr   需要计算的日期字符串<code>yyyy-MM-dd</code>
     * @return 获取本周第几天
     */
    public static int week(String formatStr, String dateStr) {
        SimpleDateFormat df =(SimpleDateFormat) DateEnum.getFormatByString(formatStr);
        return getWeek(df, dateStr);
    }

    /**
     * 获取当前季度
     *
     * @param formatStr 日期格式字符串
     * @param date      需要计算的日期字符串<code>yyyy-MM-dd</code>
     * @return 当前季度
     */
    public static int getQuarter(String formatStr, String date) {
        return (month(formatStr, date) - 1) / 3 + 1;
    }

    /**
     * 获取当前季度所在的天数
     *
     * @param formatStr 日期格式字符串
     * @param date      需要计算的日期字符串<code>yyyy-MM-dd</code>
     * @return 当前季度所在的天数
     */
    public static int dayOfQuarter(String formatStr, String date) {
        int month = month(formatStr, date);
        int year = year(formatStr, date);
        int day = 0;
        for (int i = month - (month - 1) % 3; i < month; i++) {
            day += maxDayOfMonth(year, i);
        }
        day += day(formatStr, date);
        return day;
    }
    /**
     * 取得季度第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDateOfSeason(Date date) {
        return getFirstDateOfMonth(getSeasonDate(date)[0]);
    }
    /**
     *
     * 1 第一季度 2 第二季度 3 第三季度 4 第四季度
     *
     * @param date
     * @return
     */
    public static int getSeason(Date date) {

        int season = 0;

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                season = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                season = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                season = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                season = 4;
                break;
            default:
                break;
        }
        return season;
    }
    /**
     * 取得季度月
     *
     * @param date
     * @return
     */
    public static Date[] getSeasonDate(Date date) {
        Date[] season = new Date[3];

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        int nSeason = getSeason(date);
        if (nSeason == 1) {// 第一季度
            c.set(Calendar.MONTH, Calendar.JANUARY);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.FEBRUARY);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.MARCH);
            season[2] = c.getTime();
        } else if (nSeason == 2) {// 第二季度
            c.set(Calendar.MONTH, Calendar.APRIL);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.MAY);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.JUNE);
            season[2] = c.getTime();
        } else if (nSeason == 3) {// 第三季度
            c.set(Calendar.MONTH, Calendar.JULY);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.AUGUST);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.SEPTEMBER);
            season[2] = c.getTime();
        } else if (nSeason == 4) {// 第四季度
            c.set(Calendar.MONTH, Calendar.OCTOBER);
            season[0] = c.getTime();
            c.set(Calendar.MONTH, Calendar.NOVEMBER);
            season[1] = c.getTime();
            c.set(Calendar.MONTH, Calendar.DECEMBER);
            season[2] = c.getTime();
        }
        return season;
    }
    /**
     * 取得月第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstDateOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }
    /**
     * 返回日期自公元0年开始以来的天数
     *
     * @param formatStr 日期格式字符串
     * @param date      需要计算的日期字符串<code>yyyy-MM-dd</code>
     * @return 日期自公元0年开始以来的天数
     */
    public static int days(String formatStr, String date) {
        int days = 0;
        int year = year(formatStr, date) - 1;
        days += year * 365;// one year have 365 day
        days += year / 4;// 4 year one leap year
        days -= year / 100;// 100 year no leap year
        days += year / 400;// 400 year one leap year
        days += dayOfYear(formatStr, date);
        return days;
    }

    /**
     * 获取当天在当年的天数
     *
     * @param formatStr 日期格式字符串
     * @param date      需要计算的日期字符串<code>yyyy-MM-dd</code>
     * @return 当天在当年的天数
     */
    public static int dayOfYear(String formatStr, String date) {
        int month = month(formatStr, date);
        int year = year(formatStr, date);
        int day = 0;
        for (int i = 1; i < month; i++) {
            day += maxDayOfMonth(year, i);
        }
        day += day(formatStr, date);
        return day;
    }

    /**
     * 获取月份第一天
     * 根据指定日期字符串减去<code>n</code>月
     *
     * @param formatStr 日期格式字符串
     * @param date      需要计算的日期字符串<code>yyyy-MM-dd</code>
     * @param n         计算数量
     * @return 月份第一天
     */
    public static String dateRedMonthBegin(String formatStr, String date, int n) {
        String str = "";
        int year = year(formatStr, date);
        int month = month(formatStr, date);
        if (n >= 12) {
            int m = n % 12;
            int s = n / 12;
            month = 12 - m + month;
            year = year - s;
        } else {
            month = month - n;
        }
        if (month == 0) {
            year = year - 1;
            month = 12;
        }
        if (month < 10) {
            str = "0" + month;
        } else {
            str = month + "";
        }
        return year + "-" + str + "-01";
    }

    /**
     * 获取月份最大天
     * 根据指定日期字符串减去<code>n</code>月
     *
     * @param formatStr 日期格式字符串
     * @param date      需要计算的日期字符串<code>yyyy-MM-dd</code>
     * @param n         计算数量
     * @return 月份最大天
     */
    public static String dateRedMonthEnd(String formatStr, String date, int n) {
        String str = "";
        int year = year(formatStr, date);
        int month = month(formatStr, date);
        if (n >= 12) {
            int m = n % 12;
            int s = n / 12;
            month = 12 - m + month;
            year = year - s;
        } else {
            month = month - n;
        }
        if (month == 0) {
            year = year - 1;
            month = 12;
        }
        if (month < 10) {
            str = "0" + month;
        } else {
            str = month + "";
        }
        return year + "-" + str + "-" + maxDayOfMonth(year, month);
    }

    /**
     * 开始时间减去结束时间
     * <p><code>begin</code>-<code>end</code></p>
     *
     * @param formatStr 日期格式字符串
     * @param begin     开始时间
     * @param end       结束时间
     * @return 时间差
     */
    public static long getDaylong(String formatStr, String begin, String end) {
        SimpleDateFormat df = (SimpleDateFormat)DateEnum.getFormatByString(formatStr);
        Date dbegin = null;
        Date dend = null;
        try {
            dbegin = df.parse(begin);
            dend = df.parse(end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (dend.getTime() - dbegin.getTime()) / 86400000;
    }

    /**
     * 根据指定的{@link SimpleDateFormat}格式化<code>dataDate</code>字符串
     *
     * @param df 格式
     * @param dataDate 需要格式化的日期字符串<code>String</code>
     * @param i        &nbsp;<b>年：</b>1 <b>月：</b>2 <b>周：</b>3 <b>天：</b>5 <b>小时：</b>10 <b>分钟：</b>12 <b>秒：</b>13
     * @param j        加减数量
     * @return 格式化的日期字符串
     */
    public static Date getTime(SimpleDateFormat df, String dataDate, int i, int j) {
        Date date = new Date();
        if ((null == dataDate || "".equals(dataDate)) && (0 == i && 0 == j)) {
            return date;
        } else if (null != dataDate && !"".equals(dataDate)) {
            if (null == df) {
                df = getDataDate(df, dataDate);
            }
            if (null == df) {
                date = getLikeDate(df, dataDate, date);
            } else {
                try {
                    date = df.parse(dataDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        if (0 == i && 0 == j) {
            return date;
        }

        return getDateByCalendar(date, i, j);
    }

    /**
     * 根据指定的<code>dataDate</code>字符串,查找{@link SimpleDateFormat}
     *
     * @param sf 格式
     * @param dataDate 需要格式化的日期字符串<code>String</code>
     * @return 格式化的日期字符串
     */
    public static SimpleDateFormat getDataDate(SimpleDateFormat sf, String dataDate) {
        if (-1 != dataDate.indexOf("-") && 10 == dataDate.length()) {
            sf = dateFormat2;
        } else if (-1 != dataDate.indexOf("-") && 19 == dataDate.length()) {
            sf = dateTimeFormat;
        } else if (-1 != dataDate.indexOf(":") && 8 == dataDate.length()) {
            sf = timeFormat;
        } else {
            if (8 == dataDate.length()) {
                sf = dateFormat;
            } else if (10 == dataDate.length()) {
                sf = dateTimeFormat3;
            } else if (12 == dataDate.length()) {
                sf = dateTimeFormat2;
            } else if (14 == dataDate.length()) {
                sf = dateTimeFormat4;
            } else if (6 == dataDate.length()) {
                // do nothing
            }
        }
        return sf;
    }

    /**
     * 根据需要格式化的日期字符串,模糊获取日期
     *
     * @param df 格式
     * @param dataDate 需要格式化的日期字符串<code>String</code>
     * @param date 日期
     * @return 模糊获取日期
     */
    public static Date getLikeDate(SimpleDateFormat df, String dataDate, Date date) {
        boolean flag = false;

        try {
            date = timeFormat2.parse(dataDate);
        } catch (ParseException e) {
            flag = true;
        }
        if (flag) {
            try {
                date = dateFormat4.parse(dataDate);
                flag = false;
            } catch (ParseException e) {
                flag = true;
            }
        }
        if (flag) {
            try {
                date = dateFormat3.parse(dataDate);
                flag = false;
            } catch (ParseException e) {
                flag = true;
            }
        }
        return date;
    }

    /**
     * 通过{@link Calendar}获取日期
     *
     * @param date 需要计算的日期<code>date</code>
     * @param i    &nbsp;<b>年：</b>1 <b>月：</b>2 <b>周：</b>3 <b>天：</b>5 <b>小时：</b>10 <b>分钟：</b>12 <b>秒：</b>13
     * @param j    加减数量
     * @return 获取日期
     */
    public static Date getDateByCalendar(Date date, int i, int j) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        gc.add(i, j);
        return gc.getTime();
    }

    /**
     * 获取本周第几天
     *
     * @param df      格式
     * @param dateStr 日期字符串
     * @return 本周第几天
     */
    public static int getWeek(SimpleDateFormat df, String dateStr) {
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(df.parse(dateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int week = c.get(Calendar.DAY_OF_WEEK) - 1;
        if (0 == week) {
            week = 7;
        }
        return week;
    }

    /**
     * 获取当前年份
     *
     * @param df      格式
     * @param dateStr 日期字符串
     * @return 当前年份
     */
    public static int getYear(SimpleDateFormat df, String dateStr) {
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(df.parse(dateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c.get(Calendar.YEAR);
    }

    /**
     * 获取当前月份
     *
     * @param df      格式
     * @param dateStr 日期字符串
     * @return 当前月份
     */
    public static int getMonth(SimpleDateFormat df, String dateStr) {
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(df.parse(dateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c.get(Calendar.MONTH) + 1;
    }
    // 获取当前时间所在年的周数
    public static int getWeekOfYear(Date date) {
        Calendar c = new GregorianCalendar();

        //2016年01  01  不设置setMinimalDaysInFirstWeek 默认为2016年第一周
        c.setMinimalDaysInFirstWeek(4);

        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        return c.get(Calendar.WEEK_OF_YEAR);
    }

    // 获取当前时间所在年的最大周数
    public static int getMaxWeekNumOfYear(int year) {
        Calendar c = new GregorianCalendar();
        c.set(year, Calendar.DECEMBER, 31, 23, 59, 59);

        return getWeekOfYear(c.getTime());
    }

    // 获取某年的第几周的开始日期
    public static Date getFirstDayOfWeek(int year, int week) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DATE, 1);

        Calendar cal = (GregorianCalendar) c.clone();
        cal.add(Calendar.DATE, week * 7);

        return getFirstDayOfWeek(cal.getTime());
    }

    // 获取某年的第几周的结束日期
    public static Date getLastDayOfWeek(int year, int week) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DATE, 1);

        Calendar cal = (GregorianCalendar) c.clone();
        cal.add(Calendar.DATE, week * 7);

        return getLastDayOfWeek(cal.getTime());
    }

    // 获取当前时间所在周的开始日期
    public static Date getFirstDayOfWeek(Date date) {
        Calendar c = new GregorianCalendar();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
        return c.getTime();
    }

    // 获取当前时间所在周的结束日期
    public static Date getLastDayOfWeek(Date date) {
        Calendar c = new GregorianCalendar();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + 6); // Sunday
        return c.getTime();
    }

    /**
     * 获取当前天数
     *
     * @param df      格式
     * @param dateStr 日期字符串
     * @return 当前天数
     */
    public static int getDay(SimpleDateFormat df, String dateStr) {
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(df.parse(dateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c.get(Calendar.DATE);
    }

    /**
     * 计算2个日期相差天数
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 天数
     */
    public static long getBetweenDay(Date startDate, Date endDate) {
        return getBetweenHour(startDate, endDate) / 24;
    }

    /**
     * 计算2个日期相差小时数
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 小时数
     */
    public static long getBetweenHour(Date startDate, Date endDate) {
        long startDateTime = startDate.getTime();
        long endDateTime = endDate.getTime();
        long hours = (endDateTime - startDateTime) / HOUR_TIME;
        return hours;
    }

    /**
     * 解析日期
     * @param df 格式
     * @param date 日期字符串
     * @return 日期Date
     */
    public static Date parse(SimpleDateFormat df, String date) {
        try {
            return df.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
