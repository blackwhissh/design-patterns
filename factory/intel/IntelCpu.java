package factory.intel;

import factory.Cpu;

public class IntelCpu implements Cpu {
    @Override
    public void assemble() {
        System.out.println("Intel Cpu has been assembled");
    }
}
