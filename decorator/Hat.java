package decorator;
/**
 * @author Brian
 */
public class Hat extends CharacterDecorator{
    /**
     * Hat cnostructor
     * Takes a Character, passes it to CharacterDecerator to add a hat
     * @param character
     */
    public Hat(Character character){
        super(character);
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
