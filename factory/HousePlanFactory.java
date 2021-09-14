package factory;

public class HousePlanFactory{
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
