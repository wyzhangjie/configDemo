/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package dao;

import entity.search.Searchable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * insert、delete、update、select method SQL of XML Mapper file
 * Author: CK
 * Date: 2015/6/5.
 */
public interface DaoMapper<T, ID extends Serializable> {
    /**
     * delete action by primary key
     *
     * @param id
     *            primary key
     * @return delete result. 1 means success
     */
    int deleteByPrimaryKey(ID id);

    /**
     * do insert entity
     *
     * @param record
     *            entity bean to insert
     * @return insert result 1 means success
     */
    int insert(T record);

    /**
     * do insert entity ignore null property
     *
     * @param record
     *            entity bean to insert
     * @return insert result 1 means success
     */
    int insertSelective(T record);

    /**
     * find entity by primary key
     *
     * @param id
     *            primary key
     * @return entity bean
     */
    T selectByPrimaryKey(ID id);

    /**
     * update entity by primary key ignore null property
     *
     * @param record
     *            entity bean
     * @return effective count
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * update entity by primary key
     *
     * @param record
     *            entity bean
     * @return effective count
     */
    int updateByPrimaryKey(T record);

    /**
     * do select count(*) mapped id
     *
     * @return record count
     */
    int count();

    /**
     * find all records
     *
     * @return all records
     */
    List<T> selectAll();
    /**
     * save batch
     */
    void insertBatch(List<T> list);

    /**
     * 根据主键删除
     *
     * @param ids
     */
    public void delete(ID[] ids);

    /*
   * (non-Javadoc)
   * @see org.springframework.data.repository.CrudRepository#findAll()
   */
    List<T> findAll();

    /*
     * (non-Javadoc)
     * @see org.springframework.data.repository.PagingAndSortingRepository#findAll(org.springframework.data.domain.Sort)
     */
    List<T> findAll(Sort sort);


    /**
     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
     *
     * @param pageable
     * @return a page of entities
     */
    Page<T> findAll(Pageable pageable);

    /**
     * 根据条件查询所有
     * 条件 + 分页 + 排序
     *
     * @param searchable
     * @return
     */
    public Page<T> findAll(Searchable searchable);


    /**
     * 根据条件统计所有记录数
     *
     * @param searchable
     * @return
     */
    public long count(Searchable searchable);
}
