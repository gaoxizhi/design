package site.gaox.design.patterns.structural.decorator.v1;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 20:55
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg{
    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
