package com.framework.demo.sys.sysRoleResourcePermission.dao.impl;

import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;

import dbunit.BaseDbTestCase;

import org.springframework.util.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hassop
 * @Description
 * @date 2016/8/8 0008
 * To change this template use File | Settings | File Templates.
 */

public class SysRoleResourcePermissionDaoImplTest  extends BaseDbTestCase {
  /*  @Resource(name = "sysRoleResourcePermissionDao")
    SysRoleResourcePermissionDao sysRoleResourcePermissionDao;


    @Test
    public void testFindByRoleId() throws Exception {
      *//*  sysRoleResourcePermissionDao = new SysRoleResourcePermissionDaoImpl();*//*
        List<SysRoleResourcePermission> sysRoleResourcePermissions = sysRoleResourcePermissionDao.findByRoleIds(Long.valueOf("1"));
        Assert.isTrue(sysRoleResourcePermissions.size()==4,"lenth is right");
    }*/


}