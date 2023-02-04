package patterns.creational.singleton;

public class Forwarder implements Employee {

    @Override
    public void makeJob() {
        System.out.println("Forwarder is making job...");
    }
}
