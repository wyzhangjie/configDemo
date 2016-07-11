package com.framework.demo.web.controller.test.multidasource;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/6/16 0016
 * To change this template use File | Settings | File Templates.
 */
public class DynamicDataSourceHolder {
    // 线程本地环境
    private static final ThreadLocal<DynamicDataSourceGlobal> contextHolder = new ThreadLocal<DynamicDataSourceGlobal>();

    // 设置数据源类型
    public static void setDataSourceType(DynamicDataSourceGlobal dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    // 获取数据源类型
    public static DynamicDataSourceGlobal getDataSourceType() {
        return (DynamicDataSourceGlobal) contextHolder.get();
    }

    // 清除数据源类型
    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}
