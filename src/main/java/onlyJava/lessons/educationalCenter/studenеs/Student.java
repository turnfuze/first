package onlyJava.lessons.educationalCenter.studenеs;

import onlyJava.lessons.educationalCenter.Days;
import onlyJava.lessons.educationalCenter.subject.Subject;

import java.util.Set;

public class Student {
    private String name;
    private String group;
    private Set<Subject> subject;
    private Days[] workerDays;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public Student(String name, Set<Subject> subject, Days[] workerDays) {
        this.name = name;
        this.subject = subject;
        this.workerDays = workerDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "\n" + "  " + "Students: " + name + " have subjects: " + subject;
    }
}
