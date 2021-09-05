package strategy;
/**
 * Binary search algorithm for guest list
 * @author Brian
 * 
 */


import java.util.ArrayList;
import java.util.Collections;


public class BinarySearch implements SearchBehavior{
    
    /**
     * Uses a binary search algorithm to search through an array list
     * 
     * I referenced an old textbook for help with the search algorithm. "Data Structures and Other Objects Using Java" -Michael Main
     * 
     * @param ArrayList that is being searched
     * @param String that is being searched for in the array list
     * @return Boolean of if the array list contains the specified string
     */
    public boolean contains(ArrayList<String> data, String item){

    Collections.sort(data);
    int size=data.size();
    int middle=size/2;
    int low=0;
    int high=size-1;
    while(low<=high){
      if(data.get(middle).equalsIgnoreCase(item)){
        return true;
      }
      if(data.get(middle).compareTo(item)<0)
        low=middle+1;
      else
        high=middle-1;
      middle+=(high-low);
    }
    return false;
    
    }
}
