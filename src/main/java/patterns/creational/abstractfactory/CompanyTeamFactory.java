package patterns.creational.abstractfactory;

public interface CompanyTeamFactory {
    Employee getEmployee();
    Customer getCustomer();
    Supplier getSupplier();
}
