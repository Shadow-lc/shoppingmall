package com.yisen.shoppingmall.showgoods.goods.web;

import com.github.pagehelper.PageInfo;
import com.yisen.shoppingmall.commons.page.Page;
import com.yisen.shoppingmall.commons.utils.MyUtil;
import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.entity.GoodsPic;
import com.yisen.shoppingmall.showgoods.goods.service.GoodsService;
import com.yisen.shoppingmall.showgoods.goods.service.impl.GoodsServiceImpl;
import com.yisen.shoppingmall.showgoods.goods.vo.GoodsVo;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class GoodsAction {
    private int pageNumber;
    private int pageSize;
    private Page<Goods> goodsPage;
    private Integer category;
    private String name;
    private String describe;
    private Double marketprice;
    private Integer stock;
    private Double discount;
    private File[] pic;
    private String[] picFileName;
    private int fm;

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

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setPic(File[] pic) {
        this.pic = pic;
    }

    public void setPicFileName(String[] picFileName) {
        this.picFileName = picFileName;
    }

    public void setFm(int fm) {
        this.fm = fm;
    }

    public String querySome() {
        GoodsService service = new GoodsServiceImpl();
        GoodsVo gv = new GoodsVo();
        if(name!=null) {
            gv.setName("%" + name + "%");
        }
        if(category != null) {
            gv.setTypeno(category != -1 ? category : null);
        }
        List<Goods> goods = service.querySome(gv, pageNumber, pageSize);
        PageInfo<Goods> info = new PageInfo<>(goods);
        goodsPage = new Page<>();
        MyUtil.setPage(goodsPage, info);
        return "query_success";
    }

    public String addGoods() {
        GoodsService service = new GoodsServiceImpl();
        Goods goods = new Goods();
        int count = service.queryCountByCategoryId(category);
        goods.setGoods_no(MyUtil.createGoodsNumber(category, count));
        goods.setGoods_name(name);
        goods.setGoods_typeNo(category);
        goods.setGoods_desc(describe);
        goods.setGoods_price(marketprice);
        goods.setGoods_qty(stock);
        goods.setGoods_discount(discount);
        boolean b = service.addGoods(goods);
        if (b) {
            addGoodsPics(service, goods);
        }
        return "add_success";
    }

    private void addGoodsPics(GoodsService service, Goods goods) {
        for (int i = 0; i < pic.length; i++) {
            GoodsPic gp = new GoodsPic();
            gp.setGoodsid(goods.getGoods_id());
            gp.setAdddate(MyUtil.getCurrentDate());
            if (i + 1 == fm) {
                gp.setFm("1");
            } else {
                gp.setFm("0");
            }
            InputStream is = null;
            try {
                is = new FileInputStream(pic[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String fExt = FilenameUtils.getExtension(picFileName[i]);
            String newName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fExt;
            ServletContext application = ServletActionContext.getServletContext();
            String path = application.getRealPath("/files/" + newName);
            File targetFile = new File(path);
            gp.setGoodspic("/files/" + newName);
            boolean flag = service.addGoodsPic(gp);
            if (flag) {
                try {
                    FileUtils.copyInputStreamToFile(is, targetFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
