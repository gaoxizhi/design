package site.gaox.design.patterns.creational.simpleFactory;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 10:57
 */
public class PythonVideo  extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python视频！");
    }
}
