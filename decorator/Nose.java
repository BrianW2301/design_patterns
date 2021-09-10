package decorator;

public class Nose extends CharacterDecerator{
    public Nose(Character character){
        super(character);
        customize();
    }
    public void customize(){
        sections.set(4, " |   >    | ");
    }
}
