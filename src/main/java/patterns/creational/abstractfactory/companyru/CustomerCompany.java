package patterns.creational.abstractfactory.companyru;

import patterns.creational.abstractfactory.Customer;

public class CustomerCompany implements Customer {
    @Override
    public void buyProduct() {
        System.out.println("Покупатель покупает продукты");
    }
}
