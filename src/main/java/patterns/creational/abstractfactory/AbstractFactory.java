package patterns.creational.abstractfactory;

public interface AbstractFactory {
    CompanyTeamFactory getCompanyTeamFactory(TypeLanguage typeLanguage);
}
