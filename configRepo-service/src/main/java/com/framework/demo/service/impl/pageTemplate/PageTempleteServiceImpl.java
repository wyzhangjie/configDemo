/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.pageTemplate;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;

import javax.annotation.Resource;

import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.bo.sysTemplColr.SysTemplColr;
import com.framework.demo.dao.pageTemplate.PageTempleteDao;
import com.framework.demo.service.pageTemplate.PageTempleteService;
import com.framework.demo.vo.template.SqlPage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `page_templete`
 */
@Service("pageTempleteService")
public class PageTempleteServiceImpl extends GenericSqlMapServiceImpl<PageTemplete, Integer> implements PageTempleteService {
    @Resource(name = "pageTempleteDao")
    private PageTempleteDao pageTempleteDao;

    @Override
    public SqlMapDao<PageTemplete, Integer> getDao() {
        return pageTempleteDao;
    }

    @Override
    public PageTemplete selectPg(String model) {
        return pageTempleteDao.selectPg(model);
    }
    public int saveComit(String comitmentarea, Integer model){
        return pageTempleteDao.saveComit(comitmentarea,model);
    }

    @Override
    public List<Map<String, Object>> getData(String sql) {
        return pageTempleteDao.getData(sql);
    }

    @Override
    public List<Map<String, Object>> findPageSql(SqlPage sql) {
        return pageTempleteDao.findPageSql(sql);
    }



    @Override
    public int insert(PageTemplete pageTemplete) {
        return pageTempleteDao.insert(pageTemplete);
    }


}