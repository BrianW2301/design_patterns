/**
 * @author Brian
 */
package factory;

public class LogCabinPlan extends HousePlan{
    /**
     * Constructor for LogCabinPlan
     * Creates a HousePlan with preset room, window, and square feet data
     * for building a log cabin
     */
    public LogCabinPlan(){
        super(2, 10, 1800);
    }
    /**
     * Fills the meterials ArrayList with the materials used to build a log cabin
     */
    protected void setMaterials(){
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }
    /**
     * Fills the features ArrayList with the features of a log cabin
     */
    protected void setFeatures(){
        features.add("Timbered Room");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }
    /**
     * Creates a String that lables the HousePlan a log cabin, 
     * then calls super.toString to append the details of a log cabin to the end
     * @return a String that lists all the details of a log cabin
     */
    public String toString(){
        return ("Log Cabin" +super.toString());
    }
}
