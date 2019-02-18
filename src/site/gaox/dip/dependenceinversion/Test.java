package site.gaox.dip.dependenceinversion;

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
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.studyCCourse();
        programmer.studyJavaCourse();
    }
}
