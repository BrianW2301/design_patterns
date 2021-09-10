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
        super.sections.add("");
        super.sections.add("    ____");
        super.sections.add("  /      \\ ");
        super.sections.add(" |        | ");
        super.sections.add(" |        | ");
        super.sections.add("  \\      / ");
        super.sections.add("   \\____/ ");
    }
}
