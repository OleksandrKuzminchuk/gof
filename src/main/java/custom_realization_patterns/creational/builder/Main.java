package custom_realization_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        PhoneManager phoneManager = new PhoneManager();
        phoneManager.setBuilder(new LGPhoneBuilder());
        System.out.println(phoneManager.buildPhone());
    }
}
