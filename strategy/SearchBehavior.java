package strategy;
/**
 * Interface for different search algorithms
 * @author Brian
 * 
 */
import java.util.ArrayList;

public interface SearchBehavior {
    public boolean contains(ArrayList<String> data, String item);
}