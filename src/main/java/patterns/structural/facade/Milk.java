package patterns.structural.facade;

public class Milk {
    private boolean aBoolean;

    public boolean isaBoolean(){
        return aBoolean;
    }

    public void addMilk(){
        System.out.println("Milk was added");
        aBoolean = true;
    }

    public void removeMilk(){
        System.out.println("Water was used");
        aBoolean = false;
    }
}
