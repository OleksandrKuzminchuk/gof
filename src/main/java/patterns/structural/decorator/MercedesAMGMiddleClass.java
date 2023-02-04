package patterns.structural.decorator;

public class MercedesAMGMiddleClass extends DecoratorMercedesAMG {
    public MercedesAMGMiddleClass(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.show();
        System.out.print(" plus extra a glass roof");
    }
}
