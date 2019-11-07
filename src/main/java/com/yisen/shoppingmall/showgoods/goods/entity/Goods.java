package com.yisen.shoppingmall.showgoods.goods.entity;

public class Goods {
    private Integer goods_id;
    private String goods_no;
    private String goods_name;
    private int goods_typeNo;//typeid
    private String goods_desc;
    private String goods_img;
    private double goods_price;
    private Integer goods_qty;
    private double goods_discount;
    private GoodsPic pic;
    private GoodsType goodstype;

    public GoodsPic getPic() {
        return pic;
    }

    public void setPic(GoodsPic pic) {
        this.pic = pic;
    }

    public GoodsType getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(GoodsType goodstype) {
        this.goodstype = goodstype;
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

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
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
