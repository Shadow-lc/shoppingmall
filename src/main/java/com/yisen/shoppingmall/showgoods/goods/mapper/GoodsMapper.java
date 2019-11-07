package com.yisen.shoppingmall.showgoods.goods.mapper;

import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.vo.GoodsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int addGoods(Goods goods);

    int updateGoods(Goods goods);

    List<Goods> querySome(GoodsVo vo);

    int delGoods(@Param("id") int id);
}
