package patterns.structural.facade;

public class CoffeeMachine {
    public static void main(String[] args) {
        RangCoffee late = new RangCoffee();
        late.doLatte();
    }
}
