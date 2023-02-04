package patterns.structural.decorator;

public abstract class DecoratorMercedesAMG implements Car {
    Car car;

    protected DecoratorMercedesAMG(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        car.show();
    }
}
