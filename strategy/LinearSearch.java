package strategy;
/**
 * Linear search algorithm for guest list
 * @author Brian
 * 
 */

import java.util.ArrayList;

public class LinearSearch implements SearchBehavior{
    /**
     * Uses a linear search algorithm to search through an array list
     * @param ArrayList that is being searched
     * @param String that is being searched for in the array list
     * @return Boolean of if the array list contains the specified string
     */
    public boolean contains(ArrayList<String> data, String item){
        for(int i=0; i<data.size(); i++){
            if(data.equalsIgnoreCase(item))
                return true;
        }
        return false;
}
}