package site.gaox.design.patterns.structural.facade;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 11:33
 */
public class PointPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;

    }

}
