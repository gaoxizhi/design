package site.gaox.design.patterns.creational.prototype.clone;

import java.util.Date;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 10:21
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthDay = new Date(1L);
        Pig pig1 = new Pig("佩奇", birthDay);

        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig2.getBirthDay().setTime(77777777777L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
