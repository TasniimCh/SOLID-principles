package SRP.clean;

public class Notifier {
    private final CoffeeMachine coffeeMachine;
    public Notifier(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }
    public void notifyUser() {
        if (coffeeMachine.isCoffeeReady()) {
            System.out.println("Notification: Your coffee is ready!");
        } else {
            System.out.println("Notification: Still brewing, patience is a virtue!");
        }
    }
}
