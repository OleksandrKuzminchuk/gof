package patterns.creational.builder;

public class LenovoPhoneBuilder extends PhoneBuilder {
    @Override
    void buildBrand() {
        phone.setBrand(Brand.LENOVO);
    }

    @Override
    void buildModel() {
        phone.setModel("Tab 8");
    }

    @Override
    void buildPrice() {
        phone.setPrice(300);
    }
}
