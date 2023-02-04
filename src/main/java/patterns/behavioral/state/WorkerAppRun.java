package patterns.behavioral.state;

public class WorkerAppRun {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());

        human.doSomething();
        human.doSomething();
        human.doSomething();
        human.doSomething();
        human.doSomething();
        human.doSomething();
    }
}
