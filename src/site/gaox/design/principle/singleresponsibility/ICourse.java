package site.gaox.design.principle.singleresponsibility;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 09:26
 */
public interface ICourse {
    //大职责：获得课程信息
    String getCourseName();
    byte[] getCourseVideo();

    //小职责：管理课程
    void studyCourse();
    void refundCourse();

    //需要将两个接口拆分
}
