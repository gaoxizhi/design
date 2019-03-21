package site.gaox.design.patterns.structural.decorator.v2;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/20 21:34
 */
public class SausageDecorator extends AbustractDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }


    @Override
    protected String getDesc() {
        return super.getDesc()+"加一跟香肠 ";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
