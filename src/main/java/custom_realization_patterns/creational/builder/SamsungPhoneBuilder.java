package custom_realization_patterns.creational.builder;

public class SamsungPhoneBuilder extends PhoneBuilder {
    @Override
    void buildBrand() {
        phone.setBrand(Brand.SAMSUNG);
    }

    @Override
    void buildModel() {
        phone.setModel("Galaxy");
    }

    @Override
    void buildPrice() {
        phone.setPrice(500);
    }
}
