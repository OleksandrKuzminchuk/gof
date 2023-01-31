package custom_realization_patterns.creational.abstractfactory.companyru;

import custom_realization_patterns.creational.abstractfactory.Employee;

public class LoaderCompany implements Employee {
    @Override
    public void makeJob() {
        System.out.println("Грузчик грузит продукты");
    }
}
