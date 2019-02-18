package site.gaox.design.principle.openclose;
/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 10:33
 */
public class Test {
//    原始程序
//    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCourse(1,"职业法师",25,76.3);
//        //一般在实际项目中是禁止使用的因为system.out中是有锁的
//        System.out.println("人员编号："+javaCourse.getId()+"\t姓名："+javaCourse.getName()
//                +"\n年龄："+javaCourse.getAge()+"岁\t现在体重："+javaCourse.getWeight());
//    }

    // 需求：添加一个方法和重写获得体重的方法

    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(1,"职业法师",25,76.3);
        //一般在实际项目中是禁止使用的因为system.out中是有锁的

        System.out.println("人员编号："+javaCourse.getId()+"\t姓名："+javaCourse.getName()
                +"\n年龄："+javaCourse.getAge()+"岁\t标准体重："+javaCourse.getWeight()
                // 需要进行强转，ICourse接口中并没有getOriginWeight方法
                +"\n实际体重："+((JavaDiscountCourse) javaCourse).getOriginWeight()
        );
    }
}
