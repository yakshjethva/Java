package BasicDemo;

import java.io.Serializable;
import java.util.*;


class Character implements Serializable {  
    private transient String name;
    private int level;
    private int score;
    private String date;

    Character(String name, int level, int score,String date) {
        this.name = name;
        this.level = level;
        this.score = score;
        this.date = date;
    }

    public String toString() {
        return "Name: " + name + ", Level: " + level + ", Score: " + score + ", Date: " + date;
    }
}
