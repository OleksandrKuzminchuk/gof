package custom_realization_patterns.creational.singleton;

public class ForwarderFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Forwarder();
    }
}
