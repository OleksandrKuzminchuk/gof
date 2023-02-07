package patterns.creational.singleton;

public class EmployeeFactorySingleton {
    private static EmployeeFactorySingleton INSTANCE = null;
    private EmployeeFactorySingleton() {
    }
    public static EmployeeFactorySingleton getInstance(){
        if (INSTANCE == null){
            synchronized (EmployeeFactorySingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new EmployeeFactorySingleton();
                }
            }
        }
        return INSTANCE;
    }

    public EmployeeFactory createEmployeeByPosition(TypePosition position){
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
