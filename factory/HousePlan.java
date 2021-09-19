/**
 * @author Brian
 */
package factory;
import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    /**
     * Constructor for HousePlan
     * Creates a house plan based on the input parameters
     * Initializes materials ArrayList
     * Initializes features ArrayList
     * Runs setMaterials
     * Runs setFeatures
     * @param Intiger specifying how many rooms the house has
     * @param Intiger specifying how many windows the house has
     * @param Intiger specifying how many square feet the house has
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet){
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
        setMaterials();
        setFeatures();
    }
    /**
     * Abstract method for filling the materials ArrayList
     */
    protected abstract void setMaterials();
    /**
     * Abstract method for filling the features ArrayList
     */
    protected abstract void setFeatures();
    /**
     * Get method for materials ArrayList
     * @return materials ArrayList
     */
    public ArrayList<String> getMaterials(){
        return materials;
    }
    /**
     * Get method for features ArrayList
     * @return features ArrayList
     */
    public ArrayList<String> getFeatures(){
        return features;
    }
    /**
     * Get method for the number of rooms in a house
     * @return number of rooms in a house
     */
    public int getNumRooms(){
        return numRooms;
    }
    /**
     * Get method for the number of windows in a house
     * @return number of windows in a house
     */
    public int getNumWindows(){
        return numWindows;
    }
    /**
     * Get method for the number of square feet in a house
     * @return number of square feet in a house
     */
     public int getSquareFeet(){
        return squareFeet;
    }
    /**
     * Organizes all of the details of a house into an easy to understand String
     * @return a String that lays out all the details of a house
     */
    public String toString(){
        String string = "";
        string += "\nSquare Feet: "+squareFeet;
        string += "\nRoom: " +numRooms;
        string += "\nWindows: " +numWindows;
        string += "\n\nMaterials:";
        for (String material : materials){
            string += "\n - "+material;
        }
        string += "\n\nFeatures:";
        for (String feature : features){
            string += "\n - "+feature;
        }
        string += "\n";
        return string;
    }
}