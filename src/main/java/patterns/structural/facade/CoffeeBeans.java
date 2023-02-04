package patterns.structural.facade;

public class CoffeeBeans {
    private boolean coffeeBeans;

    public boolean isCoffeeBeans(){
        return coffeeBeans;
    }

    public void addCoffeeBeans(){
        System.out.println("water was added");
        coffeeBeans = true;
    }

    public void removeCoffeeBeans(){
        System.out.println("Water was used");
        coffeeBeans = false;
    }
}
