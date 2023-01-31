package custom_realization_patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = createEmployeeByPosition(TypePosition.LOADER);
        Employee employee = employeeFactory.createEmployee();
        employee.makeJob();
    }

    static EmployeeFactory createEmployeeByPosition(TypePosition position){
        if (position.equals(TypePosition.LOADER)){
            return new LoaderFactory();
        } else if (position.equals(TypePosition.ACCOUNTANT)) {
            return new AccountantFactory();
        } else if (position.equals(TypePosition.FORWARDER)) {
            return new ForwarderFactory();
        } else {
            throw new  RuntimeException("Can't create the position: " + position);
        }
    }
}
