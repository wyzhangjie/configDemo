/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysOrganization.bo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import com.framework.demo.plugin.entity.Treeable;

/**
 * This class corresponds to the database table `sys_organization`
 */

@Component("sysOrganization")
public class SysOrganization extends SysOrganizationBase implements Treeable<Long> {
    @Override
    public String makeSelfAsNewParentIds() {
        return getParentIds() + getId() + getSeparator();
    }

    @Override
    public String getSeparator() {
        return "/";
    }

    public Integer getWeight() {
        return super.getWeight();
    }

    public void setWeight(Integer weight) {
        super.setWeight(weight);
    }

    public String getIcon() {
        if (!StringUtils.isEmpty(super.getIcon())) {
            return super.getIcon();
        }
        if (isRoot()) {
            return getRootDefaultIcon();
        }
        if (isLeaf()) {
            return getLeafDefaultIcon();
        }
        return getBranchDefaultIcon();
    }

    public void setIcon(String icon) {
        super.setIcon(icon);
    }


    @Override
    public boolean isRoot() {
        if (getParentId() != null && getParentId() == 0) {
            return true;
        }
        return false;
    }


    @Override
    public boolean isLeaf() {
        if (isRoot()) {
            return false;
        }
        if (isHasChildren()) {
            return false;
        }

        return true;
    }

    public boolean isHasChildren() {
        return false;
    }

    public void setHasChildren(boolean hasChildren) {

    }

    public Boolean getShow() {
        return super.getIsShow();
    }

    public void setShow(Boolean show) {
        super.setIsShow(show);
    }


    /**
     * 根节点默认图标 如果没有默认 空即可
     *
     * @return
     */
    @Override
    public String getRootDefaultIcon() {
        return "ztree_root_open";
    }

    /**
     * 树枝节点默认图标 如果没有默认 空即可
     *
     * @return
     */
    @Override
    public String getBranchDefaultIcon() {
        return "ztree_branch";
    }

    /**
     * 树叶节点默认图标 如果没有默认 空即可
     *
     * @return
     */
    @Override
    public String getLeafDefaultIcon() {
        return "ztree_leaf";
    }
}