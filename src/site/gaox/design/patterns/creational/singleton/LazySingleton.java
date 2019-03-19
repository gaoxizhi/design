package site.gaox.design.patterns.creational.singleton;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 16:06
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
