/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.pageTemplate;




import javax.annotation.Resource;

import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.dao.pageTemplate.PageTempleteMapper;
import com.framework.demo.service.pageTemplate.PageTempleteService;
import com.framework.demo.vo.template.SqlPage;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `page_templete`
 */
@Service("pageTempleteService")
public class PageTempleteServiceImpl extends GenericSqlMapServiceImpl<PageTemplete, Integer> implements PageTempleteService {
    @Autowired
    private PageTempleteMapper pageTempleteDao;


    public DaoMapper<PageTemplete, Integer> getDao() {
        return pageTempleteDao;
    }


    public PageTemplete selectPg(String model) {
        return pageTempleteDao.selectPg(model);
    }
    public int saveComit(String comitmentarea, Integer model){
        return pageTempleteDao.saveComit(comitmentarea,model);
    }


    public List<Map<String, Object>> getData(String sql) {
        return pageTempleteDao.getData(sql);
    }


    public List<Map<String, Object>> findPageSql(SqlPage sql) {
        return pageTempleteDao.findPageSql(sql);
    }




    public int insert(PageTemplete pageTemplete) {
        return pageTempleteDao.insert(pageTemplete);
    }


}