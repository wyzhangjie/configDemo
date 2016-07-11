package com.framework.demo.vo.template;

/**
 * @author zhangjie@qianbao.com
 * @Description
 * @date 2016/6/14 0014
 * To change this template use File | Settings | File Templates.
 */
public class Pagination {
    private int total;
    private int pageSize;
    private int pageNumber;
    private Object[] pageList;



    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Object[] getPageList() {
        return pageList;
    }

    public void setPageList(Object[] pageList) {
        this.pageList = pageList;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
