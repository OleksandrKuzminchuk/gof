package patterns.behavioral.memento;

import java.util.Date;

public class Save {
    private final String level;
    private final Date date;

    public Save(String level, Date date) {
        this.level = level;
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }
}
