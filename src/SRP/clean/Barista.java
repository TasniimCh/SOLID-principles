package SRP.clean;

public class Barista {
    private final CoffeeMachine coffeeMachine;
    public Barista(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }
    public void takeOrder(String drinkType) {
        System.out.println("Order received: " + drinkType);
        switch (drinkType.toLowerCase()) {
            case "latte":
                coffeeMachine.setWater(100);
                coffeeMachine.setCoffee(15);
                coffeeMachine.setMilk(50);
                break;
            case "espresso":
                coffeeMachine.setWater(50);
                coffeeMachine.setCoffee(20);
                coffeeMachine.setMilk(0);
                break;
            case "cappuccino":
                coffeeMachine.setWater(80);
                coffeeMachine.setCoffee(15);
                coffeeMachine.setMilk(40);
                break;
            default:
                coffeeMachine.setWater(50);
                coffeeMachine.setCoffee(10);
                coffeeMachine.setMilk(20);
                break;
        }
        System.out.println("Preparing ingredients...");
    }
}
