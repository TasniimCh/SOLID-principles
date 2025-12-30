package SRP;

import SRP.clean.Barista;
import SRP.clean.Cleaner;
import SRP.clean.CoffeeMachine;
import SRP.clean.Notifier;

public class CoffeeShop {
    public static void main(String[] args) {
        System.out.println("=== Dirty SRP Example ===");
        SRP.dirty.CoffeeMachine dirtyMachine = new SRP.dirty.CoffeeMachine();

        dirtyMachine.takeOrder("Latte");
        dirtyMachine.makeCoffee();
        dirtyMachine.notifyUser();
        dirtyMachine.cleanMachine();


        System.out.println("\n=== Clean SRP Example ===");
        SRP.clean.CoffeeMachine cleanMachine = new CoffeeMachine();
        Barista barista = new Barista(cleanMachine);
        Notifier notifier = new Notifier(cleanMachine);
        Cleaner cleaner = new Cleaner(cleanMachine);

        barista.takeOrder("Latte");
        cleanMachine.makeCoffee();
        notifier.notifyUser();
        cleaner.cleanMachine();
    }
}
