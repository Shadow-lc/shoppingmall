package com.yisen.shoppingmall.showgoods.goods.service;


import com.yisen.shoppingmall.showgoods.goods.entity.Category;

import java.util.List;


public interface CategoryService {
    List<Category> queryCategorys();
    List<Category> queryParent();
}
