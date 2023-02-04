package patterns.creational.abstractfactory.companyru;

import patterns.creational.abstractfactory.Employee;

public class LoaderCompany implements Employee {
    @Override
    public void makeJob() {
        System.out.println("Грузчик грузит продукты");
    }
}
