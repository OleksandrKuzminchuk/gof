package patterns.creational.abstractfactory.companyeu;

import patterns.creational.abstractfactory.Supplier;

public class SupplierCompany implements Supplier {
    @Override
    public void supplyProduct() {
        System.out.println("Supplier sells company goods");
    }
}
