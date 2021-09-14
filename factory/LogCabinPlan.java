package factory;

public class LogCabinPlan extends HousePlan{
    public LogCabinPlan(){
        super(2, 10, 1800);
    }
    protected void setMaterials(){
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }
    protected void setFeatures(){
        features.add("Timbered Room");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }
    public String toString(){
        
    }
}
