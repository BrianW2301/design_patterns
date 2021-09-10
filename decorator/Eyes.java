package decorator;

public class Eyes extends CharacterDecerator{
    public Eyes (Character character){
        super(character);
        customize();
    }
    public void customize(){
        sections.set(3, " |  o  o  | ");
    }
}
