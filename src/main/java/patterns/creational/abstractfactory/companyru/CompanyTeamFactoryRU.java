package patterns.creational.abstractfactory.companyru;

import patterns.creational.abstractfactory.Customer;
import patterns.creational.abstractfactory.Employee;
import patterns.creational.abstractfactory.CompanyTeamFactory;
import patterns.creational.abstractfactory.Supplier;

public class CompanyTeamFactoryRU implements CompanyTeamFactory {
    @Override
    public Employee getEmployee() {
        return new LoaderCompany();
    }

    @Override
    public Customer getCustomer() {
        return new CustomerCompany();
    }

    @Override
    public Supplier getSupplier() {
        return new SupplierCompany();
    }
}
