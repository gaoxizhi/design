package site.gaox.design.patterns.structural.decorator.v1;

/**
 * @Description: <p>  </p>
 *
 * 问题是：
 * 只能解决已经经过处理的方法
 * 全部实现会造成类的爆炸
 *
 *
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 20:57
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();

        System.out.println("购买 ："+batterCake.getDesc()+"\t销售价格"+batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println("购买 ："+batterCakeWithEgg.getDesc()+"\t销售价格"+batterCakeWithEgg.cost());

        final BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println("购买 ："+batterCakeWithEggSausage.getDesc()+"\t销售价格"+batterCakeWithEggSausage.cost());

    }
}
