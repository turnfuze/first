package educationalCenter.subject;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject1 = (Subject) o;
        return hours == subject1.hours && Objects.equals(subject, subject1.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, hours);
    }

    @Override
    public String toString() {
        return "\n" +"    "+ subject +" - "+
                hours + " hours";
    }
}
