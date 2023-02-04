package patterns.structural.decorator;

public class MercedesAMGFullClass extends DecoratorMercedesAMG {
    public MercedesAMGFullClass(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.show();
        System.out.print(" plus new engine 500");
    }
}
