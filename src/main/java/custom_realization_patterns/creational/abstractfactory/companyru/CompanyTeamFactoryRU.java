package custom_realization_patterns.creational.abstractfactory.companyru;

import custom_realization_patterns.creational.abstractfactory.Customer;
import custom_realization_patterns.creational.abstractfactory.Employee;
import custom_realization_patterns.creational.abstractfactory.CompanyTeamFactory;
import custom_realization_patterns.creational.abstractfactory.Supplier;

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
