package strategy;
import java.util.ArrayList;
import java.util.Collections;
/**
 * A list of guests stored in an array list
 * @author Brian
 * 
 */
public class GuestList {
    private String title;
    private ArrayList<String> people= new ArrayList<>();
    SearchBehavior searchBehavior;
/**
 * Creates a GuestList
 * @param String that titles the GuestList
 */
     public GuestList(String title){
         this.searchBehavior=new LinearSearch();
         this.people=new ArrayList<>();
         this.title=title;
  }
/**
 * checks if a person with a given name is already on the guest list. Adds them if false
 * @param The string name of the guest
 * @return a boolean of if person was added to the list
 */
     public boolean add(String person){
          if (people.contains(person)){
              return false;
          }
          people.add(person);
          return true;
     }
/**
 * checks if a person with a given name is already on the guest list. Removes them if true
 * @param The string name of the guest
 * @return a boolean of if person was removed from the list
 */
     public boolean remove(String person){
         if (people.contains(person)){
             people.remove(person);
             return true;
         }
         return false;
     }
/**
 * accessor method for title of a GuestList
 * @return the title of the GuestList
 */
    public String getTitle(){
        return title;
    }
/**
 * change the search algorithm type
 * @param SearchBehavior type
 */
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior=searchBehavior;
    }
/**
 * accessor method for the GuestList ArrayList
 * @return the ArrayList containing guest's names
 */
    public ArrayList<String> getList(){
        Collections.sort(people);
        return people;
    }
    
    
}
