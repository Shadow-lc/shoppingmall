package com.yisen.shoppingmall.showgoods.goods.mapper;

import com.yisen.shoppingmall.showgoods.goods.entity.Category;
import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.vo.GoodsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int addgoods(Goods goods);

    int updategoods(Goods goods);

    List<Goods> queryAll(GoodsVo vo);

    int delgoods(@Param("id") int id);

    int addCa(Category ca);

    int delCa(Category ca);

    int updateCa(Category ca);

    List<Category> queryCa();

    List<Category> queryChildren(@Param("pid") int pid);
}
