package site.gaox.design.patterns.creational.singleton;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 16:12
 */
public class T implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        // V1.0
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        //V2.0
        LazuDoubleCheckSingleton lazuDoubleCheckSingleton  = LazuDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+lazuDoubleCheckSingleton);
    }
}
