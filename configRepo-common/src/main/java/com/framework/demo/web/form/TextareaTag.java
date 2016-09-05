/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.web.form;

import org.springframework.web.servlet.support.BindStatus;
import com.framework.demo.web.form.bind.SearchBindStatus;

import javax.servlet.jsp.JspException;

/**
 * 取值时
 * 1、先取parameter
 * 2、如果找不到再找attribute (page--->request--->session--->application)
 * <p>User: hyssop
 * <p>Date: 13-3-28 下午3:11
 * <p>Version: 1.0
 */
public class TextareaTag extends org.springframework.web.servlet.tags.form.TextareaTag {


    private BindStatus bindStatus = null;

    @Override
    protected BindStatus getBindStatus() throws JspException {
        if (this.bindStatus == null) {
            this.bindStatus = SearchBindStatus.create(pageContext, getName(), getRequestContext(), false);
        }
        return this.bindStatus;
    }


    @Override
    protected String getPropertyPath() throws JspException {
        return getPath();
    }


    @Override
    public void doFinally() {
        super.doFinally();
        this.bindStatus = null;
    }

}
