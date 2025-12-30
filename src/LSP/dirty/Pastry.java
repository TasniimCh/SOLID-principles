package LSP.dirty;

public class Pastry {
    private String name;

    public Pastry() {};
    public Pastry(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Baking " + name + "...");
    }

    public String getName() {
        return name;
    }
}
