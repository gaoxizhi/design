package site.gaox.design.patterns.creational.abstractFactory;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 13:39
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写java手记！");
    }
}
