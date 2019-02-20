package site.gaox.design.principle.singleresponsibility;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 11:39
 */
public class Bird {
    //鸟的主要运动方式
    public void mainMoveMode(String birdName) {
        //V1.0
        // System.out.println(birdName+"用翅膀飞");

        //V2.0
        if ("企鹅".equals(birdName)) {
            System.out.println(birdName + "用脚走路");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
