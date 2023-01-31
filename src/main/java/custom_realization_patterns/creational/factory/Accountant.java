package custom_realization_patterns.creational.factory;

public class Accountant implements Employee {
    @Override
    public void makeJob() {
        System.out.println("Accountant is making job...");
    }
}
