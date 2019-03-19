package site.gaox.design.patterns.creational.singleton;

import java.io.Serializable;

/**
 * @Description: <p> 饿汉模式 </p>
 * 在声明时就实例化，
 * 如果后期用不到就会造成内存的浪费
 * 不能实现懒加载
 * @Date: 2019/3/18 17:36
 */
public class HungrySingleton implements Serializable {

    //------------------------1----------------------------------------
//    private static HungrySingleton hungrySingleton = new HungrySingleton();
    //------------------------1----------------------------------------
//    private final static HungrySingleton hungruySingleton = new HungrySingleton();
    //------------------------1----------------------------------------
    private final static HungrySingleton hungruySingleton;

    static {
        hungruySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return hungruySingleton;
    }

    // 如果写上此方法，可以反序列化
    private Object readResolve(){
        return hungruySingleton;
    }
}
