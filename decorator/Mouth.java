package decorator;
/**
 * @author Brian
 */
public class Mouth extends CharacterDecorator{
    /**
     * Mouth constructor
     * Takes a Character, passes it to CharacterDecerator to add a mouth
     * @param character
     */
    public Mouth(Character character){
        super(character);
    }
    /**
     * Adds a mouth to a potato head Character by 
     * changing the designated String in the sections ArrayList
     */
    public void customize(){
        sections.set(5, "  \\ ---- / ");
    }
}
