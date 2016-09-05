/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.framework.demo.service.common;

import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.SearchOperator;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.Searchable;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.filter.SearchFilter;
import cn.vansky.framework.core.orm.mybatis.plugin.search.entity.search.filter.SearchFilterHelper;
import cn.vansky.framework.core.dao.FieldAccessVo;
import cn.vansky.framework.core.dao.SqlMapDao;
import cn.vansky.framework.core.service.GenericSqlMapServiceImpl;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import com.framework.demo.plugin.entity.Treeable;
import com.framework.demo.utils.ReflectUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * <p>User: hyssop
 * <p>Date: 13-2-22 下午5:26
 * <p>Version: 1.0
 */
public abstract class BaseTreeableService<M extends FieldAccessVo & Treeable<ID>, ID extends Serializable>
        extends GenericSqlMapServiceImpl<M, ID> {

    public abstract SqlMapDao<M, ID> getDao();

    protected BaseTreeableService() {
        Class<M> entityClass = ReflectUtils.findParameterizedType(getClass(), 0);

    }


    public M save(M m) {
        if (m.getWeight() == null) {
            m.setWeight(nextWeight(m.getParentId()));
        }
        getDao().saveOrUpdate(m);
        return m;
    }

    @Transactional
    public void deleteSelfAndChild(M m) {
        List<M> ms =getDao().findAll();
        List<M> results = new ArrayList<M>();
        for(M t:ms){
            if(t.getParentId().equals(m.getId())){
                getDao().delete((ID) t.getId());
            }
        }
        getDao().delete((ID) m.getId());
    }

    public void deleteSelfAndChild(List<M> mList) {
        for (M m : mList) {
            deleteSelfAndChild(m);
        }
    }

    public void appendChild(M parent, M child) {
        child.setParentId((ID)parent.getId());
        child.setParentIds(parent.makeSelfAsNewParentIds());
        child.setWeight(nextWeight((ID)parent.getId()));
        save(child);
    }

    public int nextWeight(ID id) {
        return getDao().findById(id).getWeight();
    }


    /**
     * 移动节点
     * 根节点不能移动
     *
     * @param source   源节点
     * @param target   目标节点
     * @param moveType 位置
     */
    public void move(M source, M target, String moveType) {
        if (source == null || target == null || source.isRoot()) { //根节点不能移动
            return;
        }

        //如果是相邻的兄弟 直接交换weight即可
        boolean isSibling = source.getParentId().equals(target.getParentId());
        boolean isNextOrPrevMoveType = "next".equals(moveType) || "prev".equals(moveType);
        if (isSibling && isNextOrPrevMoveType && Math.abs(source.getWeight() - target.getWeight()) == 1) {

            //无需移动
            if ("next".equals(moveType) && source.getWeight() > target.getWeight()) {
                return;
            }
            if ("prev".equals(moveType) && source.getWeight() < target.getWeight()) {
                return;
            }


            int sourceWeight = source.getWeight();
            source.setWeight(target.getWeight());
            target.setWeight(sourceWeight);
            return;
        }

        //移动到目标节点之后
        if ("next".equals(moveType)) {
            List<M> siblings = findSelfAndNextSiblings(target.getParentIds(), target.getWeight());
            siblings.remove(0);//把自己移除

            if (siblings.size() == 0) { //如果没有兄弟了 则直接把源的设置为目标即可
                int nextWeight = nextWeight(target.getParentId());
                updateSelftAndChild(source, target.getParentId(), target.getParentIds(), nextWeight);
                return;
            } else {
                moveType = "prev";
                target = siblings.get(0); //否则，相当于插入到实际目标节点下一个节点之前
            }
        }

        //移动到目标节点之前
        if ("prev".equals(moveType)) {

            List<M> siblings = findSelfAndNextSiblings(target.getParentIds(), target.getWeight());
            //兄弟节点中包含源节点
            if (siblings.contains(source)) {
                // 1 2 [3 source] 4
                siblings = siblings.subList(0, siblings.indexOf(source) + 1);
                int firstWeight = siblings.get(0).getWeight();
                for (int i = 0; i < siblings.size() - 1; i++) {
                    siblings.get(i).setWeight(siblings.get(i + 1).getWeight());
                }
                siblings.get(siblings.size() - 1).setWeight(firstWeight);
            } else {
                // 1 2 3 4  [5 new]
                int nextWeight = nextWeight(target.getParentId());
                int firstWeight = siblings.get(0).getWeight();
                for (int i = 0; i < siblings.size() - 1; i++) {
                    siblings.get(i).setWeight(siblings.get(i + 1).getWeight());
                }
                siblings.get(siblings.size() - 1).setWeight(nextWeight);
                source.setWeight(firstWeight);
                updateSelftAndChild(source, target.getParentId(), target.getParentIds(), source.getWeight());
            }

            return;
        }
        //否则作为最后孩子节点
        int nextWeight = nextWeight((ID)target.getId());
        updateSelftAndChild(source, (ID)target.getId(), target.makeSelfAsNewParentIds(), nextWeight);
    }


    /**
     * 把源节点全部变更为目标节点
     *
     * @param source
     * @param newParentIds
     */
    private void updateSelftAndChild(M source, ID newParentId, String newParentIds, int newWeight) {
        String oldSourceChildrenParentIds = source.makeSelfAsNewParentIds();
        source.setParentId(newParentId);
        source.setParentIds(newParentIds);
        source.setWeight(newWeight);
        getDao().saveOrUpdate(source);
        String newSourceChildrenParentIds = source.makeSelfAsNewParentIds();


    }

    /**
     * 查找目标节点及之后的兄弟  注意：值与越小 越排在前边
     *
     * @param parentIds
     * @param currentWeight
     * @return
     */
    public List<M> findSelfAndNextSiblings(String parentIds, int currentWeight) {
        List<M> result = new ArrayList<M>();
       List<M> all = getDao().findAll();
        for(M part:all){
            if(part.getParentIds().equalsIgnoreCase(parentIds)&& part.getWeight()==currentWeight){
                result.add(part);
            }
        }
        return result;
    }


    /**
     * 查看与name模糊匹配的名称
     *
     * @param name
     * @return
     */
    public Set<String> findNames(Searchable searchable, String name, ID excludeId) throws InvocationTargetException, IllegalAccessException {
        M excludeM = getDao().findById(excludeId);

        searchable.addSearchFilter("name", SearchOperator.like, name);
        addExcludeSearchFilter(searchable, excludeM);

        return Sets.newHashSet(
                Lists.transform(
                        findBySearchable(searchable).getContent(),
                        new Function<M, String>() {
                            @Override
                            public String apply(M input) {
                                return input.getName();
                            }
                        }
                )
        );

    }


    /**
     * 查询子子孙孙
     *
     * @return
     */
    public List<M> findChildren(List<M> parents, Searchable searchable) throws InvocationTargetException, IllegalAccessException {

        if (parents.isEmpty()) {
            return Collections.EMPTY_LIST;
        }

        SearchFilter first = SearchFilterHelper.newCondition("parentIds", SearchOperator.prefixLike, parents.get(0).makeSelfAsNewParentIds());
        SearchFilter[] others = new SearchFilter[parents.size() - 1];
        for (int i = 1; i < parents.size(); i++) {
            others[i - 1] = SearchFilterHelper.newCondition("parentIds", SearchOperator.prefixLike, parents.get(i).makeSelfAsNewParentIds());
        }
        searchable.or(first, others);

        List children =  getDao().findBySearchable(searchable).getContent();
        return children;
    }

    public List<M> findAllByName(Searchable searchable, M excludeM) throws InvocationTargetException, IllegalAccessException {
        addExcludeSearchFilter(searchable, excludeM);
        List list =getDao().findBySearchable(searchable).getContent();
        return list ;
    }

    /**
     * 查找根和一级节点
     *
     * @param searchable
     * @return
     */
    public List<M> findRootAndChild(Searchable searchable) throws InvocationTargetException, IllegalAccessException {
        searchable.addSearchParam("parentId_eq", 0);
        List models = getDao().findBySearchable(searchable).getContent();

        if (models.size() == 0) {
            return models;
        }
        List<ID> ids = Lists.newArrayList();
        for (int i = 0; i < models.size(); i++) {
            ids.add((ID)models.get(i));
        }
        searchable.removeSearchFilter("parentId_eq");
        searchable.addSearchParam("parentId_in", ids);

        models.addAll(getDao().findBySearchable(searchable).getContent());

        return models;
    }

    public Set<ID> findAncestorIds(Iterable<ID> currentIds) {
        Set<ID> parents = Sets.newHashSet();
        for (ID currentId : currentIds) {
            parents.addAll(findAncestorIds(currentId));
        }
        return parents;
    }

    public Set<ID> findAncestorIds(ID currentId) {
        Set ids = Sets.newHashSet();
        M m = getDao().findById(currentId);
        if (m == null) {
            return ids;
        }
        for (String idStr : StringUtils.tokenizeToStringArray(m.getParentIds(), "/")) {
            if (!StringUtils.isEmpty(idStr)) {
                ids.add(Long.valueOf(idStr));
            }
        }
        return ids;
    }

    /**
     * 递归查询祖先
     *
     * @param parentIds
     * @return
     */
    public List<M> findAncestor(String parentIds) throws InvocationTargetException, IllegalAccessException {
        if (StringUtils.isEmpty(parentIds)) {
            return Collections.EMPTY_LIST;
        }
        String[] ids = StringUtils.tokenizeToStringArray(parentIds, "/");
        List results = (List) getDao().findBySearchable(Searchable.newSearchable().addSearchFilter("id", SearchOperator.in, ids));

        return results;
    }


    public void addExcludeSearchFilter(Searchable searchable, M excludeM) {
        if (excludeM == null) {
            return;
        }
        searchable.addSearchFilter("id", SearchOperator.ne, excludeM.getId());
        searchable.addSearchFilter("parentIds", SearchOperator.suffixNotLike, excludeM.makeSelfAsNewParentIds());
    }


}
