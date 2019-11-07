package com.yisen.shoppingmall.showgoods.goods.service;

import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.vo.GoodsVo;

import java.util.List;

public interface GoodsService {
    List<Goods> querySome(GoodsVo vo, int pageNumber, int pageSize);
    boolean addGoods(Goods goods);
    boolean updateGoods(Goods goods);
    boolean delGoods(int id);
}
