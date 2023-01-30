package examples.factory;

public class Accountant extends Employee {
    @Override
    public void makeJob() {
        System.out.println("Accountant is making job...");
    }
}
