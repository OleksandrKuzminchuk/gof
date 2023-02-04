package patterns.behavioral.memento;

import java.util.Date;

public class Game {
    private String level;
    private Date date;
    public void create(String level){
        this.level = level;
        this.date = new Date();
    }
    public Save save(){
        return new Save(level, date);
    }
    public void load(Save save){
        this.level = save.getLevel();
        this.date = save.getDate();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", date=" + date +
                '}';
    }
}
