/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.pageTemplate;


import javax.annotation.Resource;

import com.framework.demo.bo.pageTemplate.PageTemplete;
import com.framework.demo.dao.pageTemplate.PageTempleteDao;
import com.framework.demo.dao.pageTemplate.PageTempleteMapper;
import com.framework.demo.vo.template.SqlPage;
import com.github.fartherp.framework.database.dao.DaoMapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * This class corresponds to the database table `page_templete`
 */
@Repository("pageTempleteDao")
public class PageTempleteDaoImpl extends ConfigurableBaseSqlMapDao<PageTemplete, Integer> implements PageTempleteDao {
    @Autowired
    private PageTempleteMapper pageTempleteMapper;

    @Override
    public DaoMapper<PageTemplete, Integer> getDaoMapper() {
        return pageTempleteMapper;
    }

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }

    @Override
    public PageTemplete selectPg(String model) {
        return pageTempleteMapper.selectPg(model);
    }

    @Override
    public int saveComit(String comitmentarea, Integer model) {
        return pageTempleteMapper.saveComit( comitmentarea,  model);
    }



    @Override
    public List<Map<String, Object>> findPageSql(SqlPage sql) {
        return pageTempleteMapper.findPageSql(sql);
    }

    @Override
    public List<Map<String, Object>> getData(String sql) {
        return pageTempleteMapper.getData(sql);
    }

    @Override
    public int insert(PageTemplete pageTemplete) {
        return pageTempleteMapper.insert(pageTemplete);
    }
}