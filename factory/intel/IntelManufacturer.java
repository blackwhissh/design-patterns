package factory.intel;

import factory.Company;
import factory.Cpu;
import factory.Gpu;
import factory.intel.IntelCpu;

public class IntelManufacturer extends Company {
    public Cpu createCpu(){
        return new IntelCpu();
    }

    public Gpu createGpu(){
        return new IntelGpu();
    }
}
