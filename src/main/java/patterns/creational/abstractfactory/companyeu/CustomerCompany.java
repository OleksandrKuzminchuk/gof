package patterns.creational.abstractfactory.companyeu;

import patterns.creational.abstractfactory.Customer;

public class CustomerCompany implements Customer {
    @Override
    public void buyProduct() {
        System.out.println("Customer buys company goods");
    }
}
