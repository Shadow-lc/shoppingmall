import com.yisen.shoppingmall.commons.utils.MyUtil;
import com.yisen.shoppingmall.showgoods.goods.entity.Goods;
import com.yisen.shoppingmall.showgoods.goods.service.GoodsService;
import com.yisen.shoppingmall.showgoods.goods.service.impl.GoodsServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class TestUnit {
    @Test
    public void testAddGoods() {
        Goods goods = new Goods();
        goods.setGoods_no(MyUtil.createGoodsNumber(3, 0));
        goods.setGoods_name("人文历史");
        goods.setGoods_typeNo(3);
        goods.setGoods_desc("人文历史系列丛书");
        goods.setGoods_qty(200);
        goods.setGoods_price(23);
        goods.setGoods_discount(0.85);
        BigDecimal bd = new BigDecimal(23 * 0.85);
        double discountPrice = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        goods.setDiscountPrice(discountPrice);
        GoodsService service = new GoodsServiceImpl();
        boolean b = service.addGoods(goods);
        System.out.println(goods);
    }
}
