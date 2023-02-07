package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.companyeu.CompanyTeamFactoryEU;
import patterns.creational.abstractfactory.companyru.CompanyTeamFactoryRU;

import static patterns.creational.abstractfactory.TypeLanguage.EU;
import static patterns.creational.abstractfactory.TypeLanguage.RU;

public class CompanyFactory implements AbstractFactory {
    @Override
    public CompanyTeamFactory getCompanyTeamFactory(TypeLanguage typeLanguage) {
        if (typeLanguage.name().equalsIgnoreCase(RU.name())) {
            System.out.println("Система управления компании запускается");
            return new CompanyTeamFactoryRU();
        } else if (typeLanguage.name().equalsIgnoreCase(EU.name())) {

            System.out.println("Company crm system is running");
            return new CompanyTeamFactoryEU();
        } else {
            return null;
        }
    }
}
