package site.gaox.design.patterns.creational.factoryMethod;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 10:56
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频！");
    }
}
