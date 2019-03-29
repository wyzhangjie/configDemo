/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.impl.sysUser;


import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.sysUser.SysUserMapper;
import com.framework.demo.enm.UserStatus;
import com.framework.demo.service.menu.MenuService;
import com.framework.demo.service.sys.sysAuth.service.SysAuthService;
import com.framework.demo.service.sysuser.SysUserService;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.BasePagination;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.SearchRequest;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.impl.GenericSqlMapServiceImpl;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * This class corresponds to the database table `sys_user`
 */
@Service("sysUserService")
public class SysUserServiceImpl extends GenericSqlMapServiceImpl<SysUser, Long> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserDao;

    @Resource(name = "menuService")
    MenuService menuService;

    @Resource(name = "sysAuthService")
    SysAuthService sysAuthService;

    public DaoMapper<SysUser, Long> getDao() {
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

    @Override
    public void deleteSysUserOrganizationJobOnNotExistsUser() {
              sysUserDao.deleteBatch(new Long[]{Long.parseLong("1111"),Long.parseLong("1111"),Long.parseLong("1111")});

    }




  /*  public BasePagination<sysUserOrganizationJob> findsysUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable) throws InvocationTargetException, IllegalAccessException {
        Searchable searchable = new SearchRequest();
        searchable.setPage(pageable);
        List<sysUserOrganizationJob>sysUserOrganizationJobs = sysUserDao.findsysUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);
        return  new BasePagination(sysUserOrganizationJobs,sysUserOrganizationJobs.size());
    }


    public void deletesysUserOrganizationJobOnNotExistsUser() {
        sysUserDao.deletesysUserOrganizationJobOnNotExistsUser();
    }


    public BasePagination<sysUserOrganizationJob> findsysUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable) {

        Searchable searchable = new SearchRequest();
        searchable.setPage(pageable);
        List<sysUserOrganizationJob> sysUserOrganizationJobs = sysUserDao.findsysUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);
        return new BasePagination(sysUserOrganizationJobs,sysUserOrganizationJobs.size());


    }
*/

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
            sysUserDao.insert(user);
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

    private Pagination findBySearchable(Searchable searchable) {
        return sysUserDao.findBySearchable(searchable);
    }


    public void changePasswords(SysUser opSysUser, Long[] ids, String newPassword) {
        for(Long id:ids){
            SysUser user = sysUserDao.findById(id);
            user.setPassword(newPassword);
            sysUserDao.insertSelective(user);
        }
    }




    public SysUser login(String username, String password) {
        return sysUserDao.login(username,password);
    }


    public void createUser(SysUser user) {
         sysUserDao.insert(user);
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