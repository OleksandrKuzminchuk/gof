package custom_realization_patterns.creational.builder;

public class LGPhoneBuilder extends PhoneBuilder {
    @Override
    void buildBrand() {
        phone.setBrand(Brand.LG);
    }

    @Override
    void buildModel() {
        phone.setModel("Optimus");
    }

    @Override
    void buildPrice() {
        phone.setPrice(400);
    }
}
