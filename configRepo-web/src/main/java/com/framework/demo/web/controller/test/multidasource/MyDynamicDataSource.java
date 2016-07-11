package com.framework.demo.web.controller.test.multidasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/6/16 0016
 * To change this template use File | Settings | File Templates.
 */
public class MyDynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceHolder.getDataSourceType();
    }
}
