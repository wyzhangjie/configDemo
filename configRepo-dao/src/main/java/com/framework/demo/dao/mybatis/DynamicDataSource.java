package com.framework.demo.dao.mybatis;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhjie.zhang on 2019/3/25.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    private Object writeDataSource;//写数据源

    private Object readDataSource;//读数据源

    @Override
    public void afterPropertiesSet(){
        if(this.writeDataSource==null){
            throw new IllegalArgumentException("Property 'witeDataSource' is required");
        }
        setDefaultTargetDataSource(writeDataSource);
        Map<Object,Object> targetDataSource = new HashMap<Object, Object>();
        targetDataSource.put(DynamicDataSourceGlobal.WRITE.name(),writeDataSource);
        targetDataSource.put(DynamicDataSourceGlobal.READ.name(),readDataSource);
        setTargetDataSources(targetDataSource);
        super.afterPropertiesSet();
    }

    @Override
    protected Object determineCurrentLookupKey() {

        DynamicDataSourceGlobal dynamicDataSourceGlobal = DynamicDataSourceHolder.getDataSource();

        if(dynamicDataSourceGlobal == null
                || dynamicDataSourceGlobal == DynamicDataSourceGlobal.WRITE) {
            return DynamicDataSourceGlobal.WRITE.name();
        }

        return DynamicDataSourceGlobal.READ.name();
    }

    public void setWriteDataSource(Object writeDataSource) {
        this.writeDataSource = writeDataSource;
    }

    public Object getWriteDataSource() {
        return writeDataSource;
    }

    public Object getReadDataSource() {
        return readDataSource;
    }

    public void setReadDataSource(Object readDataSource) {
        this.readDataSource = readDataSource;
    }
}
