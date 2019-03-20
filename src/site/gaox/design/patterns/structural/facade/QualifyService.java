package site.gaox.design.patterns.structural.facade;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 11:29
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+"积分校验通过，库存校验通过！");
        return true;
    }
}
