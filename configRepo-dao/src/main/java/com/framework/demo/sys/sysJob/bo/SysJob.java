/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.sys.sysJob.bo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * This class corresponds to the database table `sys_job`
 */

@Component("sysJob")
public class SysJob extends SysJobBase {

    public String makeSelfAsNewParentIds() {
        return getParentIds() + getId() + getSeparator();
    }


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


    public void setParentId(Long parentId) {
        super.setParentId(parentId);
    }



    public boolean isRoot() {
        if (getParentId() != null && getParentId() == 0) {
            return true;
        }
        return false;
    }



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

    public String getRootDefaultIcon() {
        return "SimpleZtree_root_open";
    }

    /**
     * 树枝节点默认图标 如果没有默认 空即可
     *
     * @return
     */

    public String getBranchDefaultIcon() {
        return "SimpleZtree_branch";
    }

    /**
     * 树叶节点默认图标 如果没有默认 空即可
     *
     * @return
     */

    public String getLeafDefaultIcon() {
        return "SimpleZtree_leaf";
    }
}