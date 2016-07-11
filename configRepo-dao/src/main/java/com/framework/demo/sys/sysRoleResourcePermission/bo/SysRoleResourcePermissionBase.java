/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysRoleResourcePermission.bo;

import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.TableDataConvertable;
import cn.vansky.framework.core.dao.annotation.ColumnDescription;
import cn.vansky.framework.core.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_role_resource_permission`
 */
public abstract class SysRoleResourcePermissionBase extends FieldAccessVo implements TableDataConvertable {
    /**
     * This field corresponds to the database column `sys_role_resource_permission`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.id
     */
    private static final String PROPERTY_REMARK_ID = "";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Long id;

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.role_id
     */
    private static final String PROPERTY_ROLEID = "roleId";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.role_id
     */
    private static final String PROPERTY_REMARK_ROLEID = "";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.role_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ROLEID)
    private Long roleId;

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.resource_id
     */
    private static final String PROPERTY_RESOURCEID = "resourceId";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.resource_id
     */
    private static final String PROPERTY_REMARK_RESOURCEID = "";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.resource_id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_RESOURCEID)
    private Long resourceId;

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.permission_ids
     */
    private static final String PROPERTY_PERMISSIONIDS = "permissionIds";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.permission_ids
     */
    private static final String PROPERTY_REMARK_PERMISSIONIDS = "";

    /**
     * This field corresponds to the database column `sys_role_resource_permission`.permission_ids
     */
    @ColumnDescription(desc = PROPERTY_REMARK_PERMISSIONIDS)
    private String permissionIds;

    /**
     * This method returns the value of the database column `sys_role_resource_permission`.id
     *
     * @return the value of `sys_role_resource_permission`.id
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_role_resource_permission`.id
     *
     * @param id the value for `sys_role_resource_permission`.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_role_resource_permission`.role_id
     *
     * @return the value of `sys_role_resource_permission`.role_id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method sets the value of the database column `sys_role_resource_permission`.role_id
     *
     * @param roleId the value for `sys_role_resource_permission`.role_id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method returns the value of the database column `sys_role_resource_permission`.resource_id
     *
     * @return the value of `sys_role_resource_permission`.resource_id
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * This method sets the value of the database column `sys_role_resource_permission`.resource_id
     *
     * @param resourceId the value for `sys_role_resource_permission`.resource_id
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * This method returns the value of the database column `sys_role_resource_permission`.permission_ids
     *
     * @return the value of `sys_role_resource_permission`.permission_ids
     */
    public String getPermissionIds() {
        return permissionIds;
    }

    /**
     * This method sets the value of the database column `sys_role_resource_permission`.permission_ids
     *
     * @param permissionIds the value for `sys_role_resource_permission`.permission_ids
     */
    public void setPermissionIds(String permissionIds) {
        this.permissionIds = permissionIds;
    }
}