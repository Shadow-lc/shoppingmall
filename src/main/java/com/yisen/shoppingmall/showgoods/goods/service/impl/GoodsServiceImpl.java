package com.yisen.shoppingmall.showgoods.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.yisen.shoppingmall.commons.factory.Factory;
import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.entity.GoodsPic;
import com.yisen.shoppingmall.showgoods.goods.mapper.GoodsMapper;
import com.yisen.shoppingmall.showgoods.goods.service.GoodsService;
import com.yisen.shoppingmall.showgoods.goods.vo.GoodsVo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {

    public GoodsServiceImpl() {

    }

    @Override
    public List<Goods> querySome(GoodsVo gv, int pageNumber, int pageSize) {
            SqlSession session=null;
        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            PageHelper.startPage(pageNumber, pageSize);
            return dao.queryAll(gv);
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
    public int queryCountByCategoryId(int categoryId) {
        SqlSession session=null;

        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            return dao.queryCountByCategoryId(categoryId);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean addGoods(Goods goods) {
        SqlSession session=null;
        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            int i = dao.addGoods(goods);
            session.commit();
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
            if (session != null) {
                session.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean updateGoods(Goods goods) {
        SqlSession session=null;
        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            int i = dao.updateGoods(goods);
            session.commit();
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
            if (session != null) {
                session.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean delGoods(int id) {
        SqlSession session=null;
        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            int i = dao.delGoods(id);
            session.commit();
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
            if (session != null) {
                session.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean addGoodsPic(GoodsPic goodsPic) {
        SqlSession session=null;
        try {
            session = Factory.getSession();
            GoodsMapper dao = session.getMapper(GoodsMapper.class);
            int i = dao.addGoodsPic(goodsPic);
            session.commit();
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
            if (session != null) {
                session.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
