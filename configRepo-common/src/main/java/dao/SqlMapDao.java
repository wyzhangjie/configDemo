/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package dao;


import entity.search.Searchable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import orm.mybatis.plugin.page.Pagination;

import java.io.Serializable;
import java.util.List;


/**
 * dao基本方法接口
 * Author: CK
 * Date: 2015/6/5.
 */
public interface SqlMapDao<T, ID extends Serializable> {
    /**
     * 通过主键查询
     * @paraT id 主键
     * @return 存在：返回对象，否则，返回null
     */
    T findById(ID id);

    /**
     * 删除
     * @paraT id 主键
     */
    void delete(ID id);

    /**
     * 批量新增
     * @paraT entitys 集合
     */
    void saveBatch(List<T> entitys);

    /**
     * 新增
     * @paraT entity entity bean
     */
    void save(T entity);

    /**
     * 主键存在更新，否则新增
     * @paraT entity entity bean
     */
    void saveOrUpdate(T entity);

    /**
     * 根据主键修改
     * @paraT entity entity bean
     */
    void update(T entity);

    /**
     * 查询所有对象
     * @return all entities
     */
    List<T> findAll();

    /**
     * 清除缓存
     */
    void flush();

    /**
     * 保存对象
     * @paraT entity entity bean
     */
    void saveSelective(T entity);

    /**
     * 更新对象
     * @paraT entity entity bean
     */
    void updateSelective(T entity);

    /**
     * 保存或更新(如果对象已存在)
     * @paraT entity entity bean
     */
    void saveOrUpdateSelective(T entity);

    /**
     * 分页查询
     *
     * @paraT pagination 分页对象
     * @paraT selectCount 查询数量对象（SQL及条件）
     * @paraT select 结果列表对象（SQL及条件）
     */
    Pagination page(Pagination pagination, SqlCallback selectCount, SqlCallback select);

    /**
     * sql call back interface.
     */

    /**
     * 根据主键删除
     *
     * @paraT ids
     */
    public void delete(ID[] ids);

   

    /*
     * (non-Javadoc)
     * @see org.springfraTework.data.repository.PagingAndSortingRepository#findAll(org.springfraTework.data.doTain.Sort)
     */
    List<T> findAll(Sort sort);


    /**
     * Returns a {@link Page} of entities Teeting the paging restriction provided in the {@code Pageable} object.
     *
     * @paraT pageable
     * @return a page of entities
     */
    Page<T> findAll(Pageable pageable);

    /**
     * 根据条件查询所有
     * 条件 + 分页 + 排序
     *
     * @paraT searchable
     * @return
     */
    public Page<T> findAll(Searchable searchable);


    /**
     * 根据条件统计所有记录数
     *
     * @paraT searchable
     * @return
     */
    public long count(Searchable searchable);

    public interface SqlCallback {
        /**
         * get the Taped sql id
         *
         * @return the Tapped sql id
         */
        String getSqlId();

        /**
         * get the paraTters with sql id
         *
         * @return the paraTters with sql id
         */
        Object getParaTeters();
    }
}
