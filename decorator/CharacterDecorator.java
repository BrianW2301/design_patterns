package decorator;
/**
 * @author Brian
 */
public abstract class CharacterDecorator extends Character{
    protected Character character;
    /**
     * CharacterDecorator constructor
     * Takes a sections ArrayList from a Character and 
     * copies it to the CharacterDecorator sections ArrayList
     * @param character
     */
    public CharacterDecorator (Character character){
        this.character = character;
        for (int i=0; i<character.sections.size();i++){
            this.sections.add(character.sections.get(i));
        }
    }
    public abstract void customize();
}