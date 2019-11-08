package com.yisen.shoppingmall.showgoods.goods.mapper;

import com.yisen.shoppingmall.showgoods.goods.entity.Category;
import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.entity.GoodsPic;
import com.yisen.shoppingmall.showgoods.goods.vo.GoodsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int addGoods(Goods goods);

    int updateGoods(Goods goods);

    List<Goods> querySome(GoodsVo vo);

    int delGoods(@Param("id") int id);

    int addGoodsPic(GoodsPic pic);
    int delGoodsPic(GoodsPic pic);
    int updateGoodsPic(GoodsPic pic);
    List<GoodsPic> querySome(@Param("goodsid") String goodsid);




    int addCa(Category ca);

    int delCa(Category ca);

    int updateCa(Category ca);

    List<Category> queryCa();

    List<Category> queryChildren(@Param("pid") int pid);
}
