package site.gaox.design.patterns.structural.decorator.v2;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 21:32
 */
public class EggDecorator extends AbustractDecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋 ";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
