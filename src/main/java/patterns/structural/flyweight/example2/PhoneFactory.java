package patterns.structural.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

public class PhoneFactory {
    private static final Map<String, PhoneType> BOOK_TYPES = new HashMap<>();

    public static PhoneType getPhoneTypes(String type, String description){
        return BOOK_TYPES.computeIfAbsent(type, s -> new PhoneType(type, description));
    }
}
