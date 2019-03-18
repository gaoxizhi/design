package site.gaox.design.patterns.creational.abstractFactory;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 13:38
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java视频！");
    }
}
