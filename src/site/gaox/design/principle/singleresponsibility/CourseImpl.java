package site.gaox.design.principle.singleresponsibility;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 09:32
 */
public class CourseImpl implements ICourseManager,ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
