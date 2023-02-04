package patterns.structural.facade;

public class Water {
    private boolean aBoolean;

    public boolean isaBoolean(){
        return aBoolean;
    }

    public void addWater(){
        System.out.println("water was added");
        aBoolean = true;
    }

    public void removeWater(){
        System.out.println("Water was used");
        aBoolean = false;
    }
}
