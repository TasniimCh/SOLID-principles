package SRP.dirty;

public class CoffeeMachine {
    private int water;  // ml
    private int coffee; // g
    private int milk;   // ml
    private boolean coffeeReady;

    public CoffeeMachine() {
        this.water = 0;
        this.coffee = 0;
        this.milk = 0;
        this.coffeeReady = false;
    }

    // Step 1: Take order
    public void takeOrder(String drinkType) {
        System.out.println("Order received: " + drinkType);
        switch (drinkType.toLowerCase()) {
            case "latte":
                water = 100; coffee = 15; milk = 50; break;
            case "espresso":
                water = 50; coffee = 20; milk = 0; break;
            case "cappuccino":
                water = 80; coffee = 15; milk = 40; break;
            default:
                water = 50; coffee = 10; milk = 20; break;
        }
        System.out.println("Preparing ingredients...");
    }

    // Step 2: Make the coffee
    public void makeCoffee() {
        System.out.println("Making your coffee...");
        coffeeReady = true;
        System.out.println("Coffee is brewed!");
    }

    // Step 3: Notify the user
    public void notifyUser() {
        if (coffeeReady) {
            System.out.println("Notification: Your coffee is ready!");
        } else {
            System.out.println("Notification: Still brewing, patience is a virtue!");
        }
    }

    // Step 4: Clean itself automatically
    public void cleanMachine() {
        System.out.println("Cleaning machine... ");
        water = 0;
        coffee = 0;
        milk = 0;
        coffeeReady = false;
    }
}