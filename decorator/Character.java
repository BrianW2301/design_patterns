package decorator;
/**
 * @author Brian
 */
import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;
    /**
     * Character constructor
     * Initializes sections ArrayList
     */
    public Character(){
        sections = new ArrayList<String>();
    }
    /**
     * Draws a character by looping through the 
     * sections ArrayList and printing the Strings
     */
    public void draw(){
        for (String section : sections) {
            System.out.println(section);
        }
    }
}