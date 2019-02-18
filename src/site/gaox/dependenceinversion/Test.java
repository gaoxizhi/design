package site.gaox.dependenceinversion;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 09:35
 */

/**
 * 依赖倒置原则在高层模块使用
 * 增加方法需要在底层模块增加方法
 *
 *
 * 扩展性比较差
 */
public class Test {

//    V1.0
//    public static void main(String[] args) {
//        Programmer programmer = new Programmer();
//        programmer.studyCCourse();
//        programmer.studyJavaCourse();
//    }

//    V 2.0
//    public static void main(String[] args) {
//        Programmer programmer = new Programmer();
//        programmer.studyCourse(new JavaCourse());
//        /** 对于扩展我们只需要新建一个class实现ICourse */
//        programmer.studyCourse(new CCourse());
//    }

    //V3.0
    //实现一个构造器
//    public static void main(String[] args) {
//        Programmer programmer = new Programmer(new JavaCourse());
////        ICourse的具体实现已经在构造其中实现了
//        programmer.studyCourse();
//    }

    //V4.0
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
    //开放构造器
        programmer.setiCourse(new JavaCourse());
        programmer.studyCourse();
        programmer.setiCourse(new CCourse());
        programmer.studyCourse();


    }


}
