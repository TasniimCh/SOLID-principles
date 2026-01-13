package DIP.clean;

public class Laptop {
    private IProcessor cpu;
    private IGraphics gpu;
    private IMemory ram;

    public Laptop(IProcessor cpu, IGraphics gpu, IMemory ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public void start() {
        cpu.process();
        ram.loadData();
        gpu.render();
        System.out.println("Laptop started successfully!");
    }
}