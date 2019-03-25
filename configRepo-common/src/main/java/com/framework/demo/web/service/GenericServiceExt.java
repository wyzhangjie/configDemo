package com.framework.demo.web.service;

import com.github.fartherp.framework.database.mybatis.plugin.page.Pagination;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Searchable;
import com.github.fartherp.framework.database.mybatis.plugin.search.vo.Sort;
import com.github.fartherp.framework.database.service.GenericService;

import java.util.List;

/**
 * Created by zhjie.zhang on 2019/3/25.
 */
public interface GenericServiceExt<T, ID> extends GenericService {
    Pagination<T> findBySearchable(Searchable searchable);

    List<T> findBySort(Sort sort);

    long countBySearchable(Searchable searchable);
}
