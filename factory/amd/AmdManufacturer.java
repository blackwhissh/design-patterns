package factory.amd;

import factory.Company;
import factory.Cpu;
import factory.Gpu;

public class AmdManufacturer extends Company {
    public Cpu createCpu(){
        return new AmdCpu();
    }

    @Override
    public Gpu createGpu() {
        return new AmdGpu();
    }
}
