package educationalCenter.subject;

public class Subject {
    private final String subject;
    private final int hours;

    public Subject(String subject, int hours) {
        this.subject = subject;
        this.hours = hours;
    }

    public String getSubject() {
        return subject;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "\n" +"    "+ subject +" - "+
                hours + " hours";
    }
}
