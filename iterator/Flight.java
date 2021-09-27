package iterator;
/**
 * @author Brian
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;
    /**
     * Flight constructor
     * @param flight number
     * @param where the flight flying from
     * @param where the flight is flying to
     * @param how long the flight will take
     * @param how many flight transfers if any to get to the destination
     */
    public Flight (String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    /**
     * Get method for where the flight is coming from
     * @return where the flight flying from
     */
    public String getFrom(){
        return from;
    }
    /**
     * Get method for where the flight is going to
     * @return where the flight is flying to
     */
    public String getTo(){
        return to;
    }
    /**
     * Get method for the duration of the flight
     * @return how long the flight will take in minutes
     */
    public int getDuration(){
        return duration;
    }
    /**
     * Get method for how many transfers you will have to make
     * @return how many flight transfers if any to get to the destination
     */
    public int getNumTransfers(){
        return transfers;
    }
    /**
     * Organizes all of the flight information into an easy to read format
     * @return a formatted String
     */
    public String toString(){
        String string="";
        string+= "Flight Number: " +flightNum;
        string+= "\nFrom: " +from;
        string+= "\nTo: " +to;
        string+= "\nDuration: " +duration/60 +" hours " +duration%60 +" minutes";
        if (transfers==0) string +="\nDirect Flight";
        else string+= "\n"+transfers +" Transfer";
        if (transfers>1) string+= "s";
        return string;
    }
}
