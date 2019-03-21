package site.gaox.design.patterns.structural.decorator.v2;

/**
 * @Description: <p>  装饰者模式</p>
 *
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 21:35
 */
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getDesc()+" 销售价格："+aBatterCake.cost());
    }
}
