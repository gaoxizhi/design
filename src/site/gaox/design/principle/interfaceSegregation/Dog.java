package site.gaox.design.principle.interfaceSegregation;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 15:11
 */

// dog只需要这些功能，只需将实现这些接口就可以完成设计需求
public class Dog implements ISwimAnimalAction, IEatAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
