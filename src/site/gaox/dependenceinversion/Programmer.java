package site.gaox.dependenceinversion;

/**
 * @Description: <p> 依赖倒置示例 </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 09:27
 */
public class Programmer {


    /**
     * V1.0
     */
//    public void  studyJavaCourse(){
//        System.out.println("程序援在学习Java课程。。。");
//    }
//    public void  studyCCourse(){
//        System.out.println("程序援在学习C语言课程。。。");
//    }
//    public void  studyFECourse(){
//        System.out.println("程序援在学习前端课程。。。");
//    }
//    public void  studyPythonCourse(){
//        System.out.println("程序援在学习Python课程。。。");
//    }


    // V2.0
//    public void  studyCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

    // V3.0
//    private ICourse iCourse;
//    public Programmer(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//    public void  studyCourse(){
//        iCourse.studyCourse();
//    }

    //V4.0
    private ICourse iCourse;

    //开放构造器
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }
}
