/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.impl.sysUser;

import cn.vansky.framework.core.dao.ConfigurableBaseSqlMapDao;
import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.plugin.page.Pagination;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.dao.sysUser.SysUserDao;
import com.framework.demo.dao.sysUser.SysUserMapper;
import com.framework.demo.enm.UserStatus;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_user`
 */
@Repository("sysUserDao")
public class SysUserDaoImpl extends ConfigurableBaseSqlMapDao<SysUser, Long> implements SysUserDao {
    @Autowired
    private SysUserMapper sysUserMapper;


    public DaoMapper<SysUser, Long> getDaoMapper() {
        return sysUserMapper;
    }

    @Resource(name = "sqlSessionFactory")

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        setSqlSessionFactoryInternal(sqlSessionFactory);
    }


    public SysUser findByUsername(String username) {
        return sysUserMapper.findByUsername(username);
    }


    public SysUser login(String username, String password) {
        return sysUserMapper.login(username,password);
    }


    public void changePassword(Long userId, String newPassword) {
        sysUserMapper.changePassword(userId,newPassword);
    }


    public void correlationRoles(Long userId, Long[] roleIds) {
        sysUserMapper.correlationRoles(userId,roleIds);
    }


    public void uncorrelationRoles(Long userId, Long[] roleIds) {
        sysUserMapper.uncorrelationRoles(userId,roleIds);
    }


    public Set<String> findRolesByUserName(String username) {
        return sysUserMapper.findRolesByUserName(username);
    }


    public Set<String> findPermissionsByUserName(String username) {
        return sysUserMapper.findPermissionsByUserName(username);
    }


    public Pagination<SysUser> findByPageable(Pagination pageable) {
        return sysUserMapper.findByPageable(pageable);
    }


    public void deleteUserOrganizationJobOnNotExistsUser() {
        sysUserMapper.deleteUserOrganizationJobOnNotExistsUser();
    }


    public List<SysUserOrganizationJob> findUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable) {
        return sysUserMapper.findUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);
    }


    public void deleteSysUserOrganizationJobOnNotExistsUser() {
        sysUserMapper.deleteSysUserOrganizationJobOnNotExistsUser();
    }


    public List<SysUserOrganizationJob> findSysUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable) {


        return sysUserMapper.findSysUserOrganizationJobOnNotExistsOrganizationOrJob(pageable);
    }


    public SysUser findByEmail(String email) {
        return sysUserMapper.findByEmail(email);
    }


    public SysUser findByMobilePhoneNumber(String mobilePhoneNumber) {
        return sysUserMapper.findByMobilePhoneNumber(mobilePhoneNumber);
    }


    public Set<Map<String, Object>> findIdAndNames(Searchable searchable, String term) {
        return sysUserMapper.findIdAndNames(searchable,term);
    }


    public void changePasswords(SysUser opSysUser, Long[] ids, String newPassword) {
        sysUserMapper.changePasswords(opSysUser,ids,newPassword);
    }
}