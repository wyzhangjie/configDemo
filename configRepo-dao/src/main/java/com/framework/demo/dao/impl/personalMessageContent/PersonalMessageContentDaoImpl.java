/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.personalMessageContent;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import javax.annotation.Resource;

import com.framework.demo.bo.personalMessageContent.PersonalMessageContent;
import com.framework.demo.dao.personalMessageContent.PersonalMessageContentDao;
import com.framework.demo.dao.personalMessageContent.PersonalMessageContentMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This class corresponds to the database table `personal_message_content`
 */
@Repository("personalMessageContentDao")
public class PersonalMessageContentDaoImpl extends ConfigurableBaseSqlMapDao<PersonalMessageContent, Long> implements PersonalMessageContentDao {
    @Autowired
    private PersonalMessageContentMapper personalMessageContentMapper;

    public DaoMapper<PersonalMessageContent, Long> getDaoMapper() {
        return personalMessageContentMapper;
    }

    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }
}