package com.yisen.shoppingmall.showgoods.goods.web;

import com.github.pagehelper.PageInfo;
import com.yisen.shoppingmall.commons.page.Page;
import com.yisen.shoppingmall.commons.utils.MyUtil;
import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.service.impl.GoodsServiceImpl;
import com.yisen.shoppingmall.showgoods.goods.vo.GoodsVo;

import java.util.List;

public class GoodsAction {
    private int pageNumber;
    private int pageSize;
    private Page<Goods> goodsPage;
    private Integer category;
    private String name;

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Page<Goods> getGoodsPage() {
        return goodsPage;
    }

    public String querySome() {
        GoodsServiceImpl service = new GoodsServiceImpl();
        GoodsVo gv = new GoodsVo();
        gv.setName("%" + name + "%");
        gv.setTypeno(category != -1 ? category : null);
        List<Goods> goods = service.querySome(gv, pageNumber, pageSize);
        PageInfo<Goods> info = new PageInfo<>(goods);
        MyUtil.setPage(goodsPage, info);
        return "query_success";
    }
}
