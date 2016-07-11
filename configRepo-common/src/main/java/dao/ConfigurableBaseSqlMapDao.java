/*
 * Copyright (C) 2015 CK, Inc. All Rights Reserved.
 */

package dao;




import orm.mybatis.SqlMapDaoSupport;
import orm.mybatis.plugin.page.Pagination;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2015/6/5.
 */
public abstract class ConfigurableBaseSqlMapDao<T extends cn.vansky.framework.core.dao.FieldAccessVo, ID extends Serializable>
        extends SqlMapDaoSupport {

    public void flush() {
        getSqlSession().clearCache();
    }

    public abstract DaoMapper<T, ID> getDaoMapper();

    public void delete(ID id) {
        getDaoMapper().deleteByPrimaryKey(id);
    }

    public List<T> findAll() {
        return getDaoMapper().selectAll();
    }

    public T findById(ID id) {
        return getDaoMapper().selectByPrimaryKey(id);
    }

    public void save(T entity) {
        getDaoMapper().insert(entity);
    }

    public void saveSelective(T entity) {
        getDaoMapper().insertSelective(entity);
    }

    public void update(T entity) {
        getDaoMapper().updateByPrimaryKey(entity);
    }

    public void updateSelective(T entity) {
        getDaoMapper().updateByPrimaryKeySelective(entity);
    }

    public void saveOrUpdate(T entity) {
        ID id = (ID) entity.getPrimaryKey();
        if (id == null) {
            save(entity);
        } else {
            if (findById(id) != null) {
                update(entity);
            } else {
                save(entity);
            }
        }
    }

    public void saveOrUpdateSelective(T entity) {
        ID id = (ID) entity.getPrimaryKey();
        if (id == null) {
            saveSelective(entity);
        } else {
            if (findById(id) != null) {
                updateSelective(entity);
            } else {
                saveSelective(entity);
            }
        }
    }

    public void saveBatch(List<T> entitys) {
        getDaoMapper().insertBatch(entitys);
    }

    public Pagination page(Pagination pagination, cn.vansky.framework.core.dao.SqlMapDao.SqlCallback selectCount, SqlMapDao.SqlCallback select) {
        int totalCount = (Integer) getSqlSession().selectOne(selectCount.getSqlId(), selectCount.getParameters());

        List dataList = getSqlSession().selectList(select.getSqlId(), select.getParaTeters());
        pagination.init(totalCount, pagination.getLimit(), pagination.getCurrentPage());
        pagination.setRows(dataList);
        return pagination;
    }
}
