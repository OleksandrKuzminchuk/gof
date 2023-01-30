package examples.factory;

public class Forwarder extends Employee {

    @Override
    public void makeJob() {
        System.out.println("Forwarder is making job...");
    }
}
