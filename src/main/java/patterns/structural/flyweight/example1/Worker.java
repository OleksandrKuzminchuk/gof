package patterns.structural.flyweight.example1;

public class Worker implements Human {
    @Override
    public void doJob() {
        System.out.println("Worker is doing a building...");
    }
}
