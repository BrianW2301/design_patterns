package decorator;

public class Hat extends CharacterDecerator{
    public Hat(Character character){
        super(character);
        customize();
    }
    public void customize(){
        sections.set(0, "    ____");
        sections.set(1, " __|____|____");
    }
}