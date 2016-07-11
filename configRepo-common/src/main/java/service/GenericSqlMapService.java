package service;


import cn.vansky.framework.core.service.*;
import cn.vansky.framework.core.service.GenericService;
import dao.FieldAccessVo;
import dao.SqlMapDao;
import entity.search.Searchable;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/3 0003
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericSqlMapService<T extends FieldAccessVo, ID extends Serializable>
        implements GenericService<T, ID> {

    public abstract SqlMapDao<T, ID> getDao();

    public void delete(T entity) {
        Assert.notNull(entity, "delete failed due to entity is null");
        getDao().delete((ID) entity.getPrimaryKey());
    }

    public List<T> findAll() {
        return getDao().findAll();
    }

    public T findById(ID id) {
        return getDao().findById(id);
    }

    public ID saveEntity(T entity) {
        Assert.notNull(entity, "save entity failed due to entity is null");
        getDao().save(entity);
        return (ID) entity.getPrimaryKey();
    }

    public ID saveEntitySelective(T entity) {
        Assert.notNull(entity, "save entity failed due to entity is null");
        getDao().saveSelective(entity);
        return (ID) entity.getPrimaryKey();
    }

    public void updateEntity(T entity) {
        Assert.notNull(entity, "update entity failed due to entity is null");
        getDao().update(entity);
    }

    public void updateEntitySelective(T entity) {
        Assert.notNull(entity, "update entity failed due to entity is null");
        getDao().updateSelective(entity);
    }

    public T saveOrUpdate(T entity) {
        Assert.notNull(entity, "save or update entity failed due to entity is null");
        getDao().saveOrUpdate(entity);
        return entity;
    }

    public T saveOrUpdateSelective(T entity) {
        Assert.notNull(entity, "save or update entity failed due to entity is null");
        getDao().saveOrUpdateSelective(entity);
        return entity;
    }

    public void saveBatch(List<T> entitys) {
        Assert.notNull(entitys, "saveBatch entitys failed due to entitys is null");
        getDao().saveBatch(entitys);
    }

    public Page<T> findAll(Searchable searchable) {
        Assert.notNull(searchable, "findAll entitys failed due to entitys is null");
       return getDao().findAll(searchable);

    }

    public void save(T m) {
        Assert.notNull(m, "save entitys failed due to entitys is null");
        getDao().save(m);
    }

    public void update(T m) {
        Assert.notNull(m, "update entitys failed due to entitys is null");
        getDao().update(m);
    }

    public void delete(ID[] ids) {
        Assert.notNull(ids, "update entitys failed due to entitys is null");
        getDao().delete(ids);
    }
}