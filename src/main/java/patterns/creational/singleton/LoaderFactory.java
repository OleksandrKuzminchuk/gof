package patterns.creational.singleton;

public class LoaderFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Loader();
    }
}
