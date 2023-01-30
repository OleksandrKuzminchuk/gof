package examples.factory;

public class LoaderFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Loader();
    }
}
