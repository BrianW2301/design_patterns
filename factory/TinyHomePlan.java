/**
 * @author Brian
 */
package factory;

public class TinyHomePlan extends HousePlan {
    /**
     * Constructor for TinyHomePlan
     * Creates a HousePlan with preset room, window, and square feet data
     * for building a tiny home
     */
    public TinyHomePlan(){
        super(1, 5, 200);
    }
    /**
     * Fills the meterials ArrayList with the materials used to build a tiny home
     */
    protected void setMaterials(){
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }
    /**
     * Fills the features ArrayList with the features of a tiny home
     */
    protected void setFeatures(){
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose Areas");
        features.add("Multi-use applications");
    }
    /**
     * Creates a String that lables the HousePlan a tiny home, 
     * then calls super.toString to append the details of a tiny home to the end
     * @return a String that lists all the details of a tiny home
     */
    public String toString(){
        return ("Tiny House" +super.toString());
    }
}
