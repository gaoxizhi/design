package site.gaox.design.patterns.structural.facade;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 11:36
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "gx7012";
        return shippingOrderNo;
    }
}
