package SRP.clean;

public class Cleaner {
    private final CoffeeMachine coffeeMachine;
    public Cleaner(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }
    public void cleanMachine() {
        System.out.println("Cleaning machine... ");
        coffeeMachine.setWater(0);
        coffeeMachine.setCoffee(0);
        coffeeMachine.setMilk(0);
        coffeeMachine.setCoffeeReady(false);
    }
}
