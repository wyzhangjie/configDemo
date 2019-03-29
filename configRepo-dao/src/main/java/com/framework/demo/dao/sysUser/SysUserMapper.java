/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysUser;

import com.framework.demo.bo.sysUser.SysUser;
import com.github.fartherp.framework.database.dao.DaoMapper;
import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_user`
 */
@Mapper
public interface SysUserMapper extends DaoMapper<SysUser, Long> {
    SysUser findByUsername(String username);

    SysUser login(String username, String password);

    void changePassword(@Param("userid") Long userId, @Param("newPassword")String newPassword);

    void correlationRoles(Long userId, Long[] roleIds);

    void uncorrelationRoles(Long userId, Long[] roleIds);

    Set<String> findRolesByUserName(@Param("username")String username);

    Set<String> findPermissionsByUserName(@Param("username")String username);

    Pagination<SysUser> findByPageable(Pagination pageable);

    SysUser findByEmail(String email);

    SysUser findByMobilePhoneNumber(String mobilePhoneNumber);


    Set<Map<String,Object>> findIdAndNames(Searchable searchable, String term);

    void changePasswords(SysUser opSysUser, Long[] ids, String newPassword);

    Pagination<SysUser> findBySearchable(Searchable searchable);

    SysUser findById(Long id);


    void deleteSysUserOrganizationJobOnNotExistsUser();
}