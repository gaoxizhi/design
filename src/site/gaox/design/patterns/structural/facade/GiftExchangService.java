package site.gaox.design.patterns.structural.facade;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 11:39
 */
@SuppressWarnings("ALL")
public class GiftExchangService {
    private QualifyService qualifyService;
    private PointPaymentService pointPaymentService;
    private ShippingService shippingService;


    public void setQualifyService(QualifyService qualifyService){
        this.qualifyService = qualifyService;
    }

    public void setPointPaymentService(PointPaymentService pointPaymentService){
        this.pointPaymentService = pointPaymentService;
    }
    public void setShippingService(ShippingService shippingService){
        this.shippingService = shippingService;
    }

    //校验资格
    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)) {
            String shippingOrderNo = shippingService.shipGift(pointsGift);
            System.out.println("物流下单成功，订单号："+shippingOrderNo);
        }

    }
}
