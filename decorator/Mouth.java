package decorator;
/**
 * @author Brian
 */
public class Mouth extends CharacterDecorator{
    /**
     * Mouth constructor
     * Takes a Character, passes it to CharacterDecerator, 
     * and adds a mouth to the Character
     * @param character
     */
    public Mouth(Character character){
        super(character);
        customize();
    }
    /**
     * Adds a mouth to a potato head Character by 
     * changing the designated String in the sections ArrayList
     */
    public void customize(){
        sections.set(5, "  \\ ---- / ");
    }
}
