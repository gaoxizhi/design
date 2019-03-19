package site.gaox.design.patterns.creational.singleton;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 16:08
 */
public class Test{

    public static void main(String[] args){
        LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program1 end!");

    }
}
