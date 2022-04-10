package educationalCenter.studenеs;

import educationalCenter.subject.Subject;

import java.util.Arrays;

public class Student {
    private String name;
    private String group;
    private Subject[] subject;

//    public Student(String name, String group) {
//        this.name = name;
//        this.group = group;
//    }

    public Student(String name, Subject[] subject) {
        this.name = name;
        this.subject = subject;
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
        return "\n" + "  " + "Students: " + name + " have subjects: " +
                Arrays.toString(subject);
    }
}
