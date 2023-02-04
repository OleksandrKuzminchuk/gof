package patterns.creational.factory;

public class ForwarderFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Forwarder();
    }
}
