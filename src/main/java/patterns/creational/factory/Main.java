package patterns.creational.factory;

import static patterns.creational.factory.EmployeeFactory.getEmployeeByPosition;
import static patterns.creational.factory.TypePosition.LOADER;

public class Main {
    public static void main(String[] args) {
        Employee employee = getEmployeeByPosition(LOADER);
        employee.makeJob();
    }
}
