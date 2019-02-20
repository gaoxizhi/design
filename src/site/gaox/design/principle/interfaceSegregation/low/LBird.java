package site.gaox.design.principle.interfaceSegregation.low;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 14:57
 *
 * 这种写法会让没有该功能的实现类拥有不该有的方法
 * 最好将接口拆分，实现接口隔离
 */
public class LBird implements IAnimalAction {
    @Override
    public void eat() {

    }

    // Wrong
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
