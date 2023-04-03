package factory.amd;

import factory.Gpu;

public class AmdGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Amd Gpu has been assembled");
    }
}
