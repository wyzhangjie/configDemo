/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.enm;

import cn.vansky.framework.common.util.DateUtil;

import java.text.SimpleDateFormat;

/**
 * 日期枚举<code>DateEnum</code>
 * <p>默认使用日期类型<code>yyyy_MM_dd_HH_mm_ss</code></p>
 * @author CK
 *
 */
public enum DateEnum {
	yyyyMMdd(DateUtil.yyyyMMdd, DateUtil.dateFormat),
	yyyy_MM_dd(DateUtil.yyyy_MM_dd, DateUtil.dateFormat2),
	ddMMyy(DateUtil.ddMMyy, DateUtil.dateFormat3),
	yyyyMM(DateUtil.yyyyMM, DateUtil.dateFormat4),
	yyyy_MM_dd_HH_mm_ss(DateUtil.yyyy_MM_dd_HH_mm_ss, DateUtil.dateTimeFormat),
	yyMMddHHmmss(DateUtil.yyMMddHHmmss, DateUtil.dateTimeFormat2),
	yyyyMMddHH(DateUtil.yyyyMMddHH, DateUtil.dateTimeFormat3),
	yyyyMMddHHmmss(DateUtil.yyyyMMddHHmmss, DateUtil.dateTimeFormat4),
	HH_mm_ss(DateUtil.HH_mm_ss, DateUtil.timeFormat),
	HHmmss(DateUtil.HHmmss, DateUtil.timeFormat2);
	
	private String dateEnum;
	private SimpleDateFormat simpleDateFormat;
	private DateEnum(String dateEnum, SimpleDateFormat simpleDateFormat) {
		this.dateEnum = dateEnum;
		this.simpleDateFormat = simpleDateFormat;
	}
	
	/**
	 * 通过<code>DateEnum</code>获取{@link SimpleDateFormat}
	 * @param formatStr 日期枚举<code>DateEnum</code>
	 * @return <code>SimpleDateFormat</code>
	 */
	public static SimpleDateFormat getFormatByDateEnum(DateEnum formatStr) {
        for (DateEnum dateEnum : DateEnum.values()) {
            if (dateEnum.getDateEnum().equals(formatStr.dateEnum)) {
                return dateEnum.simpleDateFormat;
            }
        }
        return DateEnum.yyyy_MM_dd_HH_mm_ss.simpleDateFormat;
    }
	
	/**
	 * 通过<code>String</code>获取{@link SimpleDateFormat}
	 * @param formatStr 日期字符串<code>String</code>
	 * @return <code>SimpleDateFormat</code>
	 */
	public static SimpleDateFormat getFormatByString(String formatStr) {
        for (DateEnum dateEnum : DateEnum.values()) {
            if (dateEnum.getDateEnum().equals(formatStr)) {
                return dateEnum.simpleDateFormat;
            }
        }
        return DateEnum.yyyy_MM_dd_HH_mm_ss.simpleDateFormat;
    }
	
	public String getDateEnum()
	{
		return dateEnum;
	}
	
	public void setDateEnum(String dateEnum)
	{
		this.dateEnum = dateEnum;
	}

	public SimpleDateFormat getSimpleDateFormat()
	{
		return simpleDateFormat;
	}

	public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat)
	{
		this.simpleDateFormat = simpleDateFormat;
	}
}
