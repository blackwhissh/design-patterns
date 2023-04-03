package factory;

import factory.amd.AmdManufacturer;
import factory.intel.IntelManufacturer;

public class Main {
    public static void main(String[] args) {
        Company intel = new IntelManufacturer();

        intel.assembleGpu();
        intel.assembleCpu();

        System.out.println("");

        Company amd = new AmdManufacturer();

        amd.assembleGpu();
        amd.assembleCpu();

    }
}
