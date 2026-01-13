package LSP.clean;

public abstract class Dessert {
    private String name;

    public Dessert() {};
    public Dessert(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
