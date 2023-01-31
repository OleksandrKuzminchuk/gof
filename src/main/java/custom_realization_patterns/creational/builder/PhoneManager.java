package custom_realization_patterns.creational.builder;

public class PhoneManager {
    PhoneBuilder builder;
    void setBuilder(PhoneBuilder phoneBuilder){this.builder = phoneBuilder;}
    Phone buildPhone(){
        builder.createPhone();
        builder.buildBrand();
        builder.buildModel();
        builder.buildPrice();
        return builder.getPhone();
    }
}
