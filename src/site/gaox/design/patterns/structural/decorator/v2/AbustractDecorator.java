package site.gaox.design.patterns.structural.decorator.v2;

/**
 * @Description: <p>  </p>
 * 这里也可以声明成抽象装饰者，根据业务模型，和难度
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 21:29
 */

public class AbustractDecorator extends ABatterCake {

    private ABatterCake aBatterCake;
    public AbustractDecorator (ABatterCake aBatterCake){
        this.aBatterCake = aBatterCake;
    }
    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }
}
