package examples.factory;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = createEmployeeByPosition(new Forwarder());
        Employee employee = employeeFactory.createEmployee();
        employee.makeJob();
    }

    static EmployeeFactory createEmployeeByPosition(Employee employee){
        if (employee instanceof Loader){
            return new LoaderFactory();
        } else if (employee instanceof Accountant) {
            return new AccountantFactory();
        } else if (employee instanceof Forwarder) {
            return new ForwarderFactory();
        } else {
            throw new  RuntimeException("Can't create: " + employee);
        }
    }
}
