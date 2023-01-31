package custom_realization_patterns.creational.abstractfactory.companyeu;

import custom_realization_patterns.creational.abstractfactory.Employee;

public class LoaderCompany implements Employee {
    @Override
    public void makeJob() {
        System.out.println("Loader picks up company goods...");
    }
}
