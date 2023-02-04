package patterns.structural.flyweight.example1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class HumanFactory {
    private static final Map<String, Human> humans = new HashMap<>();

    public Human getHumanBySpecialty(String specialty) {
        return humans.computeIfAbsent(specialty, getMappingFunction(specialty));
    }

    private static Function<String, Human> getMappingFunction(String specialty) {
        return s -> {
            if (s.equals("worker")) {
                System.out.println("Create new worker...");
                return new Worker();
            } else if (s.equals("driver")) {
                System.out.println("Create new driver...");
                return new Driver();
            } else {
                System.out.println("Can't create by specialty: " + specialty);
            }
            return humans.get(s);
        };
    }
}
