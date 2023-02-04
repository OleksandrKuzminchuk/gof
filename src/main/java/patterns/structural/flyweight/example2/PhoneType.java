package patterns.structural.flyweight.example2;

public class PhoneType {
    private final String type;
    private final String description;

    public PhoneType(String type, String description) {
        this.type = type;
        this.description = description;
    }

    @Override
    public String toString() {
        return "PhoneType{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
