package custom_realization_patterns.creational.builder;

public abstract class PhoneBuilder {
    protected Phone phone;
    void createPhone(){this.phone = new Phone();}
    abstract void buildBrand();
    abstract void buildModel();
    abstract void buildPrice();
    Phone getPhone(){return phone;}
}
