package com.framework.demo.web.controller.permission;

import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.service.GenericService;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author hassop
 * @Description
 * @date 2016/8/6 0006
 * To change this template use File | Settings | File Templates.
 */
 public abstract  class  GenericTreeService<T, ID extends Serializable>  implements GenericService {

  abstract   <M extends Treeable> List<M> findAllByName(Searchable searchable, Object o);

    abstract  <M extends Treeable> List<M> findChildren(List<T> models, Searchable searchable);

    abstract <M extends Treeable> List<M> findAllWithSort(Searchable searchable);

    abstract <M extends Treeable> List<M> findRootAndChild(Searchable searchable);



    abstract <M extends Treeable> List<M> findAllWithNoPageNoSort(Searchable searchable);

    abstract void appendChild(T parent, T child);

    abstract Set<String> findNames(Searchable searchable, String term, ID excludeId);

    abstract  void move(T source, T target, String moveType);

    abstract  void addExcludeSearchFilter(Searchable searchable, T excludeM);

    abstract void deleteSelfAndChildBatch(List<T> mList);

    abstract  void deleteSelfAndChild(T m);
}
