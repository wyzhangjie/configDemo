package com.framework.demo.vo.template;

import cn.vansky.framework.core.vo.BaseVo;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/6/8 0008
 * To change this template use File | Settings | File Templates.
 */
public class SqlPage extends BaseVo {

    private String sql;

    private Integer page;

    private Integer row;


    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.currentPage =page;
        this.page = page;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.limit = row;
        this.row = row;
    }
}
