package custom_realization_patterns.creational.singleton;

public class LoaderFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Loader();
    }
}
