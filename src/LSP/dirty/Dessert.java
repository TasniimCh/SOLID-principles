package LSP.dirty;

public class Dessert {
    private String name;

    public Dessert() {};
    public Dessert(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Baking " + name + "...");
    }

    public String getName() {
        return name;
    }
}
