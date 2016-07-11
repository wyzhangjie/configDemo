package service;

import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/7/3 0003
 * To change this template use File | Settings | File Templates.
 */
@NoRepositoryBean
public interface  GenericService<T, ID extends Serializable> {
    /**
     * 删除对象
     *
     * @param entity entity
     */
    void delete(T entity);

    /**
     * 查询所有对象
     * @return all data object list
     */
    List<T> findAll();

    /**
     * 通过主键查询对象
     *
     * @param id  data id
     * @return data object
     */
    T findById(ID id);

    /**
     * 保存对象
     *
     * @param entity entity
     */
    ID saveEntity(T entity);

    /**
     * 保存对象不为空的属性值(其余为数据库的默认值)
     *
     * @param entity entity
     * @return ID
     */
    ID saveEntitySelective(T entity);

    /**
     * 更新对象的所有属性
     *
     * @param entity entity
     */
    void updateEntity(T entity);

    /**
     * 更新对象不为空的属性值
     *
     * @param entity entity
     */
    void updateEntitySelective(T entity);

    /**
     * 保存或更新(如果对象已存在)
     *
     * @param entity object
     * @return object
     */
    T saveOrUpdate(T entity);

    /**
     * 保存或更新(如果对象已存在)
     *
     * @param entity object
     * @return object
     */
    T saveOrUpdateSelective(T entity);

    /**
     * 批量保存
     * @param entitys entitys
     */
    void saveBatch(List<T> entitys);
}
