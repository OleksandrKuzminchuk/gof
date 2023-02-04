package patterns.structural.flyweight.example2;

import java.util.List;
import java.util.Random;

public class Main {
    private static final Integer PHONE_TYPES = 2;
    private static final Integer PHONES_TO_INSERT = 10_000_000;
    public static void main(String[] args) {
        Store store = new Store();
        for (int i = 0; i < PHONES_TO_INSERT / PHONE_TYPES; i++){
            store.storePhone(getRandomSamsung(), getRandomPrice(), "SAMSUNG", "Made South Korea");
            store.storePhone(getRandomApple(), getRandomPrice(), "APPLE", "Made USA");
        }

        System.out.println(PHONES_TO_INSERT + " Phones Inserted");
        System.out.println("===============================================");
        System.out.println("Memory Usage: ");
        System.out.println("Phone Size (20 bytes) * " + PHONES_TO_INSERT + " + PhoneTypes Size (30 bytes) * " + PHONE_TYPES + "");
        System.out.println("=====================================================================================================");
        System.out.println("Total: " + ((PHONES_TO_INSERT * 20 + PHONE_TYPES * 30) / 1024 / 1024) + "MB (instead of "
        + ((PHONES_TO_INSERT * 50) / 1024 / 1024) + "MB)");
        store.displayPhones();

    }

    private static String getRandomSamsung(){
        List<String> phones =
                List.of("Galaxy A-51", "", "Galaxy A-50", "Galaxy G-50", "Galaxy G-52", "Galaxy A-52", "Galaxy A-53", "Galaxy A-60", "Galaxy A-70", "Galaxy A-80");
        return phones.get(new Random().nextInt(phones.size()));
    }
    private static String getRandomApple(){
        List<String> phones =
                List.of("Iphone 10 pro", "", "Iphone 10 pro max", "Iphone 11 pro", "Iphone 11 pro max", "Iphone 12 pro", "Iphone 12 pro max", "Iphone 13 pro", "Iphone 13 pro max", "Iphone 14 pro", "Iphone 14 pro max");
        return phones.get(new Random().nextInt(phones.size()));
    }
    private static double getRandomPrice(){
        return new Random().nextDouble(3000, 80000);
    }
}
