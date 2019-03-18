package site.gaox.design.patterns.creational.abstractFactory;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 13:49
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public PythonVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
