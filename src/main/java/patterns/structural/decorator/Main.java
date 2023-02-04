package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new MercedesAMGFullClass(new MercedesAMGMiddleClass(new MercedesAMGBudgetClass()));
        car.show();
    }
}
