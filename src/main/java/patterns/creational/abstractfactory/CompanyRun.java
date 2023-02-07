package patterns.creational.abstractfactory;

import static patterns.creational.abstractfactory.AbstractCompanyTeamFactory.getCompanyTeamFactoryByLanguage;
import static patterns.creational.abstractfactory.TypeLanguage.EU;

public class CompanyRun {
    public static void main(String[] args) {
        CompanyTeamFactory productTeamFactory = getCompanyTeamFactoryByLanguage(EU);

        productTeamFactory.getSupplier().supplyProduct();
        productTeamFactory.getEmployee().makeJob();
        productTeamFactory.getCustomer().buyProduct();
    }
}
