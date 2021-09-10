package decorator;

import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;

    public Character(){
        sections = new ArrayList<String>();
    }
    public void draw(){
        for (String sections1 : sections) {
            System.out.println(sections1);
    }
    }
}