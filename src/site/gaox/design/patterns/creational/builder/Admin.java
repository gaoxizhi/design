package site.gaox.design.patterns.creational.builder;

/**
 * @Description: <p> 运维管理员 </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 14:49
 */
public class Admin {
    private ComputerBuild computerBuild;

    public void setComputerBuild(ComputerBuild computerBuild) {
        this.computerBuild = computerBuild;
    }

    public Computer makeComputer(String CPUName, String memoryName,
                                 String SSDName, String PowerName, String mainboardName) {
        this.computerBuild.buildCPU(CPUName);
        this.computerBuild.buildMemory(memoryName);
        this.computerBuild.buildSSD(SSDName);
        this.computerBuild.buildPower(PowerName);
        this.computerBuild.buildMainboard(mainboardName);
        return this.computerBuild.makeComputer();
    }

}
