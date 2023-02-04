package patterns.structural.facade;

public class RangCoffee {
    Water water = new Water();
    Milk milk = new Milk();
    CoffeeBeans coffeeBeans = new CoffeeBeans();
    
    void doLatte(){
        water.addWater();
        milk.addMilk();
        coffeeBeans.addCoffeeBeans();
        System.out.println("Latte is doing...");
        water.removeWater();
        milk.removeMilk();
        coffeeBeans.removeCoffeeBeans();
        System.out.println("Latte was done");
    }

}
