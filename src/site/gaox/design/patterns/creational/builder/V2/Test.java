package site.gaox.design.patterns.creational.builder.V2;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 15:28
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .buildCPU("IBM 核心3")
                .buildMainboard("华硕 235")
                .buildMemory("三星ddr2 2GB")
                .buildPower("美国华盛")
                .buildSSD("东芝闪存")
                .build();
        System.out.println(computer.toString());
    }
}
