/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.RoleMenu;


import com.github.fartherp.framework.database.dao.FieldAccessVo;
import com.github.fartherp.framework.database.dao.annotation.ColumnDescription;
import com.github.fartherp.framework.database.dao.annotation.Id;

/**
 * This class corresponds to the database table `sys_role_menu`
 */
public abstract class SysRoleMenuBase extends FieldAccessVo  {
    /**
     * This field corresponds to the database column `sys_role_menu`.id
     */
    private static final String PROPERTY_ID = "id";

    /**
     * This field corresponds to the database column `sys_role_menu`.id
     */
    private static final String PROPERTY_REMARK_ID = "id";

    /**
     * This field corresponds to the database column `sys_role_menu`.id
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ID)
    @Id
    private Integer id;

    /**
     * This field corresponds to the database column `sys_role_menu`.roleid
     */
    private static final String PROPERTY_ROLEID = "roleid";

    /**
     * This field corresponds to the database column `sys_role_menu`.roleid
     */
    private static final String PROPERTY_REMARK_ROLEID = "角色id";

    /**
     * This field corresponds to the database column `sys_role_menu`.roleid
     */
    @ColumnDescription(desc = PROPERTY_REMARK_ROLEID)
    private Integer roleid;

    /**
     * This field corresponds to the database column `sys_role_menu`.menuid
     */
    private static final String PROPERTY_MENUID = "menuid";

    /**
     * This field corresponds to the database column `sys_role_menu`.menuid
     */
    private static final String PROPERTY_REMARK_MENUID = "菜单id";

    /**
     * This field corresponds to the database column `sys_role_menu`.menuid
     */
    @ColumnDescription(desc = PROPERTY_REMARK_MENUID)
    private String menuid;

    /**
     * This method returns the value of the database column `sys_role_menu`.id
     *
     * @return the value of `sys_role_menu`.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column `sys_role_menu`.id
     *
     * @param id the value for `sys_role_menu`.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column `sys_role_menu`.roleid
     *
     * @return the value of `sys_role_menu`.roleid
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method sets the value of the database column `sys_role_menu`.roleid
     *
     * @param roleid the value for `sys_role_menu`.roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method returns the value of the database column `sys_role_menu`.menuid
     *
     * @return the value of `sys_role_menu`.menuid
     */
    public String getMenuid() {
        return menuid;
    }

    /**
     * This method sets the value of the database column `sys_role_menu`.menuid
     *
     * @param menuid the value for `sys_role_menu`.menuid
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }


}