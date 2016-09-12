/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.showcaseTree;

import org.apache.commons.lang3.StringUtils;

/**
 * This class corresponds to the database table `showcase_tree`
 */
public class ShowcaseTree extends ShowcaseTreeBase {
    public void setName(String name) {
        super.setName(name);
    }




    public Long getParentId() {
        return super.getParentId() ;
    }

    public void setParentId(Long parentId) {
        super.setParentId(parentId);
    }

    public String getParentIds() {
        return super.getParentIds();
    }

    public void setParentIds(String parentIds) {
        super.setParentIds(parentIds);
    }

    public String makeSelfAsNewParentIds() {
        return getParentIds() + getId() + getSeparator();
    }

    public String getTreetableIds() {
        String selfId = makeSelfAsNewParentIds().replace("/", "-");
        return selfId.substring(0, selfId.length() - 1);
    }

    public String getTreetableParentIds() {
        String parentIds = getParentIds().replace("/", "-");
        return parentIds.substring(0, parentIds.length() - 1);
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
        return super.getParentId()!=null;
    }

    public void setHasChildren(boolean hasChildren) {

    }


    /**
     * 根节点默认图标 如果没有默认 空即可
     *
     * @return
     */

    public String getRootDefaultIcon() {
        return "SimpleZtree_setting";
    }

    /**
     * 树枝节点默认图标 如果没有默认 空即可
     *
     * @return
     */

    public String getBranchDefaultIcon() {
        return "SimpleZtree_folder";
    }

    /**
     * 树叶节点默认图标 如果没有默认 空即可
     *
     * @return
     */

    public String getLeafDefaultIcon() {
        return "SimpleZtree_file";
    }

}