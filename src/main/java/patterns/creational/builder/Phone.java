package patterns.creational.builder;

public class Phone {
    private Brand brand;
    private String model;
    private Integer price;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand=" + brand +
                ", model=" + model +
                ", price=" + price +
                '}';
    }
}

