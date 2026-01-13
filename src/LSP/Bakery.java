package LSP;

public class Bakery {
    public static void main(String[] args) {
        // --- Dirty LSP example ---
        LSP.dirty.Cake dirtyCake = new LSP.dirty.Cake("Chocolate Cake");
        LSP.dirty.IceCream dirtyIceCream = new LSP.dirty.IceCream("Vanilla Ice Cream");

        dirtyCake.bake(); // Works fine

        try {
            dirtyIceCream.bake(); // Throws Exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot bake " + dirtyIceCream.getName() + ": " + e.getMessage());
        }

        // --- Clean LSP example ---
        LSP.clean.Cake cleanCake = new LSP.clean.Cake("Chocolate Cake");
        LSP.clean.IceCream cleanIceCream = new LSP.clean.IceCream("Vanilla Ice Cream");

        // Only bakeable desserts can be baked
        cleanCake.bake(); // Works

        //cleanIceCream).bake(); // Won't execute --ERROR

        System.out.println("Desserts ready: " + cleanCake.getName() + " and " + cleanIceCream.getName());
    }
}