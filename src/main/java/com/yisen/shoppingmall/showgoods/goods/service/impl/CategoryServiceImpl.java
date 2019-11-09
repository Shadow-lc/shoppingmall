package com.yisen.shoppingmall.showgoods.goods.service.impl;

import com.yisen.shoppingmall.commons.factory.Factory;
import com.yisen.shoppingmall.showgoods.goods.entity.Category;
import com.yisen.shoppingmall.showgoods.goods.mapper.GoodsMapper;
import com.yisen.shoppingmall.showgoods.goods.service.CategoryService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    public CategoryServiceImpl() {

    }

    @Override
    public List<Category> queryCategorys() {
        SqlSession session = null;
        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            List<Category> categories = dao.queryChildren(-1);
            for (Category category : categories) {
                category.setChildren(dao.queryChildren(category.getId()));
            }
            return categories;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Category> queryParent() {
        SqlSession session = null;
        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            return dao.queryChildren(-1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
