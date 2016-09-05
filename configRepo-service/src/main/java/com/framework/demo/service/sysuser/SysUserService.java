/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sysuser;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.service.GenericService;
import com.framework.demo.bo.menu.Menu;
import com.framework.demo.bo.sysUser.SysUser;
import com.framework.demo.enm.UserStatus;
import com.framework.demo.sys.sysUserOrganizationJob.bo.SysUserOrganizationJob;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class corresponds to the database table `sys_user`
 */
public interface SysUserService extends GenericService<SysUser, Long> {

    SysUser login(String username, String password);
    public void createUser(SysUser user); //创建账户
    public void changePassword(Long userId, String newPassword);//修改密码
    public void correlationRoles(Long userId, Long... roleIds); //添加用户-角色关系
    public void uncorrelationRoles(Long userId, Long... roleIds);// 移除用户-角色关系
    public SysUser findByUsername(String username);// 根据用户名查找用户
    public Set<String> findRoles(String username);// 根据用户名查找其角色
    public Set<String> findPermissions(String username); //根据用户名查找其权限

    Page<SysUser> findByPageable(Pageable pageable) throws InvocationTargetException, IllegalAccessException;

    void deleteUserOrganizationJobOnNotExistsUser();

    Page<SysUserOrganizationJob> findUserOrganizationJobOnNotExistsOrganizationOrJob(Pageable pageable) throws InvocationTargetException, IllegalAccessException;

    void deleteSysUserOrganizationJobOnNotExistsUser();

    Page<SysUserOrganizationJob> findSysUserOrganizationJobOnNotExistsOrganizationOrJob(Pageable pageable);

    SysUser findByEmail(String email);

    SysUser findByMobilePhoneNumber(String mobilePhoneNumber);

    void changeStatus(SysUser opSysUser, Long[] ids, UserStatus newStatus, String reason);

    Set<Map<String,Object>> findIdAndNames(Searchable searchable, String term) throws InvocationTargetException, IllegalAccessException;

    void changePasswords(SysUser opSysUser, Long[] ids, String newPassword);

}