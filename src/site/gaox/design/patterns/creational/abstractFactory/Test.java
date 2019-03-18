package site.gaox.design.patterns.creational.abstractFactory;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 13:56
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();

        video.produce();
        article.produce();
    }
}
