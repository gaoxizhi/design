package site.gaox.design.patterns.creational.builder;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 14:38
 */
public class ComputerActualBuild extends ComputerBuild {

    //简化实际过程
    private Computer computer = new Computer();

    @Override
    public void buildCPU(String CPUName) {
        computer.setCPU(CPUName);
    }

    @Override
    public void buildMemory(String memoryName) {
        computer.setMemory(memoryName);
    }

    @Override
    public void buildSSD(String SSDName) {
        computer.setSSD(SSDName);
    }

    @Override
    public void buildPower(String PowerName) {
        computer.setPower(PowerName);
    }

    @Override
    public void buildMainboard(String mainboardName) {
        computer.setMemory(mainboardName);
    }

    @Override
    public Computer makeComputer() {
        return computer;
    }
}
