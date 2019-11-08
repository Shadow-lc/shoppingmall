package com.yisen.shoppingmall.showgoods.goods.entity;

import com.yisen.shoppingmall.showgoods.goods.entity.Category;
import com.yisen.shoppingmall.showgoods.goods.entity.GoodsPic;

public class Goods {
    private Integer goods_id;
    private  String goods_no;
    private  String goods_name;
    private  int goods_typeNo;//typeid
    private  String goods_desc;
    private double goods_price;
    private Integer goods_qty;
    private double goods_discount;
    private double discountPrice;
    private GoodsPic goodspic;
    private Category ca;

    public Category getCa() {
        return ca;
    }

    public void setCa(Category ca) {
        this.ca = ca;
    }



    public GoodsPic getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(GoodsPic goodspic) {
        this.goodspic = goodspic;
    }





    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_typeNo() {
        return goods_typeNo;
    }

    public void setGoods_typeNo(int goods_typeNo) {
        this.goods_typeNo = goods_typeNo;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }

    public Integer getGoods_qty() {
        return goods_qty;
    }

    public void setGoods_qty(Integer goods_qty) {
        this.goods_qty = goods_qty;
    }

    public double getGoods_discount() {
        return goods_discount;
    }

    public void setGoods_discount(double goods_discount) {
        this.goods_discount = goods_discount;
    }
}
