/**
 * @author Brian
 */
package factory;

public class ContemporaryPlan extends HousePlan {
    /**
     * Constructor for ContemporaryPlan
     * Creates a HousePlan with preset room, window, and square feet data
     * for building a contemporary home
     */
    public ContemporaryPlan(){
        super(5, 40, 3000);
    }
    /**
     * Fills the meterials ArrayList with the materials used to build a contemporary home
     */
    protected void setMaterials(){
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composits");
    }
    /**
     * Fills the features ArrayList with the features of a contemporary home
     */
    protected void setFeatures(){
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }
    /**
     * Creates a String that lables the HousePlan a contemporary home, 
     * then calls super.toString to append the details of a contemporary home to the end
     * @return a String that lists all the details of a contemporary home
     */
    public String toString(){
        return ("Contemporary Home" +super.toString());
    }
}
