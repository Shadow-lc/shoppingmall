package com.yisen.shoppingmall.commons.page;

import java.util.List;

public class Page<T> {
    private int pageNumber;
    private int pageSize;
    private int total;
    private List<T> rows;

    private int pageCount;
    private int next;
    private int pre;
    private int start;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getPageCount() {
        pageCount = (total + pageSize - 1) / pageSize;
        return pageCount;
    }

    public int getNext() {
        if (pageNumber < getPageCount()) {
            next = pageNumber + 1;
        } else {
            next = getPageCount();
        }
        return next;
    }

    public int getPre() {
        if (pageNumber > 1) {
            pre = pageNumber - 1;
        } else {
            pre = 1;
        }
        return pre;
    }

    public int getStart() {
        start = (pageNumber - 1) * pageSize;
        return start;
    }
}
