import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;

    /**
     * Constructs a Medical Record Adapter with a given Health Record.
     * 
     * @param HealthRecord to be adapted
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * Parses the full name from the HealthRecord and returns everything before the
     * first space as the patients first name.
     * 
     * @returns the patients first name
     */
    public String getFirstName() {
        String firstName = "";
        for (int i = 0; i < record.getName().length(); i++) {
            if (record.getName().charAt(i) != ' ') {
                firstName += record.getName().charAt(i);
            } else
                break;
        }
        return firstName;
    }

    /**
     * Returns everything from the patients full name in the health record after the
     * index given by the length of their first name + 1.
     * 
     * @returns the patients last name
     */
    public String getLastName() {
        String lastName = "";
        for (int i = getFirstName().length() + 1; i < record.getName().length(); i++) {
            lastName += record.getName().charAt(i);
        }
        return lastName;
    }

    /**
     * @returns the birthday from the Health Record
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * Converts the patients gender from a string to an enum.
     * 
     * @returns the patients gender
     */
    public Gender getGender() {
        if (record.getGender().equals("Male")) {
            return Gender.MALE;
        }
        if (record.getGender().equals("Female")) {
            return Gender.FEMALE;
        } else
            return Gender.OTHER;
    }

    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    /**
     * Converts the HealthRecord's history array of strings into an array of visits.
     * 
     * Uses information obtained using substrings from each string at predetermined
     * indexes since the format of the strings is known.
     * 
     * @returns the visit ArrayList
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visits = new ArrayList<Visit>();
        for (String visit : record.getHistory()) {

            Date date = makeDate(Integer.parseInt(visit.substring(19, 23)), Integer.parseInt(visit.substring(15, 17)),
                    Integer.parseInt(visit.substring(11, 13)));

            Boolean well = false;
            if (visit.substring(24, 28).equals("Well")) {
                well = true;
            }
            String description = visit.substring(51);

            visits.add(new Visit(date, well, description));
        }
        return visits;
    }

    /**
     * Formats the petients new medical record into a readable string.
     */
    public String toString() {
        String string = "";
        string += "***** " + getFirstName() + " " + getLastName() + " *****\n";
        string += "Birthday: " + getBirthday() + "\n";
        string += "Gender: " + getGender() + "\n";
        string += "Medical Visit History:\n";

        for (Visit visit : getVisitHistory()) {
            string += visit;
        }

        return string;
    }

    /**
     * Stolen from driver
     * Creates a new Date
     * 
     * @param year  The Year of the date
     * @param month The month of the date
     * @param day   The day of the date
     */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }
}
