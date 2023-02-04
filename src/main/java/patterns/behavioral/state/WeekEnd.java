package patterns.behavioral.state;

public class WeekEnd implements Activity {
    private Integer count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3){
            System.out.println("Having a rest...");
            count++;
        }else {
            context.setState(new Work());
        }
    }
}
