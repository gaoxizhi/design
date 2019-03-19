package site.gaox.design.patterns.creational.prototype.abstractPrototype;

/**
 * @Description: <p>  </p>
 * 实际使用中一般让最终实现类实现克隆接口
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 10:17
 */
public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
