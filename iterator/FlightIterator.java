package iterator;
import java.util.Iterator;
/**
 * @author Brian
 */
public class FlightIterator implements Iterator<Flight>{
    private Flight[] flights;
    private int position = 0;
    /**
     * FlightIterator constructor
     * @param takes in an array of Flights
     */
    public FlightIterator(Flight[] flights){
        this.flights = flights;
    }
    /**
     * Checks if the Flight array has another Flight after the current relative position
     * @return a boolean of whether or not there is another flight in the array
     */
    public boolean hasNext() {
		return (position < flights.length && flights[position] != null);
    }
    /**
     * Returns the next flight in the array as long as hasNext is true
     * Increases position by 1
     * @return the next flight
     */
    public Flight next(){
        if (hasNext()){
            Flight flight = flights[position];
		position++;
		return flight;
        }
        return null;

    }
}
