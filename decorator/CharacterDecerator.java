package decorator;

public abstract class CharacterDecerator extends Character{
    protected Character character;

    public CharacterDecerator (Character character){
        this.character = character;
        for (int i=0; i<character.sections.size();i++){
            this.sections.add(character.sections.get(i));
        }
    }
    public abstract void customize();
}