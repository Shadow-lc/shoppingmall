package com.yisen.shoppingmall.showgoods.goods.web;


import com.yisen.shoppingmall.showgoods.goods.entity.Category;
import com.yisen.shoppingmall.showgoods.goods.service.CategoryService;
import com.yisen.shoppingmall.showgoods.goods.service.impl.CategoryServiceImpl;

import java.io.File;
import java.util.List;

public class CategoryAction {
    private List<Category> categories;
    private String name;
    private int category;
    private String describe;
    private File pic;
    private String picFileName;

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public void setPicFileName(String picFileName) {
        this.picFileName = picFileName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public String queryAllCategory() {
        CategoryService service = new CategoryServiceImpl();
        categories = service.queryCategorys();
        return "queryAllCategory_success";
    }

    public String queryParent() {
        CategoryService service = new CategoryServiceImpl();
        categories = service.queryParent();
        return "queryParent_success";
    }
}
