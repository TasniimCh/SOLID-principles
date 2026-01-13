package LSP.dirty;

public class IceCream extends Dessert {
    public IceCream(String name) {
        super(name);
    }

    @Override
    public void bake() {
        throw new UnsupportedOperationException(
                "Cannot bake " + getName()
        );
    }
}
