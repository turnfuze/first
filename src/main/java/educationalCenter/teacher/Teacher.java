package educationalCenter.teacher;

import educationalCenter.studenеs.Student;

import java.util.Arrays;

public class Teacher {
    private String name;
    private String subject;
    private Student[] students;

    public Teacher(String name, String subject,Student[] students) {
        this.name = name;
        this.subject = subject;
        this.students = students;
    }

    public Teacher(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher "+ name  +
                " have student list: '" + Arrays.toString(students) + '\'' +
                '}';
    }
}
