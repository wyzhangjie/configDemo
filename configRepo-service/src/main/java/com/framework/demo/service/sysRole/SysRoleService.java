/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.service.sysRole;

import com.github.fartherp.framework.database.service.GenericService;
import com.framework.demo.bo.sysRole.SysRole;
import com.framework.demo.bo.sysUser.SysUser;

import java.util.Set;

/**
 * This class corresponds to the database table `sys_role`
 */
public interface SysRoleService extends GenericService<SysRole, Long> {
     Set<SysRole> findRoles(SysUser user);
     public  void  createRole(SysRole  role);
     public   void     deleteRole(Long roleId);
     //添加角色-权限之间关系          
     public  void     correlationPermissions(Long  roleId,  Long...  permissionIds);
     //移除角色-权限之间关系          
     public  void     uncorrelationPermissions(Long  roleId, Long...  permissionIds);//

}