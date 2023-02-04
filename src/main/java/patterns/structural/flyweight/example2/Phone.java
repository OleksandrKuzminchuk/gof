package patterns.structural.flyweight.example2;

public class Phone {
    private final String name;
    private final double price;
    private final PhoneType type;

    public Phone(String name, double price, PhoneType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
