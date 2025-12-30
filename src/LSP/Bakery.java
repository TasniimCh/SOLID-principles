package LSP;

import LSP.dirty.FrozenPastry;
import LSP.dirty.Pastry;

public class Bakery {
    public static void main(String[] args) {
        Pastry croissant = new Pastry("Croissant");

        croissant.bake();

        Pastry frozenCroissant = new FrozenPastry("Frozen Croissant");
        frozenCroissant.bake(); //Breaks The Program
    }
}
