package patterns.creational.abstractfactory;

import static patterns.creational.abstractfactory.TypeLanguage.EU;

public class CompanyRun {
    public static void main(String[] args) {
        CompanyFactory companyFactory = new CompanyFactory();
        CompanyTeamFactory productTeamFactory = companyFactory.getCompanyTeamFactory(EU);

        productTeamFactory.getSupplier().supplyProduct();
        productTeamFactory.getEmployee().makeJob();
        productTeamFactory.getCustomer().buyProduct();
    }
}
