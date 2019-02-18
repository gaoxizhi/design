package site.gaox.design.principle.dependenceinversion;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 09:42
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("程序援在学习Java课程。。。");
    }
}
