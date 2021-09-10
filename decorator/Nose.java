package decorator;
/**
 * @author Brian
 */
public class Nose extends CharacterDecorator{
    /**
     * Nose constructor
     * Takes a Character, passes it to CharacterDecerator, 
     * and adds a nose to the Character
     * @param character
     */
    public Nose(Character character){
        super(character);
        customize();
    }
    /**
     * Adds a nose to a potato head Character by 
     * changing the designated String in the sections ArrayList
     */
    public void customize(){
        sections.set(4, " |   >    | ");
    }
}
