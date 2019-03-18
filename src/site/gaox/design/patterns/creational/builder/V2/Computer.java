package site.gaox.design.patterns.creational.builder.V2;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 15:16
 */
public class Computer {
    private String CPU;
    private String memory;
    private String SSD;
    private String power;
    private String mainboard;

    public Computer(ComputerBuilder computerBuilder) {
        this.CPU = computerBuilder.CPU;
        this.memory = computerBuilder.memory;
        this.SSD = computerBuilder.SSD;
        this.power = computerBuilder.power;
        this.mainboard = computerBuilder.mainboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", memory='" + memory + '\'' +
                ", SSD='" + SSD + '\'' +
                ", power='" + power + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    public static class ComputerBuilder {

        private String CPU;
        private String memory;
        private String SSD;
        private String power;
        private String mainboard;


        /**
         * 还可以做默认值设置
         * @param CPUName
         * @return
         */
        public ComputerBuilder buildCPU(String CPUName) {
            this.CPU = CPUName;
            return this;
        }

        public ComputerBuilder buildMemory(String memoryName) {
            this.memory = memoryName;
            return this;
        }

        public ComputerBuilder buildSSD(String SSDName) {
            this.SSD = SSDName;
            return this;
        }

        public ComputerBuilder buildPower(String PowerName) {
            this.power = power;
            return this;
        }

        public ComputerBuilder buildMainboard(String mainboardName) {
            this.mainboard = mainboardName;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
