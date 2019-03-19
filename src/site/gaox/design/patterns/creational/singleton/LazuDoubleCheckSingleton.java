package site.gaox.design.patterns.creational.singleton;

/**
 * @Description: <p> 双重检查 </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 16:44
 */
public class LazuDoubleCheckSingleton {
    // V1.0
//    private static LazuDoubleCheckSingleton lazuDoubleCheckSingleton = null;

    //V2.0 不允许重排序
    private volatile static LazuDoubleCheckSingleton lazuDoubleCheckSingleton = null;

    private LazuDoubleCheckSingleton(){

    }
    public static LazuDoubleCheckSingleton getInstance(){
        if(null == lazuDoubleCheckSingleton){
            /**
             * 同样先检查非空
             * 锁定该类
             */
            synchronized(LazuDoubleCheckSingleton.class){
                if(null == lazuDoubleCheckSingleton){
                    //1. 分配内存
                    // 3.设置lazuDoubleCheckSingleton  指向刚分配的地址
                    //2.初始化对象
                               // -------------- 3.设置lazuDoubleCheckSingleton  指向刚分配的地址
                    //可能会出现重排序，（2,3）
                    // intra-thread sematics 单线程 是允许重排序的，不影响程序执行结果

                    lazuDoubleCheckSingleton = new LazuDoubleCheckSingleton();
                }
            }
        }
        return lazuDoubleCheckSingleton;
    }
}
