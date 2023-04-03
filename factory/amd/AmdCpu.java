package factory.amd;

import factory.Cpu;

public class AmdCpu implements Cpu {
    @Override
    public void assemble() {
        System.out.println("Amd Cpu has been assembled");
    }
}
