/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.pageTemplate;

import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.vo.template.SqlPage;
import com.github.fartherp.framework.database.dao.DaoMapper;


import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `page_templete`
 */
public interface PageTempleteDao extends DaoMapper<PageTemplete, Integer> {
    public PageTemplete selectPg(String model);
    int saveComit(String comitmentarea, Integer model);

    List<Map<String,Object>> getData(String sql);

    List<Map<String,Object>> findPageSql(SqlPage sql);

    int insert(PageTemplete pageTemplete);


}