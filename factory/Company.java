package factory;

public abstract class Company {
    public Cpu assembleCpu(){
        Cpu cpu = createCpu();
        cpu.assemble();
        return cpu;
    }

    public Gpu assembleGpu(){
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Cpu createCpu();

    public abstract Gpu createGpu();

}
