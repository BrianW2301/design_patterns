package decorator;
/**
 * @author Brian
 */
public class Hat extends CharacterDecorator{
    /**
     * Hat cnostructor
     * Takes a Character, passes it to CharacterDecerator, 
     * and adds a hat to the Character
     * @param character
     */
    public Hat(Character character){
        super(character);
        customize();
    }
    /**
     * Adds a hat to a potato head Character by 
     * changing the designated Strings in the sections ArrayList
     */
    public void customize(){
        sections.set(0, "    ____");
        sections.set(1, " __|____|____");
    }
}
