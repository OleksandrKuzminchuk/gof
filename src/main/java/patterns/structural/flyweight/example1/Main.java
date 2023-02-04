package patterns.structural.flyweight.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static HumanFactory humanFactory = new HumanFactory();
    public static void main(String[] args) {
        long start = System.currentTimeMillis();


        List<Human> humans = new ArrayList<>(get());

        humans.forEach(Human::doJob);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static List<Human> get(){
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++){
            humans.add(humanFactory.getHumanBySpecialty("worker"));
            humans.add(humanFactory.getHumanBySpecialty("driver"));
        }
        return humans;
    }
}
