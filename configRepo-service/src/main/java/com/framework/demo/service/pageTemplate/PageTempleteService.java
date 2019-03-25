/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.pageTemplate;

import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.vo.template.SqlPage;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `page_templete`
 */
public interface PageTempleteService extends GenericService<PageTemplete, Integer> {
    public PageTemplete selectPg(String model);
    int saveComit(String comitmentarea, Integer model);

    List<Map<String,Object>> getData(String sql);

    List<Map<String,Object>> findPageSql(SqlPage sql);
    int insert(PageTemplete pageTemplete);


}