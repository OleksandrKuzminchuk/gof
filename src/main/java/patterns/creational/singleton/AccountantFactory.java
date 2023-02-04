package patterns.creational.singleton;

public class AccountantFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Accountant();
    }
}
