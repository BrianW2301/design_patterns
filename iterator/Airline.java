package iterator;

public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title){
        this.title = title;
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
        
    }

    public String getTitle(){
        return title;
    }

    private Flight[] growArray(Flight[] flights){

    }

    public FlightIterator createIterator(){

    }
}
