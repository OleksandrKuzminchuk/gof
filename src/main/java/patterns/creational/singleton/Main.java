package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = EmployeeFactorySingleton.getInstance().createEmployeeByPosition(TypePosition.FORWARDER);
        Employee employee = employeeFactory.createEmployee();
        employee.makeJob();
    }
}
