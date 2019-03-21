package site.gaox.design.patterns.structural.facade;

/**
 * @Description: <p>  </p>
 *
 * 待解决问题，逻辑通过，缺少关键步骤，但是能够运行
 *
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 11:45
 */
public class Test {
    public static void main(String[] args) {

        //声明积分礼物
        PointsGift pointsGift = new PointsGift("小米shab热水壶");
        //声明购买服务
        ShippingService shippingService = new ShippingService();
        //声明校验积分服务
        QualifyService qualifyService = new QualifyService();
        //声明支付服务
        PointPaymentService pointPaymentService = new PointPaymentService();

        //声明物流服务
        GiftExchangService giftExchangService = new GiftExchangService();
        //发起购物申请
        giftExchangService.setQualifyService(qualifyService);
        //
        giftExchangService.setPointPaymentService(pointPaymentService);
        //声明物流服务
        giftExchangService.setShippingService(shippingService);
        giftExchangService.giftExchange(pointsGift);
    }
}
