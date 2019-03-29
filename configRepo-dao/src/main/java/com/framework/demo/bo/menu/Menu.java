/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.framework.demo.bo.menu;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * This class corresponds to the database table `menu`
 */

@Component("menu")
public class Menu extends MenuBase implements Treeable<Long> {
    public void setName(String name) {
        super.setName(name);
    }



    public void setIdentity(String identity) {
        super.setIdentity(identity);
    }

    public String getUrl() {
        return super.getPath();
    }

    public void setUrl(String url) {
        super.setPath(url);
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

    @Override
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
        return super.getParentId()!=null;
    }

    public void setHasChildren(boolean hasChildren) {

    }

    public Boolean getShow() {
        return super.getStatus()!=null;
    }

    public void setShow(Boolean show) {
        super.setStatus(show.booleanValue()==true?"1":"0");
    }


    /**
     * 根节点默认图标 如果没有默认 空即可
     *
     * @return
     */
    @Override
    public String getRootDefaultIcon() {
        return "ztree_setting";
    }

    /**
     * 树枝节点默认图标 如果没有默认 空即可
     *
     * @return
     */
    @Override
    public String getBranchDefaultIcon() {
        return "ztree_folder";
    }

    /**
     * 树叶节点默认图标 如果没有默认 空即可
     *
     * @return
     */
    @Override
    public String getLeafDefaultIcon() {
        return "ztree_file";
    }

}