package factory.intel;

import factory.Gpu;

public class IntelGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Intel Gpu has been assembled");
    }
}
