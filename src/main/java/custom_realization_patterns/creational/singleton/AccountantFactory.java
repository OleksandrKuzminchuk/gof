package custom_realization_patterns.creational.singleton;

public class AccountantFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Accountant();
    }
}
