package iterator;

public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight (String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom(){
        return from;
    }

    public String getTo(){
        return to;
    }

    public int getDuration(){
        return duration;
    }

    public int getNumTransfers(){
        return transfers;
    }

    public String toString(){
        String string="";
        string+= "Flight Number: " +flightNum;
        string+= "\nFrom: " +from;
        string+= "\nTo: " +to;
        string+= "\nDuration: " +duration/60 +" hours" +duration%60 +" minutes";
        string+= "\n"+transfers +"Transfers";
        return string;
    }


}
