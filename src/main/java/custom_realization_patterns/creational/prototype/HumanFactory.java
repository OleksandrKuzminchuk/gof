package custom_realization_patterns.creational.prototype;

public class HumanFactory {
    private Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
    public Human clone(){
        return human.copy();
    }
}
