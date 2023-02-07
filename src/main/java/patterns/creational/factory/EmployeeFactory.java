package patterns.creational.factory;

public abstract class EmployeeFactory {
    private EmployeeFactory() {
        throw new IllegalStateException("Utility class");
    }
    public static Employee getEmployeeByPosition(TypePosition position){
        if (position.equals(TypePosition.LOADER)){
            return new Loader();
        } else if (position.equals(TypePosition.ACCOUNTANT)) {
            return new Accountant();
        } else if (position.equals(TypePosition.FORWARDER)) {
            return new Forwarder();
        } else {
            throw new  RuntimeException("Can't create the position: " + position);
        }
    }
}
