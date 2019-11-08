package com.yisen.shoppingmall.showgoods.goods.web;


import com.yisen.shoppingmall.showgoods.goods.entity.Category;
import com.yisen.shoppingmall.showgoods.goods.service.CategoryService;
import com.yisen.shoppingmall.showgoods.goods.service.impl.CategoryServiceImpl;

import java.util.List;

public class CategoryAction {
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public String queryAllCategory() {
        CategoryService service = new CategoryServiceImpl();
        categories = service.queryCategorys();
        return "queryAllCategory_success";
    }
}
