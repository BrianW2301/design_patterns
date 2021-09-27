package iterator;
/**
 * @author Brian
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size;
    /**
     * Airline constructor
     * Initializes the flights array
     * @param title of the Airline
     */
    public Airline(String title){
        this.title = title;
        flights = new Flight[0];
        size = 0;
    }
    /**
     * Adds a flight to the array of flights
     * If the array is full, growArray is called and flights is replaced with the new array
     * Increases size by 1
     * @param flight number
     * @param where the flight flying from
     * @param where the flight is flying to
     * @param how long the flight will take
     * @param how many flight transfers if any to get to the destination
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
        if (size <= flights.length)
            flights = growArray(flights);
        flights[size] = new Flight(flightNum, from, to, duration, transfers);
        size++;
    }
    /**
     * Get method for the title of an airline
     * @return the title of the Airline
     */
    public String getTitle(){
        return title;
    }
    /**
     * Creates a new flight array with double the size and copies all of the previous flights to the new array
     * @param original flight array
     * @return new flight array
     */
    private Flight[] growArray(Flight[] flights){
        Flight[] newFlights = new Flight[flights.length*2+1];
        System.arraycopy(flights, 0, newFlights, 0, flights.length);
        return newFlights;
    }
    /**
     * Creates a new FlightIterator for the flights array
     * @return FlightIterator object 
     */
    public FlightIterator createIterator(){
        return new FlightIterator(flights);
    }
}
