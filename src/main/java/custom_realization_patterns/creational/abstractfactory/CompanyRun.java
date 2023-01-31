package custom_realization_patterns.creational.abstractfactory;

import custom_realization_patterns.creational.abstractfactory.companyeu.CompanyTeamFactoryEU;
import custom_realization_patterns.creational.abstractfactory.companyru.CompanyTeamFactoryRU;

public class CompanyRun {
    public static void main(String[] args) {
        CompanyTeamFactory productTeamFactory = createCompanyTeamFactoryByLanguage(TypeLanguage.EU);
        Supplier supplier = productTeamFactory.getSupplier();
        Employee employee = productTeamFactory.getEmployee();
        Customer customer = productTeamFactory.getCustomer();

        supplier.supplyProduct();
        employee.makeJob();
        customer.buyProduct();
    }

    static CompanyTeamFactory createCompanyTeamFactoryByLanguage(TypeLanguage typeLanguage){
        if (typeLanguage.equals(TypeLanguage.EU)){
            System.out.println("Company crm system is running");
            return new CompanyTeamFactoryEU();
        } else if (typeLanguage.equals(TypeLanguage.RU)) {
            System.out.println("Система управления компании запускается");
            return new CompanyTeamFactoryRU();
        }else {
            throw new RuntimeException("Not support a language: " + typeLanguage.name());
        }
    }
}
