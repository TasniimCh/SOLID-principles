package DIP;

public class LaptopProd {
    public static void main(String[] args) {
        System.out.println("=== Dirty DIP Example ===");
        // Dirty laptop depends directly on concrete components
        DIP.dirty.Laptop dirtyLaptop = new DIP.dirty.Laptop();
        dirtyLaptop.start(); // Works, but tightly coupled
        System.out.println();

        System.out.println("=== Clean DIP Example ===");
        // Clean laptop depends on abstractions
        DIP.clean.IProcessor cpu = new DIP.clean.IntelCPU();
        DIP.clean.IGraphics gpu = new DIP.clean.NvidiaGPU();
        DIP.clean.IMemory ram = new DIP.clean.CorsairRAM();

        DIP.clean.Laptop cleanLaptop = new DIP.clean.Laptop(cpu, gpu, ram);
        cleanLaptop.start(); // Works, decoupled

        System.out.println();

        // Swapping components in clean laptop is easy
        System.out.println("=== Clean DIP Laptop with Swapped CPU ===");
        DIP.clean.IProcessor amdCpu = new DIP.clean.AMDCPU();
        DIP.clean.Laptop customLaptop = new DIP.clean.Laptop(amdCpu, gpu, ram);
        customLaptop.start();
    }
}
