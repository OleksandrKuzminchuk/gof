package custom_realization_patterns.creational.abstractfactory.companyru;

import custom_realization_patterns.creational.abstractfactory.Customer;

public class CustomerCompany implements Customer {
    @Override
    public void buyProduct() {
        System.out.println("Покупатель покупает продукты");
    }
}
