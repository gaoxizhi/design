package site.gaox.design.patterns.creational.builder;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 14:32
 */
public abstract class ComputerBuild {
    public abstract void buildCPU(String CPUName);
    public abstract void buildMemory(String memoryName);
    public abstract void buildSSD(String SSDName);
    public abstract void buildPower(String PowerName);
    public abstract void buildMainboard(String mainboardName);

    public abstract Computer makeComputer();
}
