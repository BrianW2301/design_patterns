package decorator;
/**
 * @author Brian
 */
public class PotatoeHead extends Character{
    /**
     * PotatoeHead constructor
     * Creates a blank potato head using Strings in the sections ArrayList
     */
    public PotatoeHead(){
        sections.add("");
        sections.add("    ____");
        sections.add("  /      \\ ");
        sections.add(" |        | ");
        sections.add(" |        | ");
        sections.add("  \\      / ");
        sections.add("   \\____/ ");
    }
}
