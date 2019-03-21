package site.gaox.design.patterns.structural.decorator.v1;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 20:54
 */
public class BatterCakeWithEgg extends BatterCake{
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
