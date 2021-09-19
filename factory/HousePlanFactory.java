/**
 * @author Brian
 */
package factory;

public class HousePlanFactory{
    /**
     * Creates a new house plan based on the input of the user
     * @param String that denotes what type of house to create
     * @return The specified house plan
     */
    public static HousePlan createHousePlan(String type){
        if (type.equalsIgnoreCase("log cabin")){
            return new LogCabinPlan();}
        else if (type.equalsIgnoreCase("Tiny Home")){
            return new TinyHomePlan();}
        else if (type.equalsIgnoreCase("contemporary home")){
            return new ContemporaryPlan();}
        return null;
    }
}
