package site.gaox.design.principle.singleresponsibility;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 09:31
 */
public interface ICourseContent {
    //大职责：获得课程信息
    String getCourseName();
    byte[] getCourseVideo();
}
