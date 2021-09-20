package iterator;

import java.util.Iterator;

public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position;

    public FlightIterator(Flight[] flights, int position){
        this.flights = flights;
        this.position = position;
    }

    public boolean hasNext(){
        if (flights.length>position){
            return true;
        }
        else return false;
        
    }

    public Flight next(){

    }

}
