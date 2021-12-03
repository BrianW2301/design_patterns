import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

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

    public String getLastName() {
        String lastName = "";
        for (int i = getFirstName().length() + 1; i < record.getName().length(); i++) {
            lastName += record.getName().charAt(i);
        }
        return lastName;
    }

    public Date getBirthday() {
        return record.getBirthdate();
    }

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

    public String toString() {
        String string = "";
        string += "***** " + getFirstName() + " *****\n";
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
