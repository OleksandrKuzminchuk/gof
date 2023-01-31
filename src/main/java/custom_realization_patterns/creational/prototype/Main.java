package custom_realization_patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Mikel", "Guvi", 45);
        System.out.println(human);
        System.out.println("================================");
        HumanFactory humanFactory = new HumanFactory(human);
        Human clone = humanFactory.clone();
        System.out.println(clone);
    }
}
