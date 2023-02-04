package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.companyeu.CompanyTeamFactoryEU;
import patterns.creational.abstractfactory.companyru.CompanyTeamFactoryRU;

public class CompanyRun {
    public static void main(String[] args) {
        CompanyTeamFactory productTeamFactory = createCompanyTeamFactoryByLanguage(TypeLanguage.RU);
        Supplier supplier = productTeamFactory.getSupplier();
        Employee employee = productTeamFactory.getEmployee();
        Customer customer = productTeamFactory.getCustomer();

        supplier.supplyProduct();
        employee.makeJob();
        customer.buyProduct();
    }

    static CompanyTeamFactory createCompanyTeamFactoryByLanguage(TypeLanguage typeLanguage){
        if (typeLanguage.name().equalsIgnoreCase(TypeLanguage.EU.name())){
            System.out.println("Company crm system is running");
            return new CompanyTeamFactoryEU();
        } else if (typeLanguage.name().equalsIgnoreCase(TypeLanguage.RU.name())) {
            System.out.println("Система управления компании запускается");
            return new CompanyTeamFactoryRU();
        }else {
            throw new RuntimeException("Not support a language: " + typeLanguage.name());
        }
    }
}
