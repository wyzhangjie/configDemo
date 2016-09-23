/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.dao.sysUser;

import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.orm.mybatis.plugin.page.Pagination;
import cn.vansky.framework.core.orm.mybatis.plugin.search.vo.Searchable;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.enm.UserStatus;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_user`
 */
public interface SysUserDao extends SqlMapDao<SysUser, Long> {
    SysUser findByUsername(String username);

    SysUser login(String username, String password);

    void changePassword(Long userId, String newPassword);

    void correlationRoles(Long userId, Long[] roleIds);

    void uncorrelationRoles(Long userId, Long[] roleIds);

    Set<String> findRolesByUserName(String username);

    Set<String> findPermissionsByUserName(String username);

    Pagination<SysUser> findByPageable(Pagination pageable);

    void deleteUserOrganizationJobOnNotExistsUser();

    List<SysUserOrganizationJob> findUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable);

    void deleteSysUserOrganizationJobOnNotExistsUser();

    List<SysUserOrganizationJob> findSysUserOrganizationJobOnNotExistsOrganizationOrJob(Pagination pageable);

    SysUser findByEmail(@Param("email")String email);

    SysUser findByMobilePhoneNumber(String mobilePhoneNumber);


    Set<Map<String,Object>> findIdAndNames(Searchable searchable, String term);

    void changePasswords(SysUser opSysUser, Long[] ids, String newPassword);
}