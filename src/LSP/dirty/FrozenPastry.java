package LSP.dirty;

public class FrozenPastry extends Pastry {
    public FrozenPastry(String name) {
        super(name);
    }

    @Override
    public void bake() {
        throw new UnsupportedOperationException(
                "Cannot bake frozen pastry " + getName() + " directly!"
        );
    }
}
