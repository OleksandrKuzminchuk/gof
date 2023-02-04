package patterns.structural.flyweight.example2;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Phone> phones = new ArrayList<>();
    public void storePhone(String name, double price, String type, String description){
        PhoneType phoneType = PhoneFactory.getPhoneTypes(type, description);
        phones.add(new Phone(name, price, phoneType));
    }
    public void displayPhones(){
        phones.forEach(System.out::println);
    }
}
