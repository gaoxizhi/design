package site.gaox.design.principle.interfaceSegregation.low;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 14:58
 *
 * 将动物的功能放在同一个接口中，方便管理
 * 但会造成实现类的出错，实现了不应有的功能
 */
public interface IAnimalAction {
    void eat();
    void fly();
    void swim();
}
