package site.gaox.design.patterns.creational.singleton.create;

/**
 * @Description: <p> 创建一个单例对象 </p>
 * @Author: gaox·Eric
 * @Date: 2019/3/26 17:54
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;
    private Singleton(){
    }

    public static Singleton getUniqueInstance(){
        //先判断对象是否已经实例过，没有实例化过才进入加锁代码
        if (null == uniqueInstance) {
            //类对象加锁
            synchronized (Singleton.class) {
                //再次判断，防止步骤重排
                if (null == uniqueInstance) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
