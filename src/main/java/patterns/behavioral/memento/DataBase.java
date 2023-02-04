package patterns.behavioral.memento;

public class DataBase {
    Save save;
    public Save getSave(){return save;}

    public void setSave(Save save) {
        this.save = save;
    }
}
