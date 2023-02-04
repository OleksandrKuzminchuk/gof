package patterns.creational.factory;

public class Loader implements Employee {
    @Override
    public void makeJob() {
        System.out.println("Loader is making job...");
    }
}
