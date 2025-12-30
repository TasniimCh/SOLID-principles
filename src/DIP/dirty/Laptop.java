package DIP.dirty;

public class Laptop {
    private IntelCPU cpu;
    private NvidiaGPU gpu;
    private CorsairRAM ram;

    public Laptop() {
        cpu = new IntelCPU();
        gpu = new NvidiaGPU();
        ram = new CorsairRAM();
    }

    public void start() {
        cpu.process();
        ram.loadData();
        gpu.render();
        System.out.println("Laptop started successfully!");
    }
}
