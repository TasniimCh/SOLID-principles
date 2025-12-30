package SRP.clean;

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

    public void setWater(int water) {
        this.water = water;
    }
    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public boolean isCoffeeReady() {
        return coffeeReady;
    }
    public void setCoffeeReady(boolean coffeeReady) {
        this.coffeeReady = coffeeReady;
    }


    public void makeCoffee() {
        System.out.println("Making your coffee...");
        coffeeReady = true;
        System.out.println("Coffee is brewed!");
    }
}
