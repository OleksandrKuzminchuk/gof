package patterns.creational.abstractfactory;

import static patterns.creational.abstractfactory.CompanyAbstractCompany.getCompanyTeamFactoryByLanguage;
import static patterns.creational.abstractfactory.TypeLanguage.RU;

public class CompanyRun {
    public static void main(String[] args) {
        CompanyTeamFactory productTeamFactory = getCompanyTeamFactoryByLanguage(RU);
        Supplier supplier = productTeamFactory.getSupplier();
        Employee employee = productTeamFactory.getEmployee();
        Customer customer = productTeamFactory.getCustomer();

        supplier.supplyProduct();
        employee.makeJob();
        customer.buyProduct();
    }
}
