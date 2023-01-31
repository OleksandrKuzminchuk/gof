package custom_realization_patterns.creational.abstractfactory.companyeu;

import custom_realization_patterns.creational.abstractfactory.Supplier;

public class SupplierCompany implements Supplier {
    @Override
    public void supplyProduct() {
        System.out.println("Supplier sells company goods");
    }
}
