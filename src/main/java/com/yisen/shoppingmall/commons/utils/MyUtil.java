package com.yisen.shoppingmall.commons.utils;

import com.github.pagehelper.PageInfo;
import com.yisen.shoppingmall.commons.page.Page;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    private MyUtil() {
    }

    public static void setPage(Page page, PageInfo info) {
        page.setPageNumber(info.getPageNum());
        page.setPageSize(info.getPageSize());
        page.setRows(info.getList());
        page.setTotal(((Long) info.getTotal()).intValue());
    }

    public static String createGoodsNumber(int categoryId, int count) {
        StringBuilder head = new StringBuilder(String.valueOf(categoryId));
        StringBuilder foot = new StringBuilder(String.valueOf(count + 1));
        while (head.length() < 3) {
            head.append("0");
        }
        while (foot.length() < 3) {
            foot.insert(0, "0");
        }
        return head.toString() + foot.toString();
    }

    public static String creatOrdersNumber() {
        String head = getCurrentDate();
        return head + createRandomCode();
    }

    private static String createRandomCode() {
        StringBuilder code = new StringBuilder();
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 5; i++) {
            code.append(str.charAt((int) (Math.random() * str.length())));
        }
        return code.toString();
    }

    public static String getCurrentDate() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
    }
}
