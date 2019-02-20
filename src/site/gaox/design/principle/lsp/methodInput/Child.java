package site.gaox.design.principle.lsp.methodInput;

import java.util.Map;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 16:50
 */
public class Child extends Base{

    //V1.0
    //    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    /**
     * 子类的方法应该比父类的方法更宽松，在上级
     * Map > HashMap 否则会成为重写
     * @param map
     */
//    public void method(HashMap map) {
//        System.out.println("子类被执行");
//    }
    public void method(Map map) {
        System.out.println("子类被执行");
    }
}
