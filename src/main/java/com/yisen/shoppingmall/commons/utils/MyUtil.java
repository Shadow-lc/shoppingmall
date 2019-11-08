package com.yisen.shoppingmall.commons.utils;

import com.github.pagehelper.PageInfo;
import com.yisen.shoppingmall.commons.page.Page;

public class MyUtil {
    private MyUtil() {}
//111
    public static void setPage(Page page, PageInfo info) {
        page.setPageNumber(info.getPageNum());
        page.setPageSize(info.getPageSize());
        page.setRows(info.getList());
        page.setTotal(((Long)info.getTotal()).intValue());
    }
}
