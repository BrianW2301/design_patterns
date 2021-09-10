package decorator;

public class Mouth extends CharacterDecerator{
    public Mouth(Character character){
        super(character);
        customize();
    }
    public void customize(){
        sections.set(5, "  \\ ---- / ");
    }
}
