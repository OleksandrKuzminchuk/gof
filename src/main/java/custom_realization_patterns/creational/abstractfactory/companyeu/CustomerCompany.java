package custom_realization_patterns.creational.abstractfactory.companyeu;

import custom_realization_patterns.creational.abstractfactory.Customer;

public class CustomerCompany implements Customer {
    @Override
    public void buyProduct() {
        System.out.println("Customer buys company goods");
    }
}
