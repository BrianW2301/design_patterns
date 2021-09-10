package decorator;
/**
 * @author Brian
 */
public class Eyes extends CharacterDecorator{
    /**
     * Eyes constructor
     * Takes a Character, passes it to CharacterDecerator, 
     * and adds eyes to the Character
     * @param character
     */
    public Eyes (Character character){
        super(character);
        customize();
    }
    /**
     * Adds eyes to a potato head Character by 
     * changing the designated String in the sections ArrayList
     */
    public void customize(){
        sections.set(3, " |  o  o  | ");
    }
}
