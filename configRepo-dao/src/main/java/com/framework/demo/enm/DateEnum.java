/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.enm;


import com.github.fartherp.framework.common.util.DateUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 日期枚举<code>DateEnum</code>
 * <p>默认使用日期类型<code>yyyy_MM_dd_HH_mm_ss</code></p>
 * @author CK
 *
 */
public enum DateEnum {
	yyyyMMdd(DateUtil.yyyyMMdd, DateUtil.getDateFormat(DateUtil.yyyyMMdd));

	
	private String dateEnum;
	private DateFormat simpleDateFormat;
	private DateEnum(String dateEnum, DateFormat simpleDateFormat) {
		this.dateEnum = dateEnum;
		this.simpleDateFormat = simpleDateFormat;
	}

	
	/**
	 * 通过<code>String</code>获取{@link SimpleDateFormat}
	 * @param formatStr 日期字符串<code>String</code>
	 * @return <code>SimpleDateFormat</code>
	 */
	public static DateFormat getFormatByString(String formatStr) {
        for (DateEnum dateEnum : DateEnum.values()) {
            if (dateEnum.getDateEnum().equals(formatStr)) {
                return dateEnum.simpleDateFormat;
            }
        }
        return DateEnum.yyyyMMdd.simpleDateFormat;
    }
	
	public String getDateEnum()
	{
		return dateEnum;
	}
	
	public void setDateEnum(String dateEnum)
	{
		this.dateEnum = dateEnum;
	}

	public DateFormat getSimpleDateFormat()
	{
		return simpleDateFormat;
	}

	public void setSimpleDateFormat(DateFormat simpleDateFormat)
	{
		this.simpleDateFormat = simpleDateFormat;
	}
}
