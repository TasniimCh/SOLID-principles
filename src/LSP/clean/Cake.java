package LSP.clean;

public class Cake extends Dessert implements Bakeable {
    public Cake(String name) {
        super(name);
    }

    @Override
    public void bake() {
        System.out.println("Baking " + getName() + "...");
    }
}
