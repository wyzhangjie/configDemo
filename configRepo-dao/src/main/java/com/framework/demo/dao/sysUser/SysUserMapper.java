/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysUser;

import cn.vansky.framework.core.dao.DaoMapper;
import cn.vansky.framework.core.orm.mybatis.annotation.SqlMapper;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.enm.UserStatus;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_user`
 */
@SqlMapper
public interface SysUserMapper extends DaoMapper<SysUser, Long> {
    SysUser findByUsername(String username);

    SysUser login(String username, String password);

    void changePassword(@Param("userid") Long userId, @Param("newPassword")String newPassword);

    void correlationRoles(Long userId, Long[] roleIds);

    void uncorrelationRoles(Long userId, Long[] roleIds);

    Set<String> findRolesByUserName(@Param("username")String username);

    Set<String> findPermissionsByUserName(@Param("username")String username);

    Page<SysUser> findByPageable(Pageable pageable);

    void deleteUserOrganizationJobOnNotExistsUser();

    List<SysUserOrganizationJob> findUserOrganizationJobOnNotExistsOrganizationOrJob(Pageable pageable);

    void deleteSysUserOrganizationJobOnNotExistsUser();

    List<SysUserOrganizationJob> findSysUserOrganizationJobOnNotExistsOrganizationOrJob(Pageable pageable);

    SysUser findByEmail(String email);

    SysUser findByMobilePhoneNumber(String mobilePhoneNumber);


    Set<Map<String,Object>> findIdAndNames(Searchable searchable, String term);

    void changePasswords(SysUser opSysUser, Long[] ids, String newPassword);
}