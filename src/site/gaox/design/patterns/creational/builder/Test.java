package site.gaox.design.patterns.creational.builder;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 15:04
 */
public class Test {
    public static void main(String[] args) {
        ComputerBuild computerBuild = new ComputerActualBuild();
        Admin admin = new Admin();
        admin.setComputerBuild(computerBuild);

        Computer computer = admin.makeComputer("AMD线程撕裂者“2950X”",
                "芝奇3400 ddr4",
                "建兴 联想定制版",
                "华硕 猛禽",
                "华硕 X263");
        System.out.println(computer);

    }

}
