/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.interceptor;


import com.framework.demo.web.filter.BaseFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * 设置通用数据的Filter
 * <p/>
 * 使用Filter时 文件上传时 getParameter时为null 所以改成Interceptor
 * <p/>
 * 1、ctx---->request.contextPath
 * 2、currentURL---->当前地址
 * <p>User: hyssop
 * <p>Date: 13-1-22 下午4:35
 * <p>Version: 1.0
 */
public class SetCommonDataFilter extends BaseFilter {

    private SetCommonDataInterceptor setCommonDataInterceptor = new SetCommonDataInterceptor();

    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            //使用Filter时 文件上传时 getParameter时为null 所以改成Interceptor
            setCommonDataInterceptor.preHandle(request, response, null);
        } catch (Exception e) {
            throw new ServletException(e);
        }
        chain.doFilter(request, response);
    }

    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
