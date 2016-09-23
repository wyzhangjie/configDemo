/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.sysUser;

import cn.vansky.framework.core.orm.mybatis.plugin.page.BasePagination;
import cn.vansky.framework.core.orm.mybatis.plugin.page.Pagination;
import cn.vansky.framework.core.orm.mybatis.plugin.search.enums.SearchOperator;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.*;
import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.sysUser.SysUserDao;
import com.framework.demo.enm.UserStatus;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sysuser.SysUserService;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * This class corresponds to the database table `sys_user`
 */
@Service("sysUserService")
public class SysUserServiceImpl extends GenericSqlMapServiceImpl<SysUser, Long> implements SysUserService {
    @Resource(name = "sysUserDao")
    private SysUserDao sysUserDao;

    @Resource(name = "menuService")
    MenuService menuService;

    @Resource(name = "sysAuthService")
    SysAuthService sysAuthService;

    public SqlMapDao<SysUser, Long> getDao() {
        return sysUserDao;
    }


    public SysUser findByUsername(String username) {
        return sysUserDao.findByUsername(username);
    }


    public Set<String> findRoles(String username) {
        return sysUserDao.findRolesByUserName(username);
    }


    public Set<String> findPermissions(String username) {
        return sysUserDao.findPermissionsByUserName(username);
    }


    public Pagination<SysUser> findByPageable(Pagination pageable) throws InvocationTargetException, IllegalAccessException {
        Searchable searchable = new SearchRequest();
        searchable.setPage(pageable);
        return      sysUserDao.findBySearchable(searchable);
    }


    public void deleteUserOrganizationJobOnNotExistsUser() {
        sysUserDao.deleteUserOrganizationJobOnNotExistsUser();

    }


    public BasePagination<SysUserOrganizationJob> findUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable) throws InvocationTargetException, IllegalAccessException {
        Searchable searchable = new SearchRequest();
        searchable.setPage(pageable);
        List<SysUserOrganizationJob>sysUserOrganizationJobs = sysUserDao.findUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);
        return  new BasePagination(sysUserOrganizationJobs,sysUserOrganizationJobs.size());
    }


    public void deleteSysUserOrganizationJobOnNotExistsUser() {
        sysUserDao.deleteSysUserOrganizationJobOnNotExistsUser();
    }


    public BasePagination<SysUserOrganizationJob> findSysUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable) {

        Searchable searchable = new SearchRequest();
        searchable.setPage(pageable);
        List<SysUserOrganizationJob> sysUserOrganizationJobs = sysUserDao.findSysUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);
        return new BasePagination(sysUserOrganizationJobs,sysUserOrganizationJobs.size());


    }


    public SysUser findByEmail(String email) {
        return sysUserDao.findByEmail(email);
    }


    public SysUser findByMobilePhoneNumber(String mobilePhoneNumber) {
        return sysUserDao.findByMobilePhoneNumber(mobilePhoneNumber);
    }


    public void changeStatus(SysUser opSysUser, Long[] ids, UserStatus newStatus, String reason) {
        for(Long id :ids){
            SysUser user = sysUserDao.findById(id);
            user.setStatus(newStatus.getInfo());
            sysUserDao.saveOrUpdate(user);
        }

    }


    public Set<Map<String, Object>> findIdAndNames(Searchable searchable, String term) throws InvocationTargetException, IllegalAccessException {
        return Sets.newHashSet(
                Lists.transform(
                        findBySearchable(searchable).getRows(),
                        new Function<SysUser, Map<String, Object>>() {

                            public Map<String, Object> apply(SysUser input) {
                                Map<String, Object> data = Maps.newHashMap();
                                data.put("label", input.getUsername());
                                data.put("value", input.getId());
                                return data;
                            }
                        }
                )
        );
    }


    public void changePasswords(SysUser opSysUser, Long[] ids, String newPassword) {
        for(Long id:ids){
            SysUser user = sysUserDao.findById(id);
            user.setPassword(newPassword);
            sysUserDao.saveOrUpdate(user);
        }
    }




    public SysUser login(String username, String password) {
        return sysUserDao.login(username,password);
    }


    public void createUser(SysUser user) {
         sysUserDao.save(user);
    }


    public void changePassword(Long userId, String newPassword) {
        sysUserDao.changePassword(userId,newPassword);
    }


    public void correlationRoles(Long userId, Long... roleIds) {
        sysUserDao.correlationRoles(userId,roleIds);
    }


    public void uncorrelationRoles(Long userId, Long... roleIds) {
        sysUserDao.uncorrelationRoles(userId,roleIds);
    }
}