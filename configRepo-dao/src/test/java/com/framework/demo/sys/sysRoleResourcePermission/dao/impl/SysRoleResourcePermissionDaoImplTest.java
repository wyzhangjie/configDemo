package com.framework.demo.sys.sysRoleResourcePermission.dao.impl;

import cn.vansky.framework.core.bean.ServiceLocator;
import cn.vansky.framework.core.util.SpringUtils;
import com.framework.demo.sys.sysRoleResourcePermission.bo.SysRoleResourcePermission;
import com.framework.demo.sys.sysRoleResourcePermission.dao.SysRoleResourcePermissionDao;
import dbunit.BaseDbTestCase;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.testng.annotations.BeforeClass;
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
    @Resource(name = "sysRoleResourcePermissionDao")
    SysRoleResourcePermissionDao sysRoleResourcePermissionDao;


    @Test
    public void testFindByRoleId() throws Exception {
      /*  sysRoleResourcePermissionDao = new SysRoleResourcePermissionDaoImpl();*/
        List<SysRoleResourcePermission> sysRoleResourcePermissions = sysRoleResourcePermissionDao.findByRoleIds(Long.valueOf("1"));
        Assert.isTrue(sysRoleResourcePermissions.size()==4,"lenth is right");
    }


}